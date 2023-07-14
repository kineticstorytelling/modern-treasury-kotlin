package com.moderntreasury.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LedgerAccountStatementRetrieveResponseTest {

    @Test
    fun createLedgerAccountStatementRetrieveResponse() {
        val ledgerAccountStatementRetrieveResponse =
            LedgerAccountStatementRetrieveResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("string")
                .effectiveAtLowerBound("string")
                .effectiveAtUpperBound("string")
                .endingBalance(
                    LedgerAccountStatementRetrieveResponse.LedgerBalances.builder()
                        .availableBalance(
                            LedgerAccountStatementRetrieveResponse.LedgerBalances.LedgerBalance
                                .builder()
                                .amount(123L)
                                .credits(123L)
                                .currency("string")
                                .currencyExponent(123L)
                                .debits(123L)
                                .build()
                        )
                        .pendingBalance(
                            LedgerAccountStatementRetrieveResponse.LedgerBalances.LedgerBalance
                                .builder()
                                .amount(123L)
                                .credits(123L)
                                .currency("string")
                                .currencyExponent(123L)
                                .debits(123L)
                                .build()
                        )
                        .postedBalance(
                            LedgerAccountStatementRetrieveResponse.LedgerBalances.LedgerBalance
                                .builder()
                                .amount(123L)
                                .credits(123L)
                                .currency("string")
                                .currencyExponent(123L)
                                .debits(123L)
                                .build()
                        )
                        .build()
                )
                .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .ledgerAccountLockVersion(123L)
                .ledgerAccountNormalBalance(
                    LedgerAccountStatementRetrieveResponse.LedgerAccountNormalBalance.CREDIT
                )
                .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .liveMode(true)
                .metadata(LedgerAccountStatementRetrieveResponse.Metadata.builder().build())
                .object_("string")
                .startingBalance(
                    LedgerAccountStatementRetrieveResponse.LedgerBalances.builder()
                        .availableBalance(
                            LedgerAccountStatementRetrieveResponse.LedgerBalances.LedgerBalance
                                .builder()
                                .amount(123L)
                                .credits(123L)
                                .currency("string")
                                .currencyExponent(123L)
                                .debits(123L)
                                .build()
                        )
                        .pendingBalance(
                            LedgerAccountStatementRetrieveResponse.LedgerBalances.LedgerBalance
                                .builder()
                                .amount(123L)
                                .credits(123L)
                                .currency("string")
                                .currencyExponent(123L)
                                .debits(123L)
                                .build()
                        )
                        .postedBalance(
                            LedgerAccountStatementRetrieveResponse.LedgerBalances.LedgerBalance
                                .builder()
                                .amount(123L)
                                .credits(123L)
                                .currency("string")
                                .currencyExponent(123L)
                                .debits(123L)
                                .build()
                        )
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(ledgerAccountStatementRetrieveResponse).isNotNull
        assertThat(ledgerAccountStatementRetrieveResponse.id())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ledgerAccountStatementRetrieveResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ledgerAccountStatementRetrieveResponse.description()).isEqualTo("string")
        assertThat(ledgerAccountStatementRetrieveResponse.effectiveAtLowerBound())
            .isEqualTo("string")
        assertThat(ledgerAccountStatementRetrieveResponse.effectiveAtUpperBound())
            .isEqualTo("string")
        assertThat(ledgerAccountStatementRetrieveResponse.endingBalance())
            .isEqualTo(
                LedgerAccountStatementRetrieveResponse.LedgerBalances.builder()
                    .availableBalance(
                        LedgerAccountStatementRetrieveResponse.LedgerBalances.LedgerBalance
                            .builder()
                            .amount(123L)
                            .credits(123L)
                            .currency("string")
                            .currencyExponent(123L)
                            .debits(123L)
                            .build()
                    )
                    .pendingBalance(
                        LedgerAccountStatementRetrieveResponse.LedgerBalances.LedgerBalance
                            .builder()
                            .amount(123L)
                            .credits(123L)
                            .currency("string")
                            .currencyExponent(123L)
                            .debits(123L)
                            .build()
                    )
                    .postedBalance(
                        LedgerAccountStatementRetrieveResponse.LedgerBalances.LedgerBalance
                            .builder()
                            .amount(123L)
                            .credits(123L)
                            .currency("string")
                            .currencyExponent(123L)
                            .debits(123L)
                            .build()
                    )
                    .build()
            )
        assertThat(ledgerAccountStatementRetrieveResponse.ledgerAccountId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ledgerAccountStatementRetrieveResponse.ledgerAccountLockVersion())
            .isEqualTo(123L)
        assertThat(ledgerAccountStatementRetrieveResponse.ledgerAccountNormalBalance())
            .isEqualTo(LedgerAccountStatementRetrieveResponse.LedgerAccountNormalBalance.CREDIT)
        assertThat(ledgerAccountStatementRetrieveResponse.ledgerId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ledgerAccountStatementRetrieveResponse.liveMode()).isEqualTo(true)
        assertThat(ledgerAccountStatementRetrieveResponse.metadata())
            .isEqualTo(LedgerAccountStatementRetrieveResponse.Metadata.builder().build())
        assertThat(ledgerAccountStatementRetrieveResponse.object_()).isEqualTo("string")
        assertThat(ledgerAccountStatementRetrieveResponse.startingBalance())
            .isEqualTo(
                LedgerAccountStatementRetrieveResponse.LedgerBalances.builder()
                    .availableBalance(
                        LedgerAccountStatementRetrieveResponse.LedgerBalances.LedgerBalance
                            .builder()
                            .amount(123L)
                            .credits(123L)
                            .currency("string")
                            .currencyExponent(123L)
                            .debits(123L)
                            .build()
                    )
                    .pendingBalance(
                        LedgerAccountStatementRetrieveResponse.LedgerBalances.LedgerBalance
                            .builder()
                            .amount(123L)
                            .credits(123L)
                            .currency("string")
                            .currencyExponent(123L)
                            .debits(123L)
                            .build()
                    )
                    .postedBalance(
                        LedgerAccountStatementRetrieveResponse.LedgerBalances.LedgerBalance
                            .builder()
                            .amount(123L)
                            .credits(123L)
                            .currency("string")
                            .currencyExponent(123L)
                            .debits(123L)
                            .build()
                    )
                    .build()
            )
        assertThat(ledgerAccountStatementRetrieveResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
