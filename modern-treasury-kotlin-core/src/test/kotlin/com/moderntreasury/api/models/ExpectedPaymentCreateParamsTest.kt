// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.JsonNull
import com.moderntreasury.api.models.*
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ExpectedPaymentCreateParamsTest {

    @Test
    fun createExpectedPaymentCreateParams() {
        ExpectedPaymentCreateParams.builder()
            .amountLowerBound(123L)
            .amountUpperBound(123L)
            .direction(TransactionDirection.CREDIT)
            .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .currency(Currency.AED)
            .dateLowerBound(LocalDate.parse("2019-12-27"))
            .dateUpperBound(LocalDate.parse("2019-12-27"))
            .description("string")
            .ledgerTransaction(
                ExpectedPaymentCreateParams.LedgerTransactionCreateRequest.builder()
                    .ledgerEntries(
                        listOf(
                            ExpectedPaymentCreateParams.LedgerTransactionCreateRequest
                                .LedgerEntryCreateRequest
                                .builder()
                                .amount(123L)
                                .direction(TransactionDirection.CREDIT)
                                .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .availableBalanceAmount(
                                    ExpectedPaymentCreateParams.LedgerTransactionCreateRequest
                                        .LedgerEntryCreateRequest
                                        .AvailableBalanceAmount
                                        .builder()
                                        .build()
                                )
                                .lockVersion(123L)
                                .metadata(
                                    ExpectedPaymentCreateParams.LedgerTransactionCreateRequest
                                        .LedgerEntryCreateRequest
                                        .Metadata
                                        .builder()
                                        .build()
                                )
                                .pendingBalanceAmount(
                                    ExpectedPaymentCreateParams.LedgerTransactionCreateRequest
                                        .LedgerEntryCreateRequest
                                        .PendingBalanceAmount
                                        .builder()
                                        .build()
                                )
                                .postedBalanceAmount(
                                    ExpectedPaymentCreateParams.LedgerTransactionCreateRequest
                                        .LedgerEntryCreateRequest
                                        .PostedBalanceAmount
                                        .builder()
                                        .build()
                                )
                                .showResultingLedgerAccountBalances(true)
                                .build()
                        )
                    )
                    .description("string")
                    .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .effectiveDate(LocalDate.parse("2019-12-27"))
                    .externalId("string")
                    .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .ledgerableType(
                        ExpectedPaymentCreateParams.LedgerTransactionCreateRequest.LedgerableType
                            .COUNTERPARTY
                    )
                    .metadata(
                        ExpectedPaymentCreateParams.LedgerTransactionCreateRequest.Metadata
                            .builder()
                            .build()
                    )
                    .status(
                        ExpectedPaymentCreateParams.LedgerTransactionCreateRequest.Status.ARCHIVED
                    )
                    .build()
            )
            .ledgerTransactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .lineItems(
                listOf(
                    ExpectedPaymentCreateParams.LineItemRequest.builder()
                        .amount(123L)
                        .accountingCategoryId("string")
                        .description("string")
                        .metadata(
                            ExpectedPaymentCreateParams.LineItemRequest.Metadata.builder().build()
                        )
                        .build()
                )
            )
            .metadata(ExpectedPaymentCreateParams.Metadata.builder().build())
            .reconciliationFilters(JsonNull.of())
            .reconciliationGroups(JsonNull.of())
            .reconciliationRuleVariables(
                listOf(ExpectedPaymentCreateParams.ReconciliationRuleVariable.builder().build())
            )
            .remittanceInformation("string")
            .statementDescriptor("string")
            .type(ExpectedPaymentType.ACH)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            ExpectedPaymentCreateParams.builder()
                .amountLowerBound(123L)
                .amountUpperBound(123L)
                .direction(TransactionDirection.CREDIT)
                .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .currency(Currency.AED)
                .dateLowerBound(LocalDate.parse("2019-12-27"))
                .dateUpperBound(LocalDate.parse("2019-12-27"))
                .description("string")
                .ledgerTransaction(
                    ExpectedPaymentCreateParams.LedgerTransactionCreateRequest.builder()
                        .ledgerEntries(
                            listOf(
                                ExpectedPaymentCreateParams.LedgerTransactionCreateRequest
                                    .LedgerEntryCreateRequest
                                    .builder()
                                    .amount(123L)
                                    .direction(TransactionDirection.CREDIT)
                                    .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .availableBalanceAmount(
                                        ExpectedPaymentCreateParams.LedgerTransactionCreateRequest
                                            .LedgerEntryCreateRequest
                                            .AvailableBalanceAmount
                                            .builder()
                                            .build()
                                    )
                                    .lockVersion(123L)
                                    .metadata(
                                        ExpectedPaymentCreateParams.LedgerTransactionCreateRequest
                                            .LedgerEntryCreateRequest
                                            .Metadata
                                            .builder()
                                            .build()
                                    )
                                    .pendingBalanceAmount(
                                        ExpectedPaymentCreateParams.LedgerTransactionCreateRequest
                                            .LedgerEntryCreateRequest
                                            .PendingBalanceAmount
                                            .builder()
                                            .build()
                                    )
                                    .postedBalanceAmount(
                                        ExpectedPaymentCreateParams.LedgerTransactionCreateRequest
                                            .LedgerEntryCreateRequest
                                            .PostedBalanceAmount
                                            .builder()
                                            .build()
                                    )
                                    .showResultingLedgerAccountBalances(true)
                                    .build()
                            )
                        )
                        .description("string")
                        .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .effectiveDate(LocalDate.parse("2019-12-27"))
                        .externalId("string")
                        .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .ledgerableType(
                            ExpectedPaymentCreateParams.LedgerTransactionCreateRequest
                                .LedgerableType
                                .COUNTERPARTY
                        )
                        .metadata(
                            ExpectedPaymentCreateParams.LedgerTransactionCreateRequest.Metadata
                                .builder()
                                .build()
                        )
                        .status(
                            ExpectedPaymentCreateParams.LedgerTransactionCreateRequest.Status
                                .ARCHIVED
                        )
                        .build()
                )
                .ledgerTransactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .lineItems(
                    listOf(
                        ExpectedPaymentCreateParams.LineItemRequest.builder()
                            .amount(123L)
                            .accountingCategoryId("string")
                            .description("string")
                            .metadata(
                                ExpectedPaymentCreateParams.LineItemRequest.Metadata.builder()
                                    .build()
                            )
                            .build()
                    )
                )
                .metadata(ExpectedPaymentCreateParams.Metadata.builder().build())
                .reconciliationFilters(JsonNull.of())
                .reconciliationGroups(JsonNull.of())
                .reconciliationRuleVariables(
                    listOf(ExpectedPaymentCreateParams.ReconciliationRuleVariable.builder().build())
                )
                .remittanceInformation("string")
                .statementDescriptor("string")
                .type(ExpectedPaymentType.ACH)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.amountLowerBound()).isEqualTo(123L)
        assertThat(body.amountUpperBound()).isEqualTo(123L)
        assertThat(body.direction()).isEqualTo(TransactionDirection.CREDIT)
        assertThat(body.internalAccountId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.counterpartyId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.currency()).isEqualTo(Currency.AED)
        assertThat(body.dateLowerBound()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(body.dateUpperBound()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(body.description()).isEqualTo("string")
        assertThat(body.ledgerTransaction())
            .isEqualTo(
                ExpectedPaymentCreateParams.LedgerTransactionCreateRequest.builder()
                    .ledgerEntries(
                        listOf(
                            ExpectedPaymentCreateParams.LedgerTransactionCreateRequest
                                .LedgerEntryCreateRequest
                                .builder()
                                .amount(123L)
                                .direction(TransactionDirection.CREDIT)
                                .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .availableBalanceAmount(
                                    ExpectedPaymentCreateParams.LedgerTransactionCreateRequest
                                        .LedgerEntryCreateRequest
                                        .AvailableBalanceAmount
                                        .builder()
                                        .build()
                                )
                                .lockVersion(123L)
                                .metadata(
                                    ExpectedPaymentCreateParams.LedgerTransactionCreateRequest
                                        .LedgerEntryCreateRequest
                                        .Metadata
                                        .builder()
                                        .build()
                                )
                                .pendingBalanceAmount(
                                    ExpectedPaymentCreateParams.LedgerTransactionCreateRequest
                                        .LedgerEntryCreateRequest
                                        .PendingBalanceAmount
                                        .builder()
                                        .build()
                                )
                                .postedBalanceAmount(
                                    ExpectedPaymentCreateParams.LedgerTransactionCreateRequest
                                        .LedgerEntryCreateRequest
                                        .PostedBalanceAmount
                                        .builder()
                                        .build()
                                )
                                .showResultingLedgerAccountBalances(true)
                                .build()
                        )
                    )
                    .description("string")
                    .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .effectiveDate(LocalDate.parse("2019-12-27"))
                    .externalId("string")
                    .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .ledgerableType(
                        ExpectedPaymentCreateParams.LedgerTransactionCreateRequest.LedgerableType
                            .COUNTERPARTY
                    )
                    .metadata(
                        ExpectedPaymentCreateParams.LedgerTransactionCreateRequest.Metadata
                            .builder()
                            .build()
                    )
                    .status(
                        ExpectedPaymentCreateParams.LedgerTransactionCreateRequest.Status.ARCHIVED
                    )
                    .build()
            )
        assertThat(body.ledgerTransactionId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.lineItems())
            .isEqualTo(
                listOf(
                    ExpectedPaymentCreateParams.LineItemRequest.builder()
                        .amount(123L)
                        .accountingCategoryId("string")
                        .description("string")
                        .metadata(
                            ExpectedPaymentCreateParams.LineItemRequest.Metadata.builder().build()
                        )
                        .build()
                )
            )
        assertThat(body.metadata())
            .isEqualTo(ExpectedPaymentCreateParams.Metadata.builder().build())
        assertThat(body.reconciliationFilters()).isEqualTo(JsonNull.of())
        assertThat(body.reconciliationGroups()).isEqualTo(JsonNull.of())
        assertThat(body.reconciliationRuleVariables())
            .isEqualTo(
                listOf(ExpectedPaymentCreateParams.ReconciliationRuleVariable.builder().build())
            )
        assertThat(body.remittanceInformation()).isEqualTo("string")
        assertThat(body.statementDescriptor()).isEqualTo("string")
        assertThat(body.type()).isEqualTo(ExpectedPaymentType.ACH)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            ExpectedPaymentCreateParams.builder()
                .amountLowerBound(123L)
                .amountUpperBound(123L)
                .direction(TransactionDirection.CREDIT)
                .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.amountLowerBound()).isEqualTo(123L)
        assertThat(body.amountUpperBound()).isEqualTo(123L)
        assertThat(body.direction()).isEqualTo(TransactionDirection.CREDIT)
        assertThat(body.internalAccountId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
