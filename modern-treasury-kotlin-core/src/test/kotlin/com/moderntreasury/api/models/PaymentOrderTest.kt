// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PaymentOrderTest {

    @Test
    fun createPaymentOrder() {
        val paymentOrder =
            PaymentOrder.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accounting(
                    PaymentOrder.Accounting.builder()
                        .accountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .classId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .accountingCategoryId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountingLedgerClassId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .amount(123L)
                .chargeBearer(PaymentOrder.ChargeBearer.SHARED)
                .complianceRuleMetadata(PaymentOrder.ComplianceRuleMetadata.builder().build())
                .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency(Currency.AED)
                .currentReturn(
                    ReturnObject.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .amount(123L)
                        .code(ReturnObject.Code._901)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency(Currency.AED)
                        .currentReturn(
                            ReturnObject.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .amount(123L)
                                .code(ReturnObject.Code._901)
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .currency(Currency.AED)
                                .dateOfDeath(LocalDate.parse("2019-12-27"))
                                .failureReason("string")
                                .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .ledgerTransactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .liveMode(true)
                                .object_("string")
                                .reason("string")
                                .referenceNumbers(
                                    listOf(
                                        ReturnObject.PaymentReference.builder()
                                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                            .createdAt(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
                                            .liveMode(true)
                                            .object_("string")
                                            .referenceNumber("string")
                                            .referenceNumberType(
                                                ReturnObject.PaymentReference.ReferenceNumberType
                                                    .ACH_ORIGINAL_TRACE_NUMBER
                                            )
                                            .updatedAt(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
                                            .build()
                                    )
                                )
                                .returnableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .returnableType(ReturnObject.ReturnableType.INCOMING_PAYMENT_DETAIL)
                                .role(ReturnObject.Role.ORIGINATING)
                                .status(ReturnObject.Status.COMPLETED)
                                .transactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .transactionLineItemId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .type(ReturnObject.Type.ACH)
                                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .additionalInformation("string")
                                .build()
                        )
                        .dateOfDeath(LocalDate.parse("2019-12-27"))
                        .failureReason("string")
                        .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .ledgerTransactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .liveMode(true)
                        .object_("string")
                        .reason("string")
                        .referenceNumbers(
                            listOf(
                                ReturnObject.PaymentReference.builder()
                                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .liveMode(true)
                                    .object_("string")
                                    .referenceNumber("string")
                                    .referenceNumberType(
                                        ReturnObject.PaymentReference.ReferenceNumberType
                                            .ACH_ORIGINAL_TRACE_NUMBER
                                    )
                                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .build()
                            )
                        )
                        .returnableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .returnableType(ReturnObject.ReturnableType.INCOMING_PAYMENT_DETAIL)
                        .role(ReturnObject.Role.ORIGINATING)
                        .status(ReturnObject.Status.COMPLETED)
                        .transactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .transactionLineItemId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .type(ReturnObject.Type.ACH)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .additionalInformation("string")
                        .build()
                )
                .decisionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .description("string")
                .direction(PaymentOrder.Direction.CREDIT)
                .effectiveDate(LocalDate.parse("2019-12-27"))
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .foreignExchangeContract("string")
                .foreignExchangeIndicator(PaymentOrder.ForeignExchangeIndicator.FIXED_TO_VARIABLE)
                .ledgerTransactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .liveMode(true)
                .metadata(PaymentOrder.Metadata.builder().build())
                .nsfProtected(true)
                .object_("string")
                .originatingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .originatingPartyName("string")
                .priority(PaymentOrder.Priority.HIGH)
                .processAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .purpose("string")
                .receivingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .receivingAccountType(PaymentOrder.ReceivingAccountType.INTERNAL_ACCOUNT)
                .referenceNumbers(
                    listOf(
                        PaymentOrder.PaymentReference.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .liveMode(true)
                            .object_("string")
                            .referenceNumber("string")
                            .referenceNumberType(
                                PaymentOrder.PaymentReference.ReferenceNumberType
                                    .ACH_ORIGINAL_TRACE_NUMBER
                            )
                            .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                )
                .remittanceInformation("string")
                .sendRemittanceAdvice(true)
                .statementDescriptor("string")
                .status(PaymentOrder.Status.APPROVED)
                .subtype(PaymentOrderSubtype.BACS_NEW_INSTRUCTION)
                .transactionIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .transactionMonitoringEnabled(true)
                .type(PaymentOrderType.ACH)
                .ultimateOriginatingAccount(
                    PaymentOrder.UltimateOriginatingAccount.ofVirtualAccount(
                        VirtualAccount.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .accountDetails(
                                listOf(
                                    AccountDetail.builder()
                                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .accountNumberSafe("string")
                                        .accountNumberType(AccountDetail.AccountNumberType.CLABE)
                                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                        .discardedAt(
                                            OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                        )
                                        .liveMode(true)
                                        .object_("string")
                                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                        .accountNumber("string")
                                        .build()
                                )
                            )
                            .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .creditLedgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .debitLedgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .description("string")
                            .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .liveMode(true)
                            .metadata(VirtualAccount.Metadata.builder().build())
                            .name("string")
                            .object_("string")
                            .routingDetails(
                                listOf(
                                    RoutingDetail.builder()
                                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .bankAddress(
                                            RoutingDetail.Address.builder()
                                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                                .country("string")
                                                .createdAt(
                                                    OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                                )
                                                .line1("string")
                                                .line2("string")
                                                .liveMode(true)
                                                .locality("string")
                                                .object_("string")
                                                .postalCode("string")
                                                .region("string")
                                                .updatedAt(
                                                    OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                                )
                                                .build()
                                        )
                                        .bankName("string")
                                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                        .discardedAt(
                                            OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                        )
                                        .liveMode(true)
                                        .object_("string")
                                        .paymentType(RoutingDetail.PaymentType.ACH)
                                        .routingNumber("string")
                                        .routingNumberType(RoutingDetail.RoutingNumberType.ABA)
                                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                        .build()
                                )
                            )
                            .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                )
                .ultimateOriginatingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .ultimateOriginatingAccountType(
                    PaymentOrder.UltimateOriginatingAccountType.INTERNAL_ACCOUNT
                )
                .ultimateOriginatingPartyIdentifier("string")
                .ultimateOriginatingPartyName("string")
                .ultimateReceivingPartyIdentifier("string")
                .ultimateReceivingPartyName("string")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .vendorFailureReason("string")
                .build()
        assertThat(paymentOrder).isNotNull
        assertThat(paymentOrder.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentOrder.accounting())
            .isEqualTo(
                PaymentOrder.Accounting.builder()
                    .accountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .classId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        assertThat(paymentOrder.accountingCategoryId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentOrder.accountingLedgerClassId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentOrder.amount()).isEqualTo(123L)
        assertThat(paymentOrder.chargeBearer()).isEqualTo(PaymentOrder.ChargeBearer.SHARED)
        assertThat(paymentOrder.complianceRuleMetadata())
            .isEqualTo(PaymentOrder.ComplianceRuleMetadata.builder().build())
        assertThat(paymentOrder.counterpartyId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentOrder.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(paymentOrder.currency()).isEqualTo(Currency.AED)
        assertThat(paymentOrder.currentReturn())
            .isEqualTo(
                ReturnObject.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .amount(123L)
                    .code(ReturnObject.Code._901)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .currency(Currency.AED)
                    .currentReturn(
                        ReturnObject.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .amount(123L)
                            .code(ReturnObject.Code._901)
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .currency(Currency.AED)
                            .dateOfDeath(LocalDate.parse("2019-12-27"))
                            .failureReason("string")
                            .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .ledgerTransactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .liveMode(true)
                            .object_("string")
                            .reason("string")
                            .referenceNumbers(
                                listOf(
                                    ReturnObject.PaymentReference.builder()
                                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                        .liveMode(true)
                                        .object_("string")
                                        .referenceNumber("string")
                                        .referenceNumberType(
                                            ReturnObject.PaymentReference.ReferenceNumberType
                                                .ACH_ORIGINAL_TRACE_NUMBER
                                        )
                                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                        .build()
                                )
                            )
                            .returnableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .returnableType(ReturnObject.ReturnableType.INCOMING_PAYMENT_DETAIL)
                            .role(ReturnObject.Role.ORIGINATING)
                            .status(ReturnObject.Status.COMPLETED)
                            .transactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .transactionLineItemId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .type(ReturnObject.Type.ACH)
                            .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .additionalInformation("string")
                            .build()
                    )
                    .dateOfDeath(LocalDate.parse("2019-12-27"))
                    .failureReason("string")
                    .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .ledgerTransactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .liveMode(true)
                    .object_("string")
                    .reason("string")
                    .referenceNumbers(
                        listOf(
                            ReturnObject.PaymentReference.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .liveMode(true)
                                .object_("string")
                                .referenceNumber("string")
                                .referenceNumberType(
                                    ReturnObject.PaymentReference.ReferenceNumberType
                                        .ACH_ORIGINAL_TRACE_NUMBER
                                )
                                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                    )
                    .returnableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .returnableType(ReturnObject.ReturnableType.INCOMING_PAYMENT_DETAIL)
                    .role(ReturnObject.Role.ORIGINATING)
                    .status(ReturnObject.Status.COMPLETED)
                    .transactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .transactionLineItemId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .type(ReturnObject.Type.ACH)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .additionalInformation("string")
                    .build()
            )
        assertThat(paymentOrder.decisionId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentOrder.description()).isEqualTo("string")
        assertThat(paymentOrder.direction()).isEqualTo(PaymentOrder.Direction.CREDIT)
        assertThat(paymentOrder.effectiveDate()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(paymentOrder.expiresAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(paymentOrder.foreignExchangeContract()).isEqualTo("string")
        assertThat(paymentOrder.foreignExchangeIndicator())
            .isEqualTo(PaymentOrder.ForeignExchangeIndicator.FIXED_TO_VARIABLE)
        assertThat(paymentOrder.ledgerTransactionId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentOrder.liveMode()).isEqualTo(true)
        assertThat(paymentOrder.metadata()).isEqualTo(PaymentOrder.Metadata.builder().build())
        assertThat(paymentOrder.nsfProtected()).isEqualTo(true)
        assertThat(paymentOrder.object_()).isEqualTo("string")
        assertThat(paymentOrder.originatingAccountId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentOrder.originatingPartyName()).isEqualTo("string")
        assertThat(paymentOrder.priority()).isEqualTo(PaymentOrder.Priority.HIGH)
        assertThat(paymentOrder.processAfter())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(paymentOrder.purpose()).isEqualTo("string")
        assertThat(paymentOrder.receivingAccountId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentOrder.receivingAccountType())
            .isEqualTo(PaymentOrder.ReceivingAccountType.INTERNAL_ACCOUNT)
        assertThat(paymentOrder.referenceNumbers())
            .containsExactly(
                PaymentOrder.PaymentReference.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .liveMode(true)
                    .object_("string")
                    .referenceNumber("string")
                    .referenceNumberType(
                        PaymentOrder.PaymentReference.ReferenceNumberType.ACH_ORIGINAL_TRACE_NUMBER
                    )
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(paymentOrder.remittanceInformation()).isEqualTo("string")
        assertThat(paymentOrder.sendRemittanceAdvice()).isEqualTo(true)
        assertThat(paymentOrder.statementDescriptor()).isEqualTo("string")
        assertThat(paymentOrder.status()).isEqualTo(PaymentOrder.Status.APPROVED)
        assertThat(paymentOrder.subtype()).isEqualTo(PaymentOrderSubtype.BACS_NEW_INSTRUCTION)
        assertThat(paymentOrder.transactionIds())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentOrder.transactionMonitoringEnabled()).isEqualTo(true)
        assertThat(paymentOrder.type()).isEqualTo(PaymentOrderType.ACH)
        assertThat(paymentOrder.ultimateOriginatingAccount())
            .isEqualTo(
                PaymentOrder.UltimateOriginatingAccount.ofVirtualAccount(
                    VirtualAccount.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .accountDetails(
                            listOf(
                                AccountDetail.builder()
                                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .accountNumberSafe("string")
                                    .accountNumberType(AccountDetail.AccountNumberType.CLABE)
                                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .liveMode(true)
                                    .object_("string")
                                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .accountNumber("string")
                                    .build()
                            )
                        )
                        .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .creditLedgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .debitLedgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .description("string")
                        .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .liveMode(true)
                        .metadata(VirtualAccount.Metadata.builder().build())
                        .name("string")
                        .object_("string")
                        .routingDetails(
                            listOf(
                                RoutingDetail.builder()
                                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .bankAddress(
                                        RoutingDetail.Address.builder()
                                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                            .country("string")
                                            .createdAt(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
                                            .line1("string")
                                            .line2("string")
                                            .liveMode(true)
                                            .locality("string")
                                            .object_("string")
                                            .postalCode("string")
                                            .region("string")
                                            .updatedAt(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
                                            .build()
                                    )
                                    .bankName("string")
                                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .liveMode(true)
                                    .object_("string")
                                    .paymentType(RoutingDetail.PaymentType.ACH)
                                    .routingNumber("string")
                                    .routingNumberType(RoutingDetail.RoutingNumberType.ABA)
                                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .build()
                            )
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
            )
        assertThat(paymentOrder.ultimateOriginatingAccountId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentOrder.ultimateOriginatingAccountType())
            .isEqualTo(PaymentOrder.UltimateOriginatingAccountType.INTERNAL_ACCOUNT)
        assertThat(paymentOrder.ultimateOriginatingPartyIdentifier()).isEqualTo("string")
        assertThat(paymentOrder.ultimateOriginatingPartyName()).isEqualTo("string")
        assertThat(paymentOrder.ultimateReceivingPartyIdentifier()).isEqualTo("string")
        assertThat(paymentOrder.ultimateReceivingPartyName()).isEqualTo("string")
        assertThat(paymentOrder.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(paymentOrder.vendorFailureReason()).isEqualTo("string")
    }
}
