package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountDetailDeleteParamsTest {

    @Test
    fun createAccountDetailDeleteParams() {
        AccountDetailDeleteParams.builder()
            .accountsType(AccountDetailDeleteParams.AccountsType.EXTERNAL_ACCOUNTS)
            .accountId("string")
            .id("string")
            .build()
    }

    @Test
    fun getPathParam() {
        val params =
            AccountDetailDeleteParams.builder()
                .accountsType(AccountDetailDeleteParams.AccountsType.EXTERNAL_ACCOUNTS)
                .accountId("string")
                .id("string")
                .build()
        assertThat(params).isNotNull
        // path param "accountsType"
        assertThat(params.getPathParam(0))
            .isEqualTo(AccountDetailDeleteParams.AccountsType.EXTERNAL_ACCOUNTS.toString())
        // path param "accountId"
        assertThat(params.getPathParam(1)).isEqualTo("string")
        // path param "id"
        assertThat(params.getPathParam(2)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(3)).isEqualTo("")
    }
}
