// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LedgerTransactionVersionTest {

    @Test
    fun createLedgerTransactionVersion() {
        val ledgerTransactionVersion =
            LedgerTransactionVersion.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("string")
                .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .effectiveDate(LocalDate.parse("2019-12-27"))
                .externalId("string")
                .ledgerEntries(
                    listOf(
                        LedgerTransactionVersion.LedgerEntryOfTransactionVersion.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .amount(123L)
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .direction(TransactionDirection.CREDIT)
                            .ledgerAccountCurrency("string")
                            .ledgerAccountCurrencyExponent(123L)
                            .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .ledgerAccountLockVersion(123L)
                            .ledgerTransactionId("string")
                            .liveMode(true)
                            .metadata(
                                LedgerTransactionVersion.LedgerEntryOfTransactionVersion.Metadata
                                    .builder()
                                    .build()
                            )
                            .object_("string")
                            .resultingLedgerAccountBalances(
                                LedgerTransactionVersion.LedgerEntryOfTransactionVersion
                                    .LedgerBalances
                                    .builder()
                                    .availableBalance(
                                        LedgerTransactionVersion.LedgerEntryOfTransactionVersion
                                            .LedgerBalances
                                            .LedgerBalance
                                            .builder()
                                            .amount(123L)
                                            .credits(123L)
                                            .currency("string")
                                            .currencyExponent(123L)
                                            .debits(123L)
                                            .build()
                                    )
                                    .pendingBalance(
                                        LedgerTransactionVersion.LedgerEntryOfTransactionVersion
                                            .LedgerBalances
                                            .LedgerBalance
                                            .builder()
                                            .amount(123L)
                                            .credits(123L)
                                            .currency("string")
                                            .currencyExponent(123L)
                                            .debits(123L)
                                            .build()
                                    )
                                    .postedBalance(
                                        LedgerTransactionVersion.LedgerEntryOfTransactionVersion
                                            .LedgerBalances
                                            .LedgerBalance
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
                            .status(
                                LedgerTransactionVersion.LedgerEntryOfTransactionVersion.Status
                                    .ARCHIVED
                            )
                            .build()
                    )
                )
                .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .ledgerTransactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .ledgerableType(LedgerTransactionVersion.LedgerableType.COUNTERPARTY)
                .liveMode(true)
                .metadata(LedgerTransactionVersion.Metadata.builder().build())
                .object_("string")
                .postedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .reversedByLedgerTransactionId("string")
                .reversesLedgerTransactionId("string")
                .status(LedgerTransactionVersion.Status.ARCHIVED)
                .version(123L)
                .build()
        assertThat(ledgerTransactionVersion).isNotNull
        assertThat(ledgerTransactionVersion.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ledgerTransactionVersion.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ledgerTransactionVersion.description()).isEqualTo("string")
        assertThat(ledgerTransactionVersion.effectiveAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ledgerTransactionVersion.effectiveDate())
            .isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(ledgerTransactionVersion.externalId()).isEqualTo("string")
        assertThat(ledgerTransactionVersion.ledgerEntries())
            .containsExactly(
                LedgerTransactionVersion.LedgerEntryOfTransactionVersion.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .amount(123L)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .direction(TransactionDirection.CREDIT)
                    .ledgerAccountCurrency("string")
                    .ledgerAccountCurrencyExponent(123L)
                    .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .ledgerAccountLockVersion(123L)
                    .ledgerTransactionId("string")
                    .liveMode(true)
                    .metadata(
                        LedgerTransactionVersion.LedgerEntryOfTransactionVersion.Metadata.builder()
                            .build()
                    )
                    .object_("string")
                    .resultingLedgerAccountBalances(
                        LedgerTransactionVersion.LedgerEntryOfTransactionVersion.LedgerBalances
                            .builder()
                            .availableBalance(
                                LedgerTransactionVersion.LedgerEntryOfTransactionVersion
                                    .LedgerBalances
                                    .LedgerBalance
                                    .builder()
                                    .amount(123L)
                                    .credits(123L)
                                    .currency("string")
                                    .currencyExponent(123L)
                                    .debits(123L)
                                    .build()
                            )
                            .pendingBalance(
                                LedgerTransactionVersion.LedgerEntryOfTransactionVersion
                                    .LedgerBalances
                                    .LedgerBalance
                                    .builder()
                                    .amount(123L)
                                    .credits(123L)
                                    .currency("string")
                                    .currencyExponent(123L)
                                    .debits(123L)
                                    .build()
                            )
                            .postedBalance(
                                LedgerTransactionVersion.LedgerEntryOfTransactionVersion
                                    .LedgerBalances
                                    .LedgerBalance
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
                    .status(
                        LedgerTransactionVersion.LedgerEntryOfTransactionVersion.Status.ARCHIVED
                    )
                    .build()
            )
        assertThat(ledgerTransactionVersion.ledgerId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ledgerTransactionVersion.ledgerTransactionId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ledgerTransactionVersion.ledgerableId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ledgerTransactionVersion.ledgerableType())
            .isEqualTo(LedgerTransactionVersion.LedgerableType.COUNTERPARTY)
        assertThat(ledgerTransactionVersion.liveMode()).isEqualTo(true)
        assertThat(ledgerTransactionVersion.metadata())
            .isEqualTo(LedgerTransactionVersion.Metadata.builder().build())
        assertThat(ledgerTransactionVersion.object_()).isEqualTo("string")
        assertThat(ledgerTransactionVersion.postedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ledgerTransactionVersion.reversedByLedgerTransactionId()).isEqualTo("string")
        assertThat(ledgerTransactionVersion.reversesLedgerTransactionId()).isEqualTo("string")
        assertThat(ledgerTransactionVersion.status())
            .isEqualTo(LedgerTransactionVersion.Status.ARCHIVED)
        assertThat(ledgerTransactionVersion.version()).isEqualTo(123L)
    }
}
