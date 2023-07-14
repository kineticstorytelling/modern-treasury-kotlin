package com.moderntreasury.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LedgerAccountStatementCreateResponseTest {

    @Test
    fun createLedgerAccountStatementCreateResponse() {
        val ledgerAccountStatementCreateResponse =
            LedgerAccountStatementCreateResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("string")
                .effectiveAtLowerBound("string")
                .effectiveAtUpperBound("string")
                .endingBalance(
                    LedgerAccountStatementCreateResponse.LedgerBalances.builder()
                        .availableBalance(
                            LedgerAccountStatementCreateResponse.LedgerBalances.LedgerBalance
                                .builder()
                                .amount(123L)
                                .credits(123L)
                                .currency("string")
                                .currencyExponent(123L)
                                .debits(123L)
                                .build()
                        )
                        .pendingBalance(
                            LedgerAccountStatementCreateResponse.LedgerBalances.LedgerBalance
                                .builder()
                                .amount(123L)
                                .credits(123L)
                                .currency("string")
                                .currencyExponent(123L)
                                .debits(123L)
                                .build()
                        )
                        .postedBalance(
                            LedgerAccountStatementCreateResponse.LedgerBalances.LedgerBalance
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
                    LedgerAccountStatementCreateResponse.LedgerAccountNormalBalance.CREDIT
                )
                .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .liveMode(true)
                .metadata(LedgerAccountStatementCreateResponse.Metadata.builder().build())
                .object_("string")
                .startingBalance(
                    LedgerAccountStatementCreateResponse.LedgerBalances.builder()
                        .availableBalance(
                            LedgerAccountStatementCreateResponse.LedgerBalances.LedgerBalance
                                .builder()
                                .amount(123L)
                                .credits(123L)
                                .currency("string")
                                .currencyExponent(123L)
                                .debits(123L)
                                .build()
                        )
                        .pendingBalance(
                            LedgerAccountStatementCreateResponse.LedgerBalances.LedgerBalance
                                .builder()
                                .amount(123L)
                                .credits(123L)
                                .currency("string")
                                .currencyExponent(123L)
                                .debits(123L)
                                .build()
                        )
                        .postedBalance(
                            LedgerAccountStatementCreateResponse.LedgerBalances.LedgerBalance
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
        assertThat(ledgerAccountStatementCreateResponse).isNotNull
        assertThat(ledgerAccountStatementCreateResponse.id())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ledgerAccountStatementCreateResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ledgerAccountStatementCreateResponse.description()).isEqualTo("string")
        assertThat(ledgerAccountStatementCreateResponse.effectiveAtLowerBound()).isEqualTo("string")
        assertThat(ledgerAccountStatementCreateResponse.effectiveAtUpperBound()).isEqualTo("string")
        assertThat(ledgerAccountStatementCreateResponse.endingBalance())
            .isEqualTo(
                LedgerAccountStatementCreateResponse.LedgerBalances.builder()
                    .availableBalance(
                        LedgerAccountStatementCreateResponse.LedgerBalances.LedgerBalance.builder()
                            .amount(123L)
                            .credits(123L)
                            .currency("string")
                            .currencyExponent(123L)
                            .debits(123L)
                            .build()
                    )
                    .pendingBalance(
                        LedgerAccountStatementCreateResponse.LedgerBalances.LedgerBalance.builder()
                            .amount(123L)
                            .credits(123L)
                            .currency("string")
                            .currencyExponent(123L)
                            .debits(123L)
                            .build()
                    )
                    .postedBalance(
                        LedgerAccountStatementCreateResponse.LedgerBalances.LedgerBalance.builder()
                            .amount(123L)
                            .credits(123L)
                            .currency("string")
                            .currencyExponent(123L)
                            .debits(123L)
                            .build()
                    )
                    .build()
            )
        assertThat(ledgerAccountStatementCreateResponse.ledgerAccountId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ledgerAccountStatementCreateResponse.ledgerAccountLockVersion()).isEqualTo(123L)
        assertThat(ledgerAccountStatementCreateResponse.ledgerAccountNormalBalance())
            .isEqualTo(LedgerAccountStatementCreateResponse.LedgerAccountNormalBalance.CREDIT)
        assertThat(ledgerAccountStatementCreateResponse.ledgerId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ledgerAccountStatementCreateResponse.liveMode()).isEqualTo(true)
        assertThat(ledgerAccountStatementCreateResponse.metadata())
            .isEqualTo(LedgerAccountStatementCreateResponse.Metadata.builder().build())
        assertThat(ledgerAccountStatementCreateResponse.object_()).isEqualTo("string")
        assertThat(ledgerAccountStatementCreateResponse.startingBalance())
            .isEqualTo(
                LedgerAccountStatementCreateResponse.LedgerBalances.builder()
                    .availableBalance(
                        LedgerAccountStatementCreateResponse.LedgerBalances.LedgerBalance.builder()
                            .amount(123L)
                            .credits(123L)
                            .currency("string")
                            .currencyExponent(123L)
                            .debits(123L)
                            .build()
                    )
                    .pendingBalance(
                        LedgerAccountStatementCreateResponse.LedgerBalances.LedgerBalance.builder()
                            .amount(123L)
                            .credits(123L)
                            .currency("string")
                            .currencyExponent(123L)
                            .debits(123L)
                            .build()
                    )
                    .postedBalance(
                        LedgerAccountStatementCreateResponse.LedgerBalances.LedgerBalance.builder()
                            .amount(123L)
                            .credits(123L)
                            .currency("string")
                            .currencyExponent(123L)
                            .debits(123L)
                            .build()
                    )
                    .build()
            )
        assertThat(ledgerAccountStatementCreateResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
