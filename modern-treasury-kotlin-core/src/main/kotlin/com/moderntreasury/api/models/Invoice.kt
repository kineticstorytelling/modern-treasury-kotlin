package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonMissing
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toUnmodifiable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

@JsonDeserialize(builder = Invoice.Builder::class)
@NoAutoDetect
class Invoice
private constructor(
    private val id: JsonField<String>,
    private val object_: JsonField<String>,
    private val liveMode: JsonField<Boolean>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val contactDetails: JsonField<List<ContactDetail>>,
    private val counterpartyId: JsonField<String>,
    private val counterpartyBillingAddress: JsonField<CounterpartyBillingAddress>,
    private val counterpartyShippingAddress: JsonField<CounterpartyShippingAddress>,
    private val currency: JsonField<Currency>,
    private val description: JsonField<String>,
    private val dueDate: JsonField<OffsetDateTime>,
    private val invoicerAddress: JsonField<InvoicerAddress>,
    private val originatingAccountId: JsonField<String>,
    private val hostedUrl: JsonField<String>,
    private val number: JsonField<String>,
    private val paymentOrders: JsonField<List<PaymentOrder>>,
    private val pdfUrl: JsonField<String>,
    private val status: JsonField<Status>,
    private val totalAmount: JsonField<Long>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun id(): String = id.getRequired("id")

    fun object_(): String = object_.getRequired("object")

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    fun liveMode(): Boolean = liveMode.getRequired("live_mode")

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /** The invoicer's contact details displayed at the top of the invoice. */
    fun contactDetails(): List<ContactDetail> = contactDetails.getRequired("contact_details")

    /** The ID of the counterparty receiving the invoice. */
    fun counterpartyId(): String = counterpartyId.getRequired("counterparty_id")

    /** The counterparty's billing address. */
    fun counterpartyBillingAddress(): CounterpartyBillingAddress? =
        counterpartyBillingAddress.getNullable("counterparty_billing_address")

    /** The counterparty's shipping address where physical goods should be delivered. */
    fun counterpartyShippingAddress(): CounterpartyShippingAddress? =
        counterpartyShippingAddress.getNullable("counterparty_shipping_address")

    /** Currency that the invoice is denominated in. Defaults to `USD` if not provided. */
    fun currency(): Currency? = currency.getNullable("currency")

    /** A free-form description of the invoice. */
    fun description(): String = description.getRequired("description")

    /** A future date by when the invoice needs to be paid. */
    fun dueDate(): OffsetDateTime = dueDate.getRequired("due_date")

    /** The invoice issuer's business address. */
    fun invoicerAddress(): InvoicerAddress? = invoicerAddress.getNullable("invoicer_address")

    /** The ID of the internal account the invoice should be paid to. */
    fun originatingAccountId(): String = originatingAccountId.getRequired("originating_account_id")

    /** The URL of the hosted web UI where the invoice can be viewed. */
    fun hostedUrl(): String = hostedUrl.getRequired("hosted_url")

    /** A unique record number assigned to each invoice that is issued. */
    fun number(): String = number.getRequired("number")

    /** The payment orders created for paying the invoice through the invoice payment UI. */
    fun paymentOrders(): List<PaymentOrder> = paymentOrders.getRequired("payment_orders")

    /** The URL where the invoice PDF can be downloaded. */
    fun pdfUrl(): String? = pdfUrl.getNullable("pdf_url")

    /** The status of the invoice. */
    fun status(): Status = status.getRequired("status")

    /**
     * Total amount due in specified currency's smallest unit, e.g., $10 USD would be represented as
     * 1000.
     */
    fun totalAmount(): Long = totalAmount.getRequired("total_amount")

    @JsonProperty("id") @ExcludeMissing fun _id() = id

    @JsonProperty("object") @ExcludeMissing fun _object_() = object_

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    @JsonProperty("live_mode") @ExcludeMissing fun _liveMode() = liveMode

    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt() = updatedAt

    /** The invoicer's contact details displayed at the top of the invoice. */
    @JsonProperty("contact_details") @ExcludeMissing fun _contactDetails() = contactDetails

    /** The ID of the counterparty receiving the invoice. */
    @JsonProperty("counterparty_id") @ExcludeMissing fun _counterpartyId() = counterpartyId

    /** The counterparty's billing address. */
    @JsonProperty("counterparty_billing_address")
    @ExcludeMissing
    fun _counterpartyBillingAddress() = counterpartyBillingAddress

    /** The counterparty's shipping address where physical goods should be delivered. */
    @JsonProperty("counterparty_shipping_address")
    @ExcludeMissing
    fun _counterpartyShippingAddress() = counterpartyShippingAddress

    /** Currency that the invoice is denominated in. Defaults to `USD` if not provided. */
    @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

    /** A free-form description of the invoice. */
    @JsonProperty("description") @ExcludeMissing fun _description() = description

    /** A future date by when the invoice needs to be paid. */
    @JsonProperty("due_date") @ExcludeMissing fun _dueDate() = dueDate

    /** The invoice issuer's business address. */
    @JsonProperty("invoicer_address") @ExcludeMissing fun _invoicerAddress() = invoicerAddress

    /** The ID of the internal account the invoice should be paid to. */
    @JsonProperty("originating_account_id")
    @ExcludeMissing
    fun _originatingAccountId() = originatingAccountId

    /** The URL of the hosted web UI where the invoice can be viewed. */
    @JsonProperty("hosted_url") @ExcludeMissing fun _hostedUrl() = hostedUrl

    /** A unique record number assigned to each invoice that is issued. */
    @JsonProperty("number") @ExcludeMissing fun _number() = number

    /** The payment orders created for paying the invoice through the invoice payment UI. */
    @JsonProperty("payment_orders") @ExcludeMissing fun _paymentOrders() = paymentOrders

    /** The URL where the invoice PDF can be downloaded. */
    @JsonProperty("pdf_url") @ExcludeMissing fun _pdfUrl() = pdfUrl

    /** The status of the invoice. */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /**
     * Total amount due in specified currency's smallest unit, e.g., $10 USD would be represented as
     * 1000.
     */
    @JsonProperty("total_amount") @ExcludeMissing fun _totalAmount() = totalAmount

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): Invoice = apply {
        if (!validated) {
            id()
            object_()
            liveMode()
            createdAt()
            updatedAt()
            contactDetails().forEach { it.validate() }
            counterpartyId()
            counterpartyBillingAddress()?.validate()
            counterpartyShippingAddress()?.validate()
            currency()
            description()
            dueDate()
            invoicerAddress()?.validate()
            originatingAccountId()
            hostedUrl()
            number()
            paymentOrders().forEach { it.validate() }
            pdfUrl()
            status()
            totalAmount()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Invoice &&
            this.id == other.id &&
            this.object_ == other.object_ &&
            this.liveMode == other.liveMode &&
            this.createdAt == other.createdAt &&
            this.updatedAt == other.updatedAt &&
            this.contactDetails == other.contactDetails &&
            this.counterpartyId == other.counterpartyId &&
            this.counterpartyBillingAddress == other.counterpartyBillingAddress &&
            this.counterpartyShippingAddress == other.counterpartyShippingAddress &&
            this.currency == other.currency &&
            this.description == other.description &&
            this.dueDate == other.dueDate &&
            this.invoicerAddress == other.invoicerAddress &&
            this.originatingAccountId == other.originatingAccountId &&
            this.hostedUrl == other.hostedUrl &&
            this.number == other.number &&
            this.paymentOrders == other.paymentOrders &&
            this.pdfUrl == other.pdfUrl &&
            this.status == other.status &&
            this.totalAmount == other.totalAmount &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    id,
                    object_,
                    liveMode,
                    createdAt,
                    updatedAt,
                    contactDetails,
                    counterpartyId,
                    counterpartyBillingAddress,
                    counterpartyShippingAddress,
                    currency,
                    description,
                    dueDate,
                    invoicerAddress,
                    originatingAccountId,
                    hostedUrl,
                    number,
                    paymentOrders,
                    pdfUrl,
                    status,
                    totalAmount,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "Invoice{id=$id, object_=$object_, liveMode=$liveMode, createdAt=$createdAt, updatedAt=$updatedAt, contactDetails=$contactDetails, counterpartyId=$counterpartyId, counterpartyBillingAddress=$counterpartyBillingAddress, counterpartyShippingAddress=$counterpartyShippingAddress, currency=$currency, description=$description, dueDate=$dueDate, invoicerAddress=$invoicerAddress, originatingAccountId=$originatingAccountId, hostedUrl=$hostedUrl, number=$number, paymentOrders=$paymentOrders, pdfUrl=$pdfUrl, status=$status, totalAmount=$totalAmount, additionalProperties=$additionalProperties}"

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var object_: JsonField<String> = JsonMissing.of()
        private var liveMode: JsonField<Boolean> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var contactDetails: JsonField<List<ContactDetail>> = JsonMissing.of()
        private var counterpartyId: JsonField<String> = JsonMissing.of()
        private var counterpartyBillingAddress: JsonField<CounterpartyBillingAddress> =
            JsonMissing.of()
        private var counterpartyShippingAddress: JsonField<CounterpartyShippingAddress> =
            JsonMissing.of()
        private var currency: JsonField<Currency> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var dueDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var invoicerAddress: JsonField<InvoicerAddress> = JsonMissing.of()
        private var originatingAccountId: JsonField<String> = JsonMissing.of()
        private var hostedUrl: JsonField<String> = JsonMissing.of()
        private var number: JsonField<String> = JsonMissing.of()
        private var paymentOrders: JsonField<List<PaymentOrder>> = JsonMissing.of()
        private var pdfUrl: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var totalAmount: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(invoice: Invoice) = apply {
            this.id = invoice.id
            this.object_ = invoice.object_
            this.liveMode = invoice.liveMode
            this.createdAt = invoice.createdAt
            this.updatedAt = invoice.updatedAt
            this.contactDetails = invoice.contactDetails
            this.counterpartyId = invoice.counterpartyId
            this.counterpartyBillingAddress = invoice.counterpartyBillingAddress
            this.counterpartyShippingAddress = invoice.counterpartyShippingAddress
            this.currency = invoice.currency
            this.description = invoice.description
            this.dueDate = invoice.dueDate
            this.invoicerAddress = invoice.invoicerAddress
            this.originatingAccountId = invoice.originatingAccountId
            this.hostedUrl = invoice.hostedUrl
            this.number = invoice.number
            this.paymentOrders = invoice.paymentOrders
            this.pdfUrl = invoice.pdfUrl
            this.status = invoice.status
            this.totalAmount = invoice.totalAmount
            additionalProperties(invoice.additionalProperties)
        }

        fun id(id: String) = id(JsonField.of(id))

        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        fun object_(object_: String) = object_(JsonField.of(object_))

        @JsonProperty("object")
        @ExcludeMissing
        fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        fun liveMode(liveMode: Boolean) = liveMode(JsonField.of(liveMode))

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        @JsonProperty("live_mode")
        @ExcludeMissing
        fun liveMode(liveMode: JsonField<Boolean>) = apply { this.liveMode = liveMode }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        @JsonProperty("updated_at")
        @ExcludeMissing
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /** The invoicer's contact details displayed at the top of the invoice. */
        fun contactDetails(contactDetails: List<ContactDetail>) =
            contactDetails(JsonField.of(contactDetails))

        /** The invoicer's contact details displayed at the top of the invoice. */
        @JsonProperty("contact_details")
        @ExcludeMissing
        fun contactDetails(contactDetails: JsonField<List<ContactDetail>>) = apply {
            this.contactDetails = contactDetails
        }

        /** The ID of the counterparty receiving the invoice. */
        fun counterpartyId(counterpartyId: String) = counterpartyId(JsonField.of(counterpartyId))

        /** The ID of the counterparty receiving the invoice. */
        @JsonProperty("counterparty_id")
        @ExcludeMissing
        fun counterpartyId(counterpartyId: JsonField<String>) = apply {
            this.counterpartyId = counterpartyId
        }

        /** The counterparty's billing address. */
        fun counterpartyBillingAddress(counterpartyBillingAddress: CounterpartyBillingAddress) =
            counterpartyBillingAddress(JsonField.of(counterpartyBillingAddress))

        /** The counterparty's billing address. */
        @JsonProperty("counterparty_billing_address")
        @ExcludeMissing
        fun counterpartyBillingAddress(
            counterpartyBillingAddress: JsonField<CounterpartyBillingAddress>
        ) = apply { this.counterpartyBillingAddress = counterpartyBillingAddress }

        /** The counterparty's shipping address where physical goods should be delivered. */
        fun counterpartyShippingAddress(counterpartyShippingAddress: CounterpartyShippingAddress) =
            counterpartyShippingAddress(JsonField.of(counterpartyShippingAddress))

        /** The counterparty's shipping address where physical goods should be delivered. */
        @JsonProperty("counterparty_shipping_address")
        @ExcludeMissing
        fun counterpartyShippingAddress(
            counterpartyShippingAddress: JsonField<CounterpartyShippingAddress>
        ) = apply { this.counterpartyShippingAddress = counterpartyShippingAddress }

        /** Currency that the invoice is denominated in. Defaults to `USD` if not provided. */
        fun currency(currency: Currency) = currency(JsonField.of(currency))

        /** Currency that the invoice is denominated in. Defaults to `USD` if not provided. */
        @JsonProperty("currency")
        @ExcludeMissing
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        /** A free-form description of the invoice. */
        fun description(description: String) = description(JsonField.of(description))

        /** A free-form description of the invoice. */
        @JsonProperty("description")
        @ExcludeMissing
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** A future date by when the invoice needs to be paid. */
        fun dueDate(dueDate: OffsetDateTime) = dueDate(JsonField.of(dueDate))

        /** A future date by when the invoice needs to be paid. */
        @JsonProperty("due_date")
        @ExcludeMissing
        fun dueDate(dueDate: JsonField<OffsetDateTime>) = apply { this.dueDate = dueDate }

        /** The invoice issuer's business address. */
        fun invoicerAddress(invoicerAddress: InvoicerAddress) =
            invoicerAddress(JsonField.of(invoicerAddress))

        /** The invoice issuer's business address. */
        @JsonProperty("invoicer_address")
        @ExcludeMissing
        fun invoicerAddress(invoicerAddress: JsonField<InvoicerAddress>) = apply {
            this.invoicerAddress = invoicerAddress
        }

        /** The ID of the internal account the invoice should be paid to. */
        fun originatingAccountId(originatingAccountId: String) =
            originatingAccountId(JsonField.of(originatingAccountId))

        /** The ID of the internal account the invoice should be paid to. */
        @JsonProperty("originating_account_id")
        @ExcludeMissing
        fun originatingAccountId(originatingAccountId: JsonField<String>) = apply {
            this.originatingAccountId = originatingAccountId
        }

        /** The URL of the hosted web UI where the invoice can be viewed. */
        fun hostedUrl(hostedUrl: String) = hostedUrl(JsonField.of(hostedUrl))

        /** The URL of the hosted web UI where the invoice can be viewed. */
        @JsonProperty("hosted_url")
        @ExcludeMissing
        fun hostedUrl(hostedUrl: JsonField<String>) = apply { this.hostedUrl = hostedUrl }

        /** A unique record number assigned to each invoice that is issued. */
        fun number(number: String) = number(JsonField.of(number))

        /** A unique record number assigned to each invoice that is issued. */
        @JsonProperty("number")
        @ExcludeMissing
        fun number(number: JsonField<String>) = apply { this.number = number }

        /** The payment orders created for paying the invoice through the invoice payment UI. */
        fun paymentOrders(paymentOrders: List<PaymentOrder>) =
            paymentOrders(JsonField.of(paymentOrders))

        /** The payment orders created for paying the invoice through the invoice payment UI. */
        @JsonProperty("payment_orders")
        @ExcludeMissing
        fun paymentOrders(paymentOrders: JsonField<List<PaymentOrder>>) = apply {
            this.paymentOrders = paymentOrders
        }

        /** The URL where the invoice PDF can be downloaded. */
        fun pdfUrl(pdfUrl: String) = pdfUrl(JsonField.of(pdfUrl))

        /** The URL where the invoice PDF can be downloaded. */
        @JsonProperty("pdf_url")
        @ExcludeMissing
        fun pdfUrl(pdfUrl: JsonField<String>) = apply { this.pdfUrl = pdfUrl }

        /** The status of the invoice. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The status of the invoice. */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * Total amount due in specified currency's smallest unit, e.g., $10 USD would be
         * represented as 1000.
         */
        fun totalAmount(totalAmount: Long) = totalAmount(JsonField.of(totalAmount))

        /**
         * Total amount due in specified currency's smallest unit, e.g., $10 USD would be
         * represented as 1000.
         */
        @JsonProperty("total_amount")
        @ExcludeMissing
        fun totalAmount(totalAmount: JsonField<Long>) = apply { this.totalAmount = totalAmount }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            this.additionalProperties.putAll(additionalProperties)
        }

        @JsonAnySetter
        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            this.additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun build(): Invoice =
            Invoice(
                id,
                object_,
                liveMode,
                createdAt,
                updatedAt,
                contactDetails.map { it.toUnmodifiable() },
                counterpartyId,
                counterpartyBillingAddress,
                counterpartyShippingAddress,
                currency,
                description,
                dueDate,
                invoicerAddress,
                originatingAccountId,
                hostedUrl,
                number,
                paymentOrders.map { it.toUnmodifiable() },
                pdfUrl,
                status,
                totalAmount,
                additionalProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = ContactDetail.Builder::class)
    @NoAutoDetect
    class ContactDetail
    private constructor(
        private val id: JsonField<String>,
        private val object_: JsonField<String>,
        private val liveMode: JsonField<Boolean>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val discardedAt: JsonField<OffsetDateTime>,
        private val contactIdentifier: JsonField<String>,
        private val contactIdentifierType: JsonField<ContactIdentifierType>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun id(): String = id.getRequired("id")

        fun object_(): String = object_.getRequired("object")

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        fun liveMode(): Boolean = liveMode.getRequired("live_mode")

        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

        fun discardedAt(): OffsetDateTime? = discardedAt.getNullable("discarded_at")

        fun contactIdentifier(): String = contactIdentifier.getRequired("contact_identifier")

        fun contactIdentifierType(): ContactIdentifierType =
            contactIdentifierType.getRequired("contact_identifier_type")

        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonProperty("object") @ExcludeMissing fun _object_() = object_

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        @JsonProperty("live_mode") @ExcludeMissing fun _liveMode() = liveMode

        @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

        @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt() = updatedAt

        @JsonProperty("discarded_at") @ExcludeMissing fun _discardedAt() = discardedAt

        @JsonProperty("contact_identifier")
        @ExcludeMissing
        fun _contactIdentifier() = contactIdentifier

        @JsonProperty("contact_identifier_type")
        @ExcludeMissing
        fun _contactIdentifierType() = contactIdentifierType

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): ContactDetail = apply {
            if (!validated) {
                id()
                object_()
                liveMode()
                createdAt()
                updatedAt()
                discardedAt()
                contactIdentifier()
                contactIdentifierType()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ContactDetail &&
                this.id == other.id &&
                this.object_ == other.object_ &&
                this.liveMode == other.liveMode &&
                this.createdAt == other.createdAt &&
                this.updatedAt == other.updatedAt &&
                this.discardedAt == other.discardedAt &&
                this.contactIdentifier == other.contactIdentifier &&
                this.contactIdentifierType == other.contactIdentifierType &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        id,
                        object_,
                        liveMode,
                        createdAt,
                        updatedAt,
                        discardedAt,
                        contactIdentifier,
                        contactIdentifierType,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "ContactDetail{id=$id, object_=$object_, liveMode=$liveMode, createdAt=$createdAt, updatedAt=$updatedAt, discardedAt=$discardedAt, contactIdentifier=$contactIdentifier, contactIdentifierType=$contactIdentifierType, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var object_: JsonField<String> = JsonMissing.of()
            private var liveMode: JsonField<Boolean> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var discardedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var contactIdentifier: JsonField<String> = JsonMissing.of()
            private var contactIdentifierType: JsonField<ContactIdentifierType> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(contactDetail: ContactDetail) = apply {
                this.id = contactDetail.id
                this.object_ = contactDetail.object_
                this.liveMode = contactDetail.liveMode
                this.createdAt = contactDetail.createdAt
                this.updatedAt = contactDetail.updatedAt
                this.discardedAt = contactDetail.discardedAt
                this.contactIdentifier = contactDetail.contactIdentifier
                this.contactIdentifierType = contactDetail.contactIdentifierType
                additionalProperties(contactDetail.additionalProperties)
            }

            fun id(id: String) = id(JsonField.of(id))

            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun object_(object_: String) = object_(JsonField.of(object_))

            @JsonProperty("object")
            @ExcludeMissing
            fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

            /**
             * This field will be true if this object exists in the live environment or false if it
             * exists in the test environment.
             */
            fun liveMode(liveMode: Boolean) = liveMode(JsonField.of(liveMode))

            /**
             * This field will be true if this object exists in the live environment or false if it
             * exists in the test environment.
             */
            @JsonProperty("live_mode")
            @ExcludeMissing
            fun liveMode(liveMode: JsonField<Boolean>) = apply { this.liveMode = liveMode }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            @JsonProperty("created_at")
            @ExcludeMissing
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

            @JsonProperty("updated_at")
            @ExcludeMissing
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
            }

            fun discardedAt(discardedAt: OffsetDateTime) = discardedAt(JsonField.of(discardedAt))

            @JsonProperty("discarded_at")
            @ExcludeMissing
            fun discardedAt(discardedAt: JsonField<OffsetDateTime>) = apply {
                this.discardedAt = discardedAt
            }

            fun contactIdentifier(contactIdentifier: String) =
                contactIdentifier(JsonField.of(contactIdentifier))

            @JsonProperty("contact_identifier")
            @ExcludeMissing
            fun contactIdentifier(contactIdentifier: JsonField<String>) = apply {
                this.contactIdentifier = contactIdentifier
            }

            fun contactIdentifierType(contactIdentifierType: ContactIdentifierType) =
                contactIdentifierType(JsonField.of(contactIdentifierType))

            @JsonProperty("contact_identifier_type")
            @ExcludeMissing
            fun contactIdentifierType(contactIdentifierType: JsonField<ContactIdentifierType>) =
                apply {
                    this.contactIdentifierType = contactIdentifierType
                }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): ContactDetail =
                ContactDetail(
                    id,
                    object_,
                    liveMode,
                    createdAt,
                    updatedAt,
                    discardedAt,
                    contactIdentifier,
                    contactIdentifierType,
                    additionalProperties.toUnmodifiable(),
                )
        }

        class ContactIdentifierType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ContactIdentifierType && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val EMAIL = ContactIdentifierType(JsonField.of("email"))

                val PHONE_NUMBER = ContactIdentifierType(JsonField.of("phone_number"))

                val WEBSITE = ContactIdentifierType(JsonField.of("website"))

                fun of(value: String) = ContactIdentifierType(JsonField.of(value))
            }

            enum class Known {
                EMAIL,
                PHONE_NUMBER,
                WEBSITE,
            }

            enum class Value {
                EMAIL,
                PHONE_NUMBER,
                WEBSITE,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    EMAIL -> Value.EMAIL
                    PHONE_NUMBER -> Value.PHONE_NUMBER
                    WEBSITE -> Value.WEBSITE
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    EMAIL -> Known.EMAIL
                    PHONE_NUMBER -> Known.PHONE_NUMBER
                    WEBSITE -> Known.WEBSITE
                    else ->
                        throw ModernTreasuryInvalidDataException(
                            "Unknown ContactIdentifierType: $value"
                        )
                }

            fun asString(): String = _value().asStringOrThrow()
        }
    }

    /** The counterparty's billing address. */
    @JsonDeserialize(builder = CounterpartyBillingAddress.Builder::class)
    @NoAutoDetect
    class CounterpartyBillingAddress
    private constructor(
        private val line1: JsonField<String>,
        private val line2: JsonField<String>,
        private val locality: JsonField<String>,
        private val region: JsonField<String>,
        private val postalCode: JsonField<String>,
        private val country: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun line1(): String = line1.getRequired("line1")

        fun line2(): String? = line2.getNullable("line2")

        /** Locality or City. */
        fun locality(): String = locality.getRequired("locality")

        /** Region or State. */
        fun region(): String = region.getRequired("region")

        /** The postal code of the address. */
        fun postalCode(): String = postalCode.getRequired("postal_code")

        /** Country code conforms to [ISO 3166-1 alpha-2] */
        fun country(): String = country.getRequired("country")

        @JsonProperty("line1") @ExcludeMissing fun _line1() = line1

        @JsonProperty("line2") @ExcludeMissing fun _line2() = line2

        /** Locality or City. */
        @JsonProperty("locality") @ExcludeMissing fun _locality() = locality

        /** Region or State. */
        @JsonProperty("region") @ExcludeMissing fun _region() = region

        /** The postal code of the address. */
        @JsonProperty("postal_code") @ExcludeMissing fun _postalCode() = postalCode

        /** Country code conforms to [ISO 3166-1 alpha-2] */
        @JsonProperty("country") @ExcludeMissing fun _country() = country

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): CounterpartyBillingAddress = apply {
            if (!validated) {
                line1()
                line2()
                locality()
                region()
                postalCode()
                country()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CounterpartyBillingAddress &&
                this.line1 == other.line1 &&
                this.line2 == other.line2 &&
                this.locality == other.locality &&
                this.region == other.region &&
                this.postalCode == other.postalCode &&
                this.country == other.country &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        line1,
                        line2,
                        locality,
                        region,
                        postalCode,
                        country,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "CounterpartyBillingAddress{line1=$line1, line2=$line2, locality=$locality, region=$region, postalCode=$postalCode, country=$country, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var line1: JsonField<String> = JsonMissing.of()
            private var line2: JsonField<String> = JsonMissing.of()
            private var locality: JsonField<String> = JsonMissing.of()
            private var region: JsonField<String> = JsonMissing.of()
            private var postalCode: JsonField<String> = JsonMissing.of()
            private var country: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(counterpartyBillingAddress: CounterpartyBillingAddress) = apply {
                this.line1 = counterpartyBillingAddress.line1
                this.line2 = counterpartyBillingAddress.line2
                this.locality = counterpartyBillingAddress.locality
                this.region = counterpartyBillingAddress.region
                this.postalCode = counterpartyBillingAddress.postalCode
                this.country = counterpartyBillingAddress.country
                additionalProperties(counterpartyBillingAddress.additionalProperties)
            }

            fun line1(line1: String) = line1(JsonField.of(line1))

            @JsonProperty("line1")
            @ExcludeMissing
            fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

            fun line2(line2: String) = line2(JsonField.of(line2))

            @JsonProperty("line2")
            @ExcludeMissing
            fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

            /** Locality or City. */
            fun locality(locality: String) = locality(JsonField.of(locality))

            /** Locality or City. */
            @JsonProperty("locality")
            @ExcludeMissing
            fun locality(locality: JsonField<String>) = apply { this.locality = locality }

            /** Region or State. */
            fun region(region: String) = region(JsonField.of(region))

            /** Region or State. */
            @JsonProperty("region")
            @ExcludeMissing
            fun region(region: JsonField<String>) = apply { this.region = region }

            /** The postal code of the address. */
            fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

            /** The postal code of the address. */
            @JsonProperty("postal_code")
            @ExcludeMissing
            fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

            /** Country code conforms to [ISO 3166-1 alpha-2] */
            fun country(country: String) = country(JsonField.of(country))

            /** Country code conforms to [ISO 3166-1 alpha-2] */
            @JsonProperty("country")
            @ExcludeMissing
            fun country(country: JsonField<String>) = apply { this.country = country }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): CounterpartyBillingAddress =
                CounterpartyBillingAddress(
                    line1,
                    line2,
                    locality,
                    region,
                    postalCode,
                    country,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    /** The counterparty's shipping address where physical goods should be delivered. */
    @JsonDeserialize(builder = CounterpartyShippingAddress.Builder::class)
    @NoAutoDetect
    class CounterpartyShippingAddress
    private constructor(
        private val line1: JsonField<String>,
        private val line2: JsonField<String>,
        private val locality: JsonField<String>,
        private val region: JsonField<String>,
        private val postalCode: JsonField<String>,
        private val country: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun line1(): String = line1.getRequired("line1")

        fun line2(): String? = line2.getNullable("line2")

        /** Locality or City. */
        fun locality(): String = locality.getRequired("locality")

        /** Region or State. */
        fun region(): String = region.getRequired("region")

        /** The postal code of the address. */
        fun postalCode(): String = postalCode.getRequired("postal_code")

        /** Country code conforms to [ISO 3166-1 alpha-2] */
        fun country(): String = country.getRequired("country")

        @JsonProperty("line1") @ExcludeMissing fun _line1() = line1

        @JsonProperty("line2") @ExcludeMissing fun _line2() = line2

        /** Locality or City. */
        @JsonProperty("locality") @ExcludeMissing fun _locality() = locality

        /** Region or State. */
        @JsonProperty("region") @ExcludeMissing fun _region() = region

        /** The postal code of the address. */
        @JsonProperty("postal_code") @ExcludeMissing fun _postalCode() = postalCode

        /** Country code conforms to [ISO 3166-1 alpha-2] */
        @JsonProperty("country") @ExcludeMissing fun _country() = country

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): CounterpartyShippingAddress = apply {
            if (!validated) {
                line1()
                line2()
                locality()
                region()
                postalCode()
                country()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CounterpartyShippingAddress &&
                this.line1 == other.line1 &&
                this.line2 == other.line2 &&
                this.locality == other.locality &&
                this.region == other.region &&
                this.postalCode == other.postalCode &&
                this.country == other.country &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        line1,
                        line2,
                        locality,
                        region,
                        postalCode,
                        country,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "CounterpartyShippingAddress{line1=$line1, line2=$line2, locality=$locality, region=$region, postalCode=$postalCode, country=$country, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var line1: JsonField<String> = JsonMissing.of()
            private var line2: JsonField<String> = JsonMissing.of()
            private var locality: JsonField<String> = JsonMissing.of()
            private var region: JsonField<String> = JsonMissing.of()
            private var postalCode: JsonField<String> = JsonMissing.of()
            private var country: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(counterpartyShippingAddress: CounterpartyShippingAddress) = apply {
                this.line1 = counterpartyShippingAddress.line1
                this.line2 = counterpartyShippingAddress.line2
                this.locality = counterpartyShippingAddress.locality
                this.region = counterpartyShippingAddress.region
                this.postalCode = counterpartyShippingAddress.postalCode
                this.country = counterpartyShippingAddress.country
                additionalProperties(counterpartyShippingAddress.additionalProperties)
            }

            fun line1(line1: String) = line1(JsonField.of(line1))

            @JsonProperty("line1")
            @ExcludeMissing
            fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

            fun line2(line2: String) = line2(JsonField.of(line2))

            @JsonProperty("line2")
            @ExcludeMissing
            fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

            /** Locality or City. */
            fun locality(locality: String) = locality(JsonField.of(locality))

            /** Locality or City. */
            @JsonProperty("locality")
            @ExcludeMissing
            fun locality(locality: JsonField<String>) = apply { this.locality = locality }

            /** Region or State. */
            fun region(region: String) = region(JsonField.of(region))

            /** Region or State. */
            @JsonProperty("region")
            @ExcludeMissing
            fun region(region: JsonField<String>) = apply { this.region = region }

            /** The postal code of the address. */
            fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

            /** The postal code of the address. */
            @JsonProperty("postal_code")
            @ExcludeMissing
            fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

            /** Country code conforms to [ISO 3166-1 alpha-2] */
            fun country(country: String) = country(JsonField.of(country))

            /** Country code conforms to [ISO 3166-1 alpha-2] */
            @JsonProperty("country")
            @ExcludeMissing
            fun country(country: JsonField<String>) = apply { this.country = country }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): CounterpartyShippingAddress =
                CounterpartyShippingAddress(
                    line1,
                    line2,
                    locality,
                    region,
                    postalCode,
                    country,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    /** The invoice issuer's business address. */
    @JsonDeserialize(builder = InvoicerAddress.Builder::class)
    @NoAutoDetect
    class InvoicerAddress
    private constructor(
        private val line1: JsonField<String>,
        private val line2: JsonField<String>,
        private val locality: JsonField<String>,
        private val region: JsonField<String>,
        private val postalCode: JsonField<String>,
        private val country: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun line1(): String = line1.getRequired("line1")

        fun line2(): String? = line2.getNullable("line2")

        /** Locality or City. */
        fun locality(): String = locality.getRequired("locality")

        /** Region or State. */
        fun region(): String = region.getRequired("region")

        /** The postal code of the address. */
        fun postalCode(): String = postalCode.getRequired("postal_code")

        /** Country code conforms to [ISO 3166-1 alpha-2] */
        fun country(): String = country.getRequired("country")

        @JsonProperty("line1") @ExcludeMissing fun _line1() = line1

        @JsonProperty("line2") @ExcludeMissing fun _line2() = line2

        /** Locality or City. */
        @JsonProperty("locality") @ExcludeMissing fun _locality() = locality

        /** Region or State. */
        @JsonProperty("region") @ExcludeMissing fun _region() = region

        /** The postal code of the address. */
        @JsonProperty("postal_code") @ExcludeMissing fun _postalCode() = postalCode

        /** Country code conforms to [ISO 3166-1 alpha-2] */
        @JsonProperty("country") @ExcludeMissing fun _country() = country

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): InvoicerAddress = apply {
            if (!validated) {
                line1()
                line2()
                locality()
                region()
                postalCode()
                country()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is InvoicerAddress &&
                this.line1 == other.line1 &&
                this.line2 == other.line2 &&
                this.locality == other.locality &&
                this.region == other.region &&
                this.postalCode == other.postalCode &&
                this.country == other.country &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        line1,
                        line2,
                        locality,
                        region,
                        postalCode,
                        country,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "InvoicerAddress{line1=$line1, line2=$line2, locality=$locality, region=$region, postalCode=$postalCode, country=$country, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var line1: JsonField<String> = JsonMissing.of()
            private var line2: JsonField<String> = JsonMissing.of()
            private var locality: JsonField<String> = JsonMissing.of()
            private var region: JsonField<String> = JsonMissing.of()
            private var postalCode: JsonField<String> = JsonMissing.of()
            private var country: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(invoicerAddress: InvoicerAddress) = apply {
                this.line1 = invoicerAddress.line1
                this.line2 = invoicerAddress.line2
                this.locality = invoicerAddress.locality
                this.region = invoicerAddress.region
                this.postalCode = invoicerAddress.postalCode
                this.country = invoicerAddress.country
                additionalProperties(invoicerAddress.additionalProperties)
            }

            fun line1(line1: String) = line1(JsonField.of(line1))

            @JsonProperty("line1")
            @ExcludeMissing
            fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

            fun line2(line2: String) = line2(JsonField.of(line2))

            @JsonProperty("line2")
            @ExcludeMissing
            fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

            /** Locality or City. */
            fun locality(locality: String) = locality(JsonField.of(locality))

            /** Locality or City. */
            @JsonProperty("locality")
            @ExcludeMissing
            fun locality(locality: JsonField<String>) = apply { this.locality = locality }

            /** Region or State. */
            fun region(region: String) = region(JsonField.of(region))

            /** Region or State. */
            @JsonProperty("region")
            @ExcludeMissing
            fun region(region: JsonField<String>) = apply { this.region = region }

            /** The postal code of the address. */
            fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

            /** The postal code of the address. */
            @JsonProperty("postal_code")
            @ExcludeMissing
            fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

            /** Country code conforms to [ISO 3166-1 alpha-2] */
            fun country(country: String) = country(JsonField.of(country))

            /** Country code conforms to [ISO 3166-1 alpha-2] */
            @JsonProperty("country")
            @ExcludeMissing
            fun country(country: JsonField<String>) = apply { this.country = country }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): InvoicerAddress =
                InvoicerAddress(
                    line1,
                    line2,
                    locality,
                    region,
                    postalCode,
                    country,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Status && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val DRAFT = Status(JsonField.of("draft"))

            val PAID = Status(JsonField.of("paid"))

            val PAYMENT_PENDING = Status(JsonField.of("payment_pending"))

            val UNPAID = Status(JsonField.of("unpaid"))

            val VOIDED = Status(JsonField.of("voided"))

            fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            DRAFT,
            PAID,
            PAYMENT_PENDING,
            UNPAID,
            VOIDED,
        }

        enum class Value {
            DRAFT,
            PAID,
            PAYMENT_PENDING,
            UNPAID,
            VOIDED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                DRAFT -> Value.DRAFT
                PAID -> Value.PAID
                PAYMENT_PENDING -> Value.PAYMENT_PENDING
                UNPAID -> Value.UNPAID
                VOIDED -> Value.VOIDED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                DRAFT -> Known.DRAFT
                PAID -> Known.PAID
                PAYMENT_PENDING -> Known.PAYMENT_PENDING
                UNPAID -> Known.UNPAID
                VOIDED -> Known.VOIDED
                else -> throw ModernTreasuryInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
