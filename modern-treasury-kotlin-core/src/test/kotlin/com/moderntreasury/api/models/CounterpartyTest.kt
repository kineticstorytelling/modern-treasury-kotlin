// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CounterpartyTest {

    @Test
    fun createCounterparty() {
        val counterparty =
            Counterparty.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accounts(
                    listOf(
                        Counterparty.Account.builder()
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
                            .accountType(ExternalAccountType.CASH)
                            .contactDetails(
                                listOf(
                                    Counterparty.Account.ContactDetail.builder()
                                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .contactIdentifier("string")
                                        .contactIdentifierType(
                                            Counterparty.Account.ContactDetail.ContactIdentifierType
                                                .EMAIL
                                        )
                                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                        .discardedAt(
                                            OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                        )
                                        .liveMode(true)
                                        .object_("string")
                                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                        .build()
                                )
                            )
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .liveMode(true)
                            .metadata(Counterparty.Account.Metadata.builder().build())
                            .name("string")
                            .object_("string")
                            .partyAddress(
                                Counterparty.Account.Address.builder()
                                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .country("string")
                                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .line1("string")
                                    .line2("string")
                                    .liveMode(true)
                                    .locality("string")
                                    .object_("string")
                                    .postalCode("string")
                                    .region("string")
                                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .build()
                            )
                            .partyName("string")
                            .partyType(Counterparty.Account.PartyType.BUSINESS)
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
                            .verificationStatus(
                                Counterparty.Account.VerificationStatus.PENDING_VERIFICATION
                            )
                            .build()
                    )
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .email("dev@stainlessapi.com")
                .liveMode(true)
                .metadata(Counterparty.Metadata.builder().build())
                .name("string")
                .object_("string")
                .sendRemittanceAdvice(true)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .verificationStatus(Counterparty.VerificationStatus.DENIED)
                .build()
        assertThat(counterparty).isNotNull
        assertThat(counterparty.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(counterparty.accounts())
            .containsExactly(
                Counterparty.Account.builder()
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
                    .accountType(ExternalAccountType.CASH)
                    .contactDetails(
                        listOf(
                            Counterparty.Account.ContactDetail.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .contactIdentifier("string")
                                .contactIdentifierType(
                                    Counterparty.Account.ContactDetail.ContactIdentifierType.EMAIL
                                )
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .liveMode(true)
                                .object_("string")
                                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                    )
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .liveMode(true)
                    .metadata(Counterparty.Account.Metadata.builder().build())
                    .name("string")
                    .object_("string")
                    .partyAddress(
                        Counterparty.Account.Address.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .country("string")
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .line1("string")
                            .line2("string")
                            .liveMode(true)
                            .locality("string")
                            .object_("string")
                            .postalCode("string")
                            .region("string")
                            .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .partyName("string")
                    .partyType(Counterparty.Account.PartyType.BUSINESS)
                    .routingDetails(
                        listOf(
                            RoutingDetail.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .bankAddress(
                                    RoutingDetail.Address.builder()
                                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .country("string")
                                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                        .line1("string")
                                        .line2("string")
                                        .liveMode(true)
                                        .locality("string")
                                        .object_("string")
                                        .postalCode("string")
                                        .region("string")
                                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
                    .verificationStatus(
                        Counterparty.Account.VerificationStatus.PENDING_VERIFICATION
                    )
                    .build()
            )
        assertThat(counterparty.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(counterparty.discardedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(counterparty.email()).isEqualTo("dev@stainlessapi.com")
        assertThat(counterparty.liveMode()).isEqualTo(true)
        assertThat(counterparty.metadata()).isEqualTo(Counterparty.Metadata.builder().build())
        assertThat(counterparty.name()).isEqualTo("string")
        assertThat(counterparty.object_()).isEqualTo("string")
        assertThat(counterparty.sendRemittanceAdvice()).isEqualTo(true)
        assertThat(counterparty.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(counterparty.verificationStatus())
            .isEqualTo(Counterparty.VerificationStatus.DENIED)
    }
}
