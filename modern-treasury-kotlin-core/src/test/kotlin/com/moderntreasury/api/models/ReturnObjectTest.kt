package com.moderntreasury.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ReturnObjectTest {

    @Test
    fun createReturnObject() {
        val returnObject =
            ReturnObject.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .object_("string")
                .liveMode(true)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .returnableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .returnableType(ReturnObject.ReturnableType.INCOMING_PAYMENT_DETAIL)
                .code(ReturnObject.Code._901)
                .reason("string")
                .dateOfDeath(LocalDate.parse("2019-12-27"))
                .additionalInformation("string")
                .status(ReturnObject.Status.COMPLETED)
                .transactionLineItemId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .transactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .type(ReturnObject.Type.ACH)
                .amount(123L)
                .currency(Currency.AED)
                .failureReason("string")
                .role(ReturnObject.Role.ORIGINATING)
                .currentReturn(
                    ReturnObject.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .object_("string")
                        .liveMode(true)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .returnableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .returnableType(ReturnObject.ReturnableType.INCOMING_PAYMENT_DETAIL)
                        .code(ReturnObject.Code._901)
                        .reason("string")
                        .dateOfDeath(LocalDate.parse("2019-12-27"))
                        .additionalInformation("string")
                        .status(ReturnObject.Status.COMPLETED)
                        .transactionLineItemId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .transactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .type(ReturnObject.Type.ACH)
                        .amount(123L)
                        .currency(Currency.AED)
                        .failureReason("string")
                        .role(ReturnObject.Role.ORIGINATING)
                        .referenceNumbers(
                            listOf(
                                ReturnObject.PaymentReference.builder()
                                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .object_("string")
                                    .liveMode(true)
                                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .referenceNumber("string")
                                    .referenceNumberType(
                                        ReturnObject.PaymentReference.ReferenceNumberType
                                            .ACH_ORIGINAL_TRACE_NUMBER
                                    )
                                    .build()
                            )
                        )
                        .ledgerTransactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .referenceNumbers(
                    listOf(
                        ReturnObject.PaymentReference.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .object_("string")
                            .liveMode(true)
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .referenceNumber("string")
                            .referenceNumberType(
                                ReturnObject.PaymentReference.ReferenceNumberType
                                    .ACH_ORIGINAL_TRACE_NUMBER
                            )
                            .build()
                    )
                )
                .ledgerTransactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(returnObject).isNotNull
        assertThat(returnObject.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(returnObject.object_()).isEqualTo("string")
        assertThat(returnObject.liveMode()).isEqualTo(true)
        assertThat(returnObject.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(returnObject.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(returnObject.returnableId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(returnObject.returnableType())
            .isEqualTo(ReturnObject.ReturnableType.INCOMING_PAYMENT_DETAIL)
        assertThat(returnObject.code()).isEqualTo(ReturnObject.Code._901)
        assertThat(returnObject.reason()).isEqualTo("string")
        assertThat(returnObject.dateOfDeath()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(returnObject.additionalInformation()).isEqualTo("string")
        assertThat(returnObject.status()).isEqualTo(ReturnObject.Status.COMPLETED)
        assertThat(returnObject.transactionLineItemId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(returnObject.transactionId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(returnObject.internalAccountId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(returnObject.type()).isEqualTo(ReturnObject.Type.ACH)
        assertThat(returnObject.amount()).isEqualTo(123L)
        assertThat(returnObject.currency()).isEqualTo(Currency.AED)
        assertThat(returnObject.failureReason()).isEqualTo("string")
        assertThat(returnObject.role()).isEqualTo(ReturnObject.Role.ORIGINATING)
        assertThat(returnObject.currentReturn())
            .isEqualTo(
                ReturnObject.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .object_("string")
                    .liveMode(true)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .returnableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .returnableType(ReturnObject.ReturnableType.INCOMING_PAYMENT_DETAIL)
                    .code(ReturnObject.Code._901)
                    .reason("string")
                    .dateOfDeath(LocalDate.parse("2019-12-27"))
                    .additionalInformation("string")
                    .status(ReturnObject.Status.COMPLETED)
                    .transactionLineItemId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .transactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .type(ReturnObject.Type.ACH)
                    .amount(123L)
                    .currency(Currency.AED)
                    .failureReason("string")
                    .role(ReturnObject.Role.ORIGINATING)
                    .referenceNumbers(
                        listOf(
                            ReturnObject.PaymentReference.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .object_("string")
                                .liveMode(true)
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .referenceNumber("string")
                                .referenceNumberType(
                                    ReturnObject.PaymentReference.ReferenceNumberType
                                        .ACH_ORIGINAL_TRACE_NUMBER
                                )
                                .build()
                        )
                    )
                    .ledgerTransactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        assertThat(returnObject.referenceNumbers())
            .containsExactly(
                ReturnObject.PaymentReference.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .object_("string")
                    .liveMode(true)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .referenceNumber("string")
                    .referenceNumberType(
                        ReturnObject.PaymentReference.ReferenceNumberType.ACH_ORIGINAL_TRACE_NUMBER
                    )
                    .build()
            )
        assertThat(returnObject.ledgerTransactionId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
