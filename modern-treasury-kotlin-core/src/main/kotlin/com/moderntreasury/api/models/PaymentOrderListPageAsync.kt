package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonMissing
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toUnmodifiable
import com.moderntreasury.api.services.async.PaymentOrderServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

class PaymentOrderListPageAsync
private constructor(
    private val paymentOrdersService: PaymentOrderServiceAsync,
    private val params: PaymentOrderListParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun items(): List<PaymentOrder> = response().items()

    fun perPage(): String = response().perPage()

    fun afterCursor(): String = response().afterCursor()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PaymentOrderListPageAsync &&
            this.paymentOrdersService == other.paymentOrdersService &&
            this.params == other.params &&
            this.response == other.response
    }

    override fun hashCode(): Int {
        return Objects.hash(
            paymentOrdersService,
            params,
            response,
        )
    }

    override fun toString() =
        "PaymentOrderListPageAsync{paymentOrdersService=$paymentOrdersService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        return true
    }

    fun getNextPageParams(): PaymentOrderListParams? {
        if (!hasNextPage()) {
            return null
        }

        return PaymentOrderListParams.builder().from(params).afterCursor(afterCursor()).build()
    }

    suspend fun getNextPage(): PaymentOrderListPageAsync? {
        return getNextPageParams()?.let { paymentOrdersService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            paymentOrdersService: PaymentOrderServiceAsync,
            params: PaymentOrderListParams,
            response: Response
        ) =
            PaymentOrderListPageAsync(
                paymentOrdersService,
                params,
                response,
            )
    }

    @JsonDeserialize(builder = Response.Builder::class)
    @NoAutoDetect
    class Response
    constructor(
        private val items: JsonField<List<PaymentOrder>>,
        private val perPage: String,
        private val afterCursor: String,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun items(): List<PaymentOrder> = items.getNullable("items") ?: listOf()

        fun perPage(): String = perPage

        fun afterCursor(): String = afterCursor

        @JsonProperty("items") fun _items(): JsonField<List<PaymentOrder>>? = items

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Response = apply {
            if (!validated) {
                items().map { it.validate() }
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Response &&
                this.items == other.items &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            return Objects.hash(items, additionalProperties)
        }

        override fun toString() =
            "PaymentOrderListPageAsync.Response{items=$items, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var items: JsonField<List<PaymentOrder>> = JsonMissing.of()
            private var perPage: String? = null
            private var afterCursor: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(page: Response) = apply {
                this.items = page.items
                this.perPage = page.perPage
                this.afterCursor = page.afterCursor
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun items(items: List<PaymentOrder>) = items(JsonField.of(items))

            @JsonProperty("items")
            fun items(items: JsonField<List<PaymentOrder>>) = apply { this.items = items }

            fun perPage(perPage: String) = apply { this.perPage = perPage }

            fun afterCursor(afterCursor: String) = apply { this.afterCursor = afterCursor }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun build() =
                Response(
                    items,
                    perPage!!,
                    afterCursor!!,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    class AutoPager
    constructor(
        private val firstPage: PaymentOrderListPageAsync,
    ) : Flow<PaymentOrder> {

        override suspend fun collect(collector: FlowCollector<PaymentOrder>) {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.items().size) {
                    collector.emit(page.items()[index++])
                }
                page = page.getNextPage() ?: break
                index = 0
            }
        }
    }
}
