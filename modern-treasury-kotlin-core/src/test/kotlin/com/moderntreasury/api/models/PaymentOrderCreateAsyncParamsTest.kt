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
            .type(PaymentOrderType.ACH)
            .subtype(PaymentOrderSubtype.BACS_NEW_INSTRUCTION)
            .amount(123L)
            .direction(PaymentOrderCreateAsyncParams.Direction.CREDIT)
            .priority(PaymentOrderCreateAsyncParams.Priority.HIGH)
            .originatingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .receivingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .accounting(
                PaymentOrderCreateAsyncParams.Accounting.builder()
                    .accountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .classId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
            .accountingCategoryId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .accountingLedgerClassId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .currency(Currency.AED)
            .effectiveDate(LocalDate.parse("2019-12-27"))
            .description("string")
            .statementDescriptor("string")
            .remittanceInformation("string")
            .purpose("string")
            .metadata(PaymentOrderCreateAsyncParams.Metadata.builder().build())
            .chargeBearer(PaymentOrderCreateAsyncParams.ChargeBearer.SHARED)
            .foreignExchangeIndicator(
                PaymentOrderCreateAsyncParams.ForeignExchangeIndicator.FIXED_TO_VARIABLE
            )
            .foreignExchangeContract("string")
            .nsfProtected(true)
            .originatingPartyName("string")
            .ultimateOriginatingPartyName("string")
            .ultimateOriginatingPartyIdentifier("string")
            .ultimateReceivingPartyName("string")
            .ultimateReceivingPartyIdentifier("string")
            .sendRemittanceAdvice(true)
            .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .fallbackType(PaymentOrderCreateAsyncParams.FallbackType.ACH)
            .receivingAccount(
                PaymentOrderCreateAsyncParams.ReceivingAccount.builder()
                    .accountType(ExternalAccountType.CASH)
                    .partyType(PaymentOrderCreateAsyncParams.ReceivingAccount.PartyType.BUSINESS)
                    .partyAddress(
                        PaymentOrderCreateAsyncParams.ReceivingAccount.AddressRequest.builder()
                            .line1("string")
                            .line2("string")
                            .locality("string")
                            .region("string")
                            .postalCode("string")
                            .country("string")
                            .build()
                    )
                    .name("string")
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
                    .metadata(
                        PaymentOrderCreateAsyncParams.ReceivingAccount.Metadata.builder().build()
                    )
                    .partyName("string")
                    .partyIdentifier("string")
                    .ledgerAccount(
                        PaymentOrderCreateAsyncParams.ReceivingAccount.LedgerAccountCreateRequest
                            .builder()
                            .name("string")
                            .description("string")
                            .normalBalance(
                                PaymentOrderCreateAsyncParams.ReceivingAccount
                                    .LedgerAccountCreateRequest
                                    .NormalBalance
                                    .CREDIT
                            )
                            .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .currency("string")
                            .currencyExponent(123L)
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
                    .plaidProcessorToken("string")
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
                    .build()
            )
            .ledgerTransaction(
                PaymentOrderCreateAsyncParams.LedgerTransactionCreateRequest.builder()
                    .description("string")
                    .status(
                        PaymentOrderCreateAsyncParams.LedgerTransactionCreateRequest.Status.ARCHIVED
                    )
                    .metadata(
                        PaymentOrderCreateAsyncParams.LedgerTransactionCreateRequest.Metadata
                            .builder()
                            .build()
                    )
                    .effectiveDate(LocalDate.parse("2019-12-27"))
                    .ledgerEntries(
                        listOf(
                            PaymentOrderCreateAsyncParams.LedgerTransactionCreateRequest
                                .LedgerEntryCreateRequest
                                .builder()
                                .amount(123L)
                                .direction(
                                    PaymentOrderCreateAsyncParams.LedgerTransactionCreateRequest
                                        .LedgerEntryCreateRequest
                                        .Direction
                                        .CREDIT
                                )
                                .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .lockVersion(123L)
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
                                .availableBalanceAmount(
                                    PaymentOrderCreateAsyncParams.LedgerTransactionCreateRequest
                                        .LedgerEntryCreateRequest
                                        .AvailableBalanceAmount
                                        .builder()
                                        .build()
                                )
                                .showResultingLedgerAccountBalances(true)
                                .build()
                        )
                    )
                    .externalId("string")
                    .ledgerableType(
                        PaymentOrderCreateAsyncParams.LedgerTransactionCreateRequest.LedgerableType
                            .COUNTERPARTY
                    )
                    .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
            .lineItems(
                listOf(
                    PaymentOrderCreateAsyncParams.LineItemRequest.builder()
                        .amount(123L)
                        .metadata(
                            PaymentOrderCreateAsyncParams.LineItemRequest.Metadata.builder().build()
                        )
                        .description("string")
                        .accountingCategoryId("string")
                        .build()
                )
            )
            .transactionMonitoringEnabled(true)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            PaymentOrderCreateAsyncParams.builder()
                .type(PaymentOrderType.ACH)
                .subtype(PaymentOrderSubtype.BACS_NEW_INSTRUCTION)
                .amount(123L)
                .direction(PaymentOrderCreateAsyncParams.Direction.CREDIT)
                .priority(PaymentOrderCreateAsyncParams.Priority.HIGH)
                .originatingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .receivingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accounting(
                    PaymentOrderCreateAsyncParams.Accounting.builder()
                        .accountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .classId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .accountingCategoryId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountingLedgerClassId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .currency(Currency.AED)
                .effectiveDate(LocalDate.parse("2019-12-27"))
                .description("string")
                .statementDescriptor("string")
                .remittanceInformation("string")
                .purpose("string")
                .metadata(PaymentOrderCreateAsyncParams.Metadata.builder().build())
                .chargeBearer(PaymentOrderCreateAsyncParams.ChargeBearer.SHARED)
                .foreignExchangeIndicator(
                    PaymentOrderCreateAsyncParams.ForeignExchangeIndicator.FIXED_TO_VARIABLE
                )
                .foreignExchangeContract("string")
                .nsfProtected(true)
                .originatingPartyName("string")
                .ultimateOriginatingPartyName("string")
                .ultimateOriginatingPartyIdentifier("string")
                .ultimateReceivingPartyName("string")
                .ultimateReceivingPartyIdentifier("string")
                .sendRemittanceAdvice(true)
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .fallbackType(PaymentOrderCreateAsyncParams.FallbackType.ACH)
                .receivingAccount(
                    PaymentOrderCreateAsyncParams.ReceivingAccount.builder()
                        .accountType(ExternalAccountType.CASH)
                        .partyType(
                            PaymentOrderCreateAsyncParams.ReceivingAccount.PartyType.BUSINESS
                        )
                        .partyAddress(
                            PaymentOrderCreateAsyncParams.ReceivingAccount.AddressRequest.builder()
                                .line1("string")
                                .line2("string")
                                .locality("string")
                                .region("string")
                                .postalCode("string")
                                .country("string")
                                .build()
                        )
                        .name("string")
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
                        .metadata(
                            PaymentOrderCreateAsyncParams.ReceivingAccount.Metadata.builder()
                                .build()
                        )
                        .partyName("string")
                        .partyIdentifier("string")
                        .ledgerAccount(
                            PaymentOrderCreateAsyncParams.ReceivingAccount
                                .LedgerAccountCreateRequest
                                .builder()
                                .name("string")
                                .description("string")
                                .normalBalance(
                                    PaymentOrderCreateAsyncParams.ReceivingAccount
                                        .LedgerAccountCreateRequest
                                        .NormalBalance
                                        .CREDIT
                                )
                                .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .currency("string")
                                .currencyExponent(123L)
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
                        .plaidProcessorToken("string")
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
                        .build()
                )
                .ledgerTransaction(
                    PaymentOrderCreateAsyncParams.LedgerTransactionCreateRequest.builder()
                        .description("string")
                        .status(
                            PaymentOrderCreateAsyncParams.LedgerTransactionCreateRequest.Status
                                .ARCHIVED
                        )
                        .metadata(
                            PaymentOrderCreateAsyncParams.LedgerTransactionCreateRequest.Metadata
                                .builder()
                                .build()
                        )
                        .effectiveDate(LocalDate.parse("2019-12-27"))
                        .ledgerEntries(
                            listOf(
                                PaymentOrderCreateAsyncParams.LedgerTransactionCreateRequest
                                    .LedgerEntryCreateRequest
                                    .builder()
                                    .amount(123L)
                                    .direction(
                                        PaymentOrderCreateAsyncParams.LedgerTransactionCreateRequest
                                            .LedgerEntryCreateRequest
                                            .Direction
                                            .CREDIT
                                    )
                                    .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .lockVersion(123L)
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
                                    .availableBalanceAmount(
                                        PaymentOrderCreateAsyncParams.LedgerTransactionCreateRequest
                                            .LedgerEntryCreateRequest
                                            .AvailableBalanceAmount
                                            .builder()
                                            .build()
                                    )
                                    .showResultingLedgerAccountBalances(true)
                                    .build()
                            )
                        )
                        .externalId("string")
                        .ledgerableType(
                            PaymentOrderCreateAsyncParams.LedgerTransactionCreateRequest
                                .LedgerableType
                                .COUNTERPARTY
                        )
                        .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .lineItems(
                    listOf(
                        PaymentOrderCreateAsyncParams.LineItemRequest.builder()
                            .amount(123L)
                            .metadata(
                                PaymentOrderCreateAsyncParams.LineItemRequest.Metadata.builder()
                                    .build()
                            )
                            .description("string")
                            .accountingCategoryId("string")
                            .build()
                    )
                )
                .transactionMonitoringEnabled(true)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.type()).isEqualTo(PaymentOrderType.ACH)
        assertThat(body.subtype()).isEqualTo(PaymentOrderSubtype.BACS_NEW_INSTRUCTION)
        assertThat(body.amount()).isEqualTo(123L)
        assertThat(body.direction()).isEqualTo(PaymentOrderCreateAsyncParams.Direction.CREDIT)
        assertThat(body.priority()).isEqualTo(PaymentOrderCreateAsyncParams.Priority.HIGH)
        assertThat(body.originatingAccountId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.receivingAccountId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.accounting())
            .isEqualTo(
                PaymentOrderCreateAsyncParams.Accounting.builder()
                    .accountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .classId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        assertThat(body.accountingCategoryId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.accountingLedgerClassId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.currency()).isEqualTo(Currency.AED)
        assertThat(body.effectiveDate()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(body.description()).isEqualTo("string")
        assertThat(body.statementDescriptor()).isEqualTo("string")
        assertThat(body.remittanceInformation()).isEqualTo("string")
        assertThat(body.purpose()).isEqualTo("string")
        assertThat(body.metadata())
            .isEqualTo(PaymentOrderCreateAsyncParams.Metadata.builder().build())
        assertThat(body.chargeBearer()).isEqualTo(PaymentOrderCreateAsyncParams.ChargeBearer.SHARED)
        assertThat(body.foreignExchangeIndicator())
            .isEqualTo(PaymentOrderCreateAsyncParams.ForeignExchangeIndicator.FIXED_TO_VARIABLE)
        assertThat(body.foreignExchangeContract()).isEqualTo("string")
        assertThat(body.nsfProtected()).isEqualTo(true)
        assertThat(body.originatingPartyName()).isEqualTo("string")
        assertThat(body.ultimateOriginatingPartyName()).isEqualTo("string")
        assertThat(body.ultimateOriginatingPartyIdentifier()).isEqualTo("string")
        assertThat(body.ultimateReceivingPartyName()).isEqualTo("string")
        assertThat(body.ultimateReceivingPartyIdentifier()).isEqualTo("string")
        assertThat(body.sendRemittanceAdvice()).isEqualTo(true)
        assertThat(body.expiresAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.fallbackType()).isEqualTo(PaymentOrderCreateAsyncParams.FallbackType.ACH)
        assertThat(body.receivingAccount())
            .isEqualTo(
                PaymentOrderCreateAsyncParams.ReceivingAccount.builder()
                    .accountType(ExternalAccountType.CASH)
                    .partyType(PaymentOrderCreateAsyncParams.ReceivingAccount.PartyType.BUSINESS)
                    .partyAddress(
                        PaymentOrderCreateAsyncParams.ReceivingAccount.AddressRequest.builder()
                            .line1("string")
                            .line2("string")
                            .locality("string")
                            .region("string")
                            .postalCode("string")
                            .country("string")
                            .build()
                    )
                    .name("string")
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
                    .metadata(
                        PaymentOrderCreateAsyncParams.ReceivingAccount.Metadata.builder().build()
                    )
                    .partyName("string")
                    .partyIdentifier("string")
                    .ledgerAccount(
                        PaymentOrderCreateAsyncParams.ReceivingAccount.LedgerAccountCreateRequest
                            .builder()
                            .name("string")
                            .description("string")
                            .normalBalance(
                                PaymentOrderCreateAsyncParams.ReceivingAccount
                                    .LedgerAccountCreateRequest
                                    .NormalBalance
                                    .CREDIT
                            )
                            .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .currency("string")
                            .currencyExponent(123L)
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
                    .plaidProcessorToken("string")
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
                    .build()
            )
        assertThat(body.ledgerTransaction())
            .isEqualTo(
                PaymentOrderCreateAsyncParams.LedgerTransactionCreateRequest.builder()
                    .description("string")
                    .status(
                        PaymentOrderCreateAsyncParams.LedgerTransactionCreateRequest.Status.ARCHIVED
                    )
                    .metadata(
                        PaymentOrderCreateAsyncParams.LedgerTransactionCreateRequest.Metadata
                            .builder()
                            .build()
                    )
                    .effectiveDate(LocalDate.parse("2019-12-27"))
                    .ledgerEntries(
                        listOf(
                            PaymentOrderCreateAsyncParams.LedgerTransactionCreateRequest
                                .LedgerEntryCreateRequest
                                .builder()
                                .amount(123L)
                                .direction(
                                    PaymentOrderCreateAsyncParams.LedgerTransactionCreateRequest
                                        .LedgerEntryCreateRequest
                                        .Direction
                                        .CREDIT
                                )
                                .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .lockVersion(123L)
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
                                .availableBalanceAmount(
                                    PaymentOrderCreateAsyncParams.LedgerTransactionCreateRequest
                                        .LedgerEntryCreateRequest
                                        .AvailableBalanceAmount
                                        .builder()
                                        .build()
                                )
                                .showResultingLedgerAccountBalances(true)
                                .build()
                        )
                    )
                    .externalId("string")
                    .ledgerableType(
                        PaymentOrderCreateAsyncParams.LedgerTransactionCreateRequest.LedgerableType
                            .COUNTERPARTY
                    )
                    .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        assertThat(body.lineItems())
            .isEqualTo(
                listOf(
                    PaymentOrderCreateAsyncParams.LineItemRequest.builder()
                        .amount(123L)
                        .metadata(
                            PaymentOrderCreateAsyncParams.LineItemRequest.Metadata.builder().build()
                        )
                        .description("string")
                        .accountingCategoryId("string")
                        .build()
                )
            )
        assertThat(body.transactionMonitoringEnabled()).isEqualTo(true)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            PaymentOrderCreateAsyncParams.builder()
                .type(PaymentOrderType.ACH)
                .amount(123L)
                .direction(PaymentOrderCreateAsyncParams.Direction.CREDIT)
                .originatingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.type()).isEqualTo(PaymentOrderType.ACH)
        assertThat(body.amount()).isEqualTo(123L)
        assertThat(body.direction()).isEqualTo(PaymentOrderCreateAsyncParams.Direction.CREDIT)
        assertThat(body.originatingAccountId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
