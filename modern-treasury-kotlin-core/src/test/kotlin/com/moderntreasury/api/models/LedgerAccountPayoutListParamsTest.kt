package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LedgerAccountPayoutListParamsTest {

    @Test
    fun createLedgerAccountPayoutListParams() {
        LedgerAccountPayoutListParams.builder()
            .afterCursor("string")
            .perPage(123L)
            .payoutLedgerAccountId("string")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            LedgerAccountPayoutListParams.builder()
                .afterCursor("string")
                .perPage(123L)
                .payoutLedgerAccountId("string")
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("after_cursor", listOf("string"))
        expected.put("per_page", listOf("123"))
        expected.put("payout_ledger_account_id", listOf("string"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = LedgerAccountPayoutListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
