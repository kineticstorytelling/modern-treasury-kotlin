// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PaymentOrderCreateAsyncParamsTest {

    @Test
    fun createPaymentOrderCreateAsyncParams() {
        PaymentOrderCreateAsyncParams.builder()
            .amount(123L)
            .direction(PaymentOrderCreateAsyncParams.Direction.CREDIT)
            .originatingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .type(PaymentOrderType.ACH)
            .accounting(
                PaymentOrderCreateAsyncParams.Accounting.builder()
                    .accountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .classId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
            .accountingCategoryId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .accountingLedgerClassId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .chargeBearer(PaymentOrderCreateAsyncParams.ChargeBearer.SHARED)
            .currency(Currency.AED)
            .description("string")
            .effectiveDate(LocalDate.parse("2019-12-27"))
            .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .fallbackType(PaymentOrderCreateAsyncParams.FallbackType.ACH)
            .foreignExchangeContract("string")
            .foreignExchangeIndicator(
                PaymentOrderCreateAsyncParams.ForeignExchangeIndicator.FIXED_TO_VARIABLE
            )
            .ledgerTransaction(
                PaymentOrderCreateAsyncParams.LedgerTransactionCreateRequest.builder()
                    .ledgerEntries(
                        listOf(
                            PaymentOrderCreateAsyncParams.LedgerTransactionCreateRequest
                                .LedgerEntryCreateRequest
                                .builder()
                                .amount(123L)
                                .direction(TransactionDirection.CREDIT)
                                .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .availableBalanceAmount(
                                    PaymentOrderCreateAsyncParams.LedgerTransactionCreateRequest
                                        .LedgerEntryCreateRequest
                                        .AvailableBalanceAmount
                                        .builder()
                                        .build()
                                )
                                .lockVersion(123L)
                                .metadata(
                                    PaymentOrderCreateAsyncParams.LedgerTransactionCreateRequest
                                        .LedgerEntryCreateRequest
                                        .Metadata
                                        .builder()
                                        .build()
                                )
                                .pendingBalanceAmount(
                                    PaymentOrderCreateAsyncParams.LedgerTransactionCreateRequest
                                        .LedgerEntryCreateRequest
                                        .PendingBalanceAmount
                                        .builder()
                                        .build()
                                )
                                .postedBalanceAmount(
                                    PaymentOrderCreateAsyncParams.LedgerTransactionCreateRequest
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
                        PaymentOrderCreateAsyncParams.LedgerTransactionCreateRequest.LedgerableType
                            .COUNTERPARTY
                    )
                    .metadata(
                        PaymentOrderCreateAsyncParams.LedgerTransactionCreateRequest.Metadata
                            .builder()
                            .build()
                    )
                    .status(
                        PaymentOrderCreateAsyncParams.LedgerTransactionCreateRequest.Status.ARCHIVED
                    )
                    .build()
            )
            .ledgerTransactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .lineItems(
                listOf(
                    PaymentOrderCreateAsyncParams.LineItemRequest.builder()
                        .amount(123L)
                        .accountingCategoryId("string")
                        .description("string")
                        .metadata(
                            PaymentOrderCreateAsyncParams.LineItemRequest.Metadata.builder().build()
                        )
                        .build()
                )
            )
            .metadata(PaymentOrderCreateAsyncParams.Metadata.builder().build())
            .nsfProtected(true)
            .originatingPartyName("string")
            .priority(PaymentOrderCreateAsyncParams.Priority.HIGH)
            .processAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .purpose("string")
            .receivingAccount(
                PaymentOrderCreateAsyncParams.ReceivingAccount.builder()
                    .accountDetails(
                        listOf(
                            PaymentOrderCreateAsyncParams.ReceivingAccount.AccountDetail.builder()
                                .accountNumber("string")
                                .accountNumberType(
                                    PaymentOrderCreateAsyncParams.ReceivingAccount.AccountDetail
                                        .AccountNumberType
                                        .IBAN
                                )
                                .build()
                        )
                    )
                    .accountType(ExternalAccountType.CASH)
                    .contactDetails(
                        listOf(
                            PaymentOrderCreateAsyncParams.ReceivingAccount
                                .ContactDetailCreateRequest
                                .builder()
                                .contactIdentifier("string")
                                .contactIdentifierType(
                                    PaymentOrderCreateAsyncParams.ReceivingAccount
                                        .ContactDetailCreateRequest
                                        .ContactIdentifierType
                                        .EMAIL
                                )
                                .build()
                        )
                    )
                    .ledgerAccount(
                        PaymentOrderCreateAsyncParams.ReceivingAccount.LedgerAccountCreateRequest
                            .builder()
                            .currency("string")
                            .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .name("string")
                            .normalBalance(TransactionDirection.CREDIT)
                            .currencyExponent(123L)
                            .description("string")
                            .ledgerAccountCategoryIds(
                                listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            )
                            .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .ledgerableType(
                                PaymentOrderCreateAsyncParams.ReceivingAccount
                                    .LedgerAccountCreateRequest
                                    .LedgerableType
                                    .EXTERNAL_ACCOUNT
                            )
                            .metadata(
                                PaymentOrderCreateAsyncParams.ReceivingAccount
                                    .LedgerAccountCreateRequest
                                    .Metadata
                                    .builder()
                                    .build()
                            )
                            .build()
                    )
                    .metadata(
                        PaymentOrderCreateAsyncParams.ReceivingAccount.Metadata.builder().build()
                    )
                    .name("string")
                    .partyAddress(
                        PaymentOrderCreateAsyncParams.ReceivingAccount.AddressRequest.builder()
                            .country("string")
                            .line1("string")
                            .line2("string")
                            .locality("string")
                            .postalCode("string")
                            .region("string")
                            .build()
                    )
                    .partyIdentifier("string")
                    .partyName("string")
                    .partyType(PaymentOrderCreateAsyncParams.ReceivingAccount.PartyType.BUSINESS)
                    .plaidProcessorToken("string")
                    .routingDetails(
                        listOf(
                            PaymentOrderCreateAsyncParams.ReceivingAccount.RoutingDetail.builder()
                                .routingNumber("string")
                                .routingNumberType(
                                    PaymentOrderCreateAsyncParams.ReceivingAccount.RoutingDetail
                                        .RoutingNumberType
                                        .ABA
                                )
                                .paymentType(
                                    PaymentOrderCreateAsyncParams.ReceivingAccount.RoutingDetail
                                        .PaymentType
                                        .ACH
                                )
                                .build()
                        )
                    )
                    .build()
            )
            .receivingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .remittanceInformation("string")
            .sendRemittanceAdvice(true)
            .statementDescriptor("string")
            .subtype(PaymentOrderSubtype.BACS_NEW_INSTRUCTION)
            .transactionMonitoringEnabled(true)
            .ultimateOriginatingPartyIdentifier("string")
            .ultimateOriginatingPartyName("string")
            .ultimateReceivingPartyIdentifier("string")
            .ultimateReceivingPartyName("string")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            PaymentOrderCreateAsyncParams.builder()
                .amount(123L)
                .direction(PaymentOrderCreateAsyncParams.Direction.CREDIT)
                .originatingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .type(PaymentOrderType.ACH)
                .accounting(
                    PaymentOrderCreateAsyncParams.Accounting.builder()
                        .accountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .classId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .accountingCategoryId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountingLedgerClassId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .chargeBearer(PaymentOrderCreateAsyncParams.ChargeBearer.SHARED)
                .currency(Currency.AED)
                .description("string")
                .effectiveDate(LocalDate.parse("2019-12-27"))
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .fallbackType(PaymentOrderCreateAsyncParams.FallbackType.ACH)
                .foreignExchangeContract("string")
                .foreignExchangeIndicator(
                    PaymentOrderCreateAsyncParams.ForeignExchangeIndicator.FIXED_TO_VARIABLE
                )
                .ledgerTransaction(
                    PaymentOrderCreateAsyncParams.LedgerTransactionCreateRequest.builder()
                        .ledgerEntries(
                            listOf(
                                PaymentOrderCreateAsyncParams.LedgerTransactionCreateRequest
                                    .LedgerEntryCreateRequest
                                    .builder()
                                    .amount(123L)
                                    .direction(TransactionDirection.CREDIT)
                                    .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .availableBalanceAmount(
                                        PaymentOrderCreateAsyncParams.LedgerTransactionCreateRequest
                                            .LedgerEntryCreateRequest
                                            .AvailableBalanceAmount
                                            .builder()
                                            .build()
                                    )
                                    .lockVersion(123L)
                                    .metadata(
                                        PaymentOrderCreateAsyncParams.LedgerTransactionCreateRequest
                                            .LedgerEntryCreateRequest
                                            .Metadata
                                            .builder()
                                            .build()
                                    )
                                    .pendingBalanceAmount(
                                        PaymentOrderCreateAsyncParams.LedgerTransactionCreateRequest
                                            .LedgerEntryCreateRequest
                                            .PendingBalanceAmount
                                            .builder()
                                            .build()
                                    )
                                    .postedBalanceAmount(
                                        PaymentOrderCreateAsyncParams.LedgerTransactionCreateRequest
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
                            PaymentOrderCreateAsyncParams.LedgerTransactionCreateRequest
                                .LedgerableType
                                .COUNTERPARTY
                        )
                        .metadata(
                            PaymentOrderCreateAsyncParams.LedgerTransactionCreateRequest.Metadata
                                .builder()
                                .build()
                        )
                        .status(
                            PaymentOrderCreateAsyncParams.LedgerTransactionCreateRequest.Status
                                .ARCHIVED
                        )
                        .build()
                )
                .ledgerTransactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .lineItems(
                    listOf(
                        PaymentOrderCreateAsyncParams.LineItemRequest.builder()
                            .amount(123L)
                            .accountingCategoryId("string")
                            .description("string")
                            .metadata(
                                PaymentOrderCreateAsyncParams.LineItemRequest.Metadata.builder()
                                    .build()
                            )
                            .build()
                    )
                )
                .metadata(PaymentOrderCreateAsyncParams.Metadata.builder().build())
                .nsfProtected(true)
                .originatingPartyName("string")
                .priority(PaymentOrderCreateAsyncParams.Priority.HIGH)
                .processAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .purpose("string")
                .receivingAccount(
                    PaymentOrderCreateAsyncParams.ReceivingAccount.builder()
                        .accountDetails(
                            listOf(
                                PaymentOrderCreateAsyncParams.ReceivingAccount.AccountDetail
                                    .builder()
                                    .accountNumber("string")
                                    .accountNumberType(
                                        PaymentOrderCreateAsyncParams.ReceivingAccount.AccountDetail
                                            .AccountNumberType
                                            .IBAN
                                    )
                                    .build()
                            )
                        )
                        .accountType(ExternalAccountType.CASH)
                        .contactDetails(
                            listOf(
                                PaymentOrderCreateAsyncParams.ReceivingAccount
                                    .ContactDetailCreateRequest
                                    .builder()
                                    .contactIdentifier("string")
                                    .contactIdentifierType(
                                        PaymentOrderCreateAsyncParams.ReceivingAccount
                                            .ContactDetailCreateRequest
                                            .ContactIdentifierType
                                            .EMAIL
                                    )
                                    .build()
                            )
                        )
                        .ledgerAccount(
                            PaymentOrderCreateAsyncParams.ReceivingAccount
                                .LedgerAccountCreateRequest
                                .builder()
                                .currency("string")
                                .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .name("string")
                                .normalBalance(TransactionDirection.CREDIT)
                                .currencyExponent(123L)
                                .description("string")
                                .ledgerAccountCategoryIds(
                                    listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                )
                                .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .ledgerableType(
                                    PaymentOrderCreateAsyncParams.ReceivingAccount
                                        .LedgerAccountCreateRequest
                                        .LedgerableType
                                        .EXTERNAL_ACCOUNT
                                )
                                .metadata(
                                    PaymentOrderCreateAsyncParams.ReceivingAccount
                                        .LedgerAccountCreateRequest
                                        .Metadata
                                        .builder()
                                        .build()
                                )
                                .build()
                        )
                        .metadata(
                            PaymentOrderCreateAsyncParams.ReceivingAccount.Metadata.builder()
                                .build()
                        )
                        .name("string")
                        .partyAddress(
                            PaymentOrderCreateAsyncParams.ReceivingAccount.AddressRequest.builder()
                                .country("string")
                                .line1("string")
                                .line2("string")
                                .locality("string")
                                .postalCode("string")
                                .region("string")
                                .build()
                        )
                        .partyIdentifier("string")
                        .partyName("string")
                        .partyType(
                            PaymentOrderCreateAsyncParams.ReceivingAccount.PartyType.BUSINESS
                        )
                        .plaidProcessorToken("string")
                        .routingDetails(
                            listOf(
                                PaymentOrderCreateAsyncParams.ReceivingAccount.RoutingDetail
                                    .builder()
                                    .routingNumber("string")
                                    .routingNumberType(
                                        PaymentOrderCreateAsyncParams.ReceivingAccount.RoutingDetail
                                            .RoutingNumberType
                                            .ABA
                                    )
                                    .paymentType(
                                        PaymentOrderCreateAsyncParams.ReceivingAccount.RoutingDetail
                                            .PaymentType
                                            .ACH
                                    )
                                    .build()
                            )
                        )
                        .build()
                )
                .receivingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .remittanceInformation("string")
                .sendRemittanceAdvice(true)
                .statementDescriptor("string")
                .subtype(PaymentOrderSubtype.BACS_NEW_INSTRUCTION)
                .transactionMonitoringEnabled(true)
                .ultimateOriginatingPartyIdentifier("string")
                .ultimateOriginatingPartyName("string")
                .ultimateReceivingPartyIdentifier("string")
                .ultimateReceivingPartyName("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.amount()).isEqualTo(123L)
        assertThat(body.direction()).isEqualTo(PaymentOrderCreateAsyncParams.Direction.CREDIT)
        assertThat(body.originatingAccountId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.type()).isEqualTo(PaymentOrderType.ACH)
        assertThat(body.accounting())
            .isEqualTo(
                PaymentOrderCreateAsyncParams.Accounting.builder()
                    .accountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .classId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        assertThat(body.accountingCategoryId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.accountingLedgerClassId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.chargeBearer()).isEqualTo(PaymentOrderCreateAsyncParams.ChargeBearer.SHARED)
        assertThat(body.currency()).isEqualTo(Currency.AED)
        assertThat(body.description()).isEqualTo("string")
        assertThat(body.effectiveDate()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(body.expiresAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.fallbackType()).isEqualTo(PaymentOrderCreateAsyncParams.FallbackType.ACH)
        assertThat(body.foreignExchangeContract()).isEqualTo("string")
        assertThat(body.foreignExchangeIndicator())
            .isEqualTo(PaymentOrderCreateAsyncParams.ForeignExchangeIndicator.FIXED_TO_VARIABLE)
        assertThat(body.ledgerTransaction())
            .isEqualTo(
                PaymentOrderCreateAsyncParams.LedgerTransactionCreateRequest.builder()
                    .ledgerEntries(
                        listOf(
                            PaymentOrderCreateAsyncParams.LedgerTransactionCreateRequest
                                .LedgerEntryCreateRequest
                                .builder()
                                .amount(123L)
                                .direction(TransactionDirection.CREDIT)
                                .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .availableBalanceAmount(
                                    PaymentOrderCreateAsyncParams.LedgerTransactionCreateRequest
                                        .LedgerEntryCreateRequest
                                        .AvailableBalanceAmount
                                        .builder()
                                        .build()
                                )
                                .lockVersion(123L)
                                .metadata(
                                    PaymentOrderCreateAsyncParams.LedgerTransactionCreateRequest
                                        .LedgerEntryCreateRequest
                                        .Metadata
                                        .builder()
                                        .build()
                                )
                                .pendingBalanceAmount(
                                    PaymentOrderCreateAsyncParams.LedgerTransactionCreateRequest
                                        .LedgerEntryCreateRequest
                                        .PendingBalanceAmount
                                        .builder()
                                        .build()
                                )
                                .postedBalanceAmount(
                                    PaymentOrderCreateAsyncParams.LedgerTransactionCreateRequest
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
                        PaymentOrderCreateAsyncParams.LedgerTransactionCreateRequest.LedgerableType
                            .COUNTERPARTY
                    )
                    .metadata(
                        PaymentOrderCreateAsyncParams.LedgerTransactionCreateRequest.Metadata
                            .builder()
                            .build()
                    )
                    .status(
                        PaymentOrderCreateAsyncParams.LedgerTransactionCreateRequest.Status.ARCHIVED
                    )
                    .build()
            )
        assertThat(body.ledgerTransactionId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.lineItems())
            .isEqualTo(
                listOf(
                    PaymentOrderCreateAsyncParams.LineItemRequest.builder()
                        .amount(123L)
                        .accountingCategoryId("string")
                        .description("string")
                        .metadata(
                            PaymentOrderCreateAsyncParams.LineItemRequest.Metadata.builder().build()
                        )
                        .build()
                )
            )
        assertThat(body.metadata())
            .isEqualTo(PaymentOrderCreateAsyncParams.Metadata.builder().build())
        assertThat(body.nsfProtected()).isEqualTo(true)
        assertThat(body.originatingPartyName()).isEqualTo("string")
        assertThat(body.priority()).isEqualTo(PaymentOrderCreateAsyncParams.Priority.HIGH)
        assertThat(body.processAfter()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.purpose()).isEqualTo("string")
        assertThat(body.receivingAccount())
            .isEqualTo(
                PaymentOrderCreateAsyncParams.ReceivingAccount.builder()
                    .accountDetails(
                        listOf(
                            PaymentOrderCreateAsyncParams.ReceivingAccount.AccountDetail.builder()
                                .accountNumber("string")
                                .accountNumberType(
                                    PaymentOrderCreateAsyncParams.ReceivingAccount.AccountDetail
                                        .AccountNumberType
                                        .IBAN
                                )
                                .build()
                        )
                    )
                    .accountType(ExternalAccountType.CASH)
                    .contactDetails(
                        listOf(
                            PaymentOrderCreateAsyncParams.ReceivingAccount
                                .ContactDetailCreateRequest
                                .builder()
                                .contactIdentifier("string")
                                .contactIdentifierType(
                                    PaymentOrderCreateAsyncParams.ReceivingAccount
                                        .ContactDetailCreateRequest
                                        .ContactIdentifierType
                                        .EMAIL
                                )
                                .build()
                        )
                    )
                    .ledgerAccount(
                        PaymentOrderCreateAsyncParams.ReceivingAccount.LedgerAccountCreateRequest
                            .builder()
                            .currency("string")
                            .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .name("string")
                            .normalBalance(TransactionDirection.CREDIT)
                            .currencyExponent(123L)
                            .description("string")
                            .ledgerAccountCategoryIds(
                                listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            )
                            .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .ledgerableType(
                                PaymentOrderCreateAsyncParams.ReceivingAccount
                                    .LedgerAccountCreateRequest
                                    .LedgerableType
                                    .EXTERNAL_ACCOUNT
                            )
                            .metadata(
                                PaymentOrderCreateAsyncParams.ReceivingAccount
                                    .LedgerAccountCreateRequest
                                    .Metadata
                                    .builder()
                                    .build()
                            )
                            .build()
                    )
                    .metadata(
                        PaymentOrderCreateAsyncParams.ReceivingAccount.Metadata.builder().build()
                    )
                    .name("string")
                    .partyAddress(
                        PaymentOrderCreateAsyncParams.ReceivingAccount.AddressRequest.builder()
                            .country("string")
                            .line1("string")
                            .line2("string")
                            .locality("string")
                            .postalCode("string")
                            .region("string")
                            .build()
                    )
                    .partyIdentifier("string")
                    .partyName("string")
                    .partyType(PaymentOrderCreateAsyncParams.ReceivingAccount.PartyType.BUSINESS)
                    .plaidProcessorToken("string")
                    .routingDetails(
                        listOf(
                            PaymentOrderCreateAsyncParams.ReceivingAccount.RoutingDetail.builder()
                                .routingNumber("string")
                                .routingNumberType(
                                    PaymentOrderCreateAsyncParams.ReceivingAccount.RoutingDetail
                                        .RoutingNumberType
                                        .ABA
                                )
                                .paymentType(
                                    PaymentOrderCreateAsyncParams.ReceivingAccount.RoutingDetail
                                        .PaymentType
                                        .ACH
                                )
                                .build()
                        )
                    )
                    .build()
            )
        assertThat(body.receivingAccountId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.remittanceInformation()).isEqualTo("string")
        assertThat(body.sendRemittanceAdvice()).isEqualTo(true)
        assertThat(body.statementDescriptor()).isEqualTo("string")
        assertThat(body.subtype()).isEqualTo(PaymentOrderSubtype.BACS_NEW_INSTRUCTION)
        assertThat(body.transactionMonitoringEnabled()).isEqualTo(true)
        assertThat(body.ultimateOriginatingPartyIdentifier()).isEqualTo("string")
        assertThat(body.ultimateOriginatingPartyName()).isEqualTo("string")
        assertThat(body.ultimateReceivingPartyIdentifier()).isEqualTo("string")
        assertThat(body.ultimateReceivingPartyName()).isEqualTo("string")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            PaymentOrderCreateAsyncParams.builder()
                .amount(123L)
                .direction(PaymentOrderCreateAsyncParams.Direction.CREDIT)
                .originatingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .type(PaymentOrderType.ACH)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.amount()).isEqualTo(123L)
        assertThat(body.direction()).isEqualTo(PaymentOrderCreateAsyncParams.Direction.CREDIT)
        assertThat(body.originatingAccountId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.type()).isEqualTo(PaymentOrderType.ACH)
    }
}
