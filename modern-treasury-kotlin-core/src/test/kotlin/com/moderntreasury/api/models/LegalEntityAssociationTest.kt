// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LegalEntityAssociationTest {

    @Test
    fun createLegalEntityAssociation() {
        val legalEntityAssociation =
            LegalEntityAssociation.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .childLegalEntity(
                    LegalEntityAssociation.ChildLegalEntity.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addresses(
                            listOf(
                                LegalEntityAssociation.ChildLegalEntity.LegalEntityAddress.builder()
                                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .addressTypes(
                                        listOf(
                                            LegalEntityAssociation.ChildLegalEntity
                                                .LegalEntityAddress
                                                .AddressType
                                                .BUSINESS
                                        )
                                    )
                                    .country("string")
                                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
                        )
                        .businessName("string")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .dateFormed(LocalDate.parse("2019-12-27"))
                        .dateOfBirth(LocalDate.parse("2019-12-27"))
                        .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .doingBusinessAsNames(listOf("string"))
                        .email("string")
                        .firstName("string")
                        .identifications(
                            listOf(
                                LegalEntityAssociation.ChildLegalEntity.Identification.builder()
                                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .idType(
                                        LegalEntityAssociation.ChildLegalEntity.Identification
                                            .IdType
                                            .AR_CUIL
                                    )
                                    .issuingCountry("string")
                                    .liveMode(true)
                                    .object_("string")
                                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .build()
                            )
                        )
                        .lastName("string")
                        .legalEntityType(
                            LegalEntityAssociation.ChildLegalEntity.LegalEntityType.BUSINESS
                        )
                        .legalStructure(
                            LegalEntityAssociation.ChildLegalEntity.LegalStructure.CORPORATION
                        )
                        .liveMode(true)
                        .metadata(
                            LegalEntityAssociation.ChildLegalEntity.Metadata.builder().build()
                        )
                        .object_("string")
                        .phoneNumbers(
                            listOf(
                                LegalEntityAssociation.ChildLegalEntity.PhoneNumber.builder()
                                    .phoneNumber("string")
                                    .build()
                            )
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .website("string")
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .liveMode(true)
                .object_("string")
                .ownershipPercentage(123L)
                .parentLegalEntityId("string")
                .relationshipTypes(listOf(LegalEntityAssociation.RelationshipType.BENEFICIAL_OWNER))
                .title("string")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(legalEntityAssociation).isNotNull
        assertThat(legalEntityAssociation.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(legalEntityAssociation.childLegalEntity())
            .isEqualTo(
                LegalEntityAssociation.ChildLegalEntity.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addresses(
                        listOf(
                            LegalEntityAssociation.ChildLegalEntity.LegalEntityAddress.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .addressTypes(
                                    listOf(
                                        LegalEntityAssociation.ChildLegalEntity.LegalEntityAddress
                                            .AddressType
                                            .BUSINESS
                                    )
                                )
                                .country("string")
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
                    )
                    .businessName("string")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .dateFormed(LocalDate.parse("2019-12-27"))
                    .dateOfBirth(LocalDate.parse("2019-12-27"))
                    .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .doingBusinessAsNames(listOf("string"))
                    .email("string")
                    .firstName("string")
                    .identifications(
                        listOf(
                            LegalEntityAssociation.ChildLegalEntity.Identification.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .idType(
                                    LegalEntityAssociation.ChildLegalEntity.Identification.IdType
                                        .AR_CUIL
                                )
                                .issuingCountry("string")
                                .liveMode(true)
                                .object_("string")
                                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                    )
                    .lastName("string")
                    .legalEntityType(
                        LegalEntityAssociation.ChildLegalEntity.LegalEntityType.BUSINESS
                    )
                    .legalStructure(
                        LegalEntityAssociation.ChildLegalEntity.LegalStructure.CORPORATION
                    )
                    .liveMode(true)
                    .metadata(LegalEntityAssociation.ChildLegalEntity.Metadata.builder().build())
                    .object_("string")
                    .phoneNumbers(
                        listOf(
                            LegalEntityAssociation.ChildLegalEntity.PhoneNumber.builder()
                                .phoneNumber("string")
                                .build()
                        )
                    )
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .website("string")
                    .build()
            )
        assertThat(legalEntityAssociation.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(legalEntityAssociation.discardedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(legalEntityAssociation.liveMode()).isEqualTo(true)
        assertThat(legalEntityAssociation.object_()).isEqualTo("string")
        assertThat(legalEntityAssociation.ownershipPercentage()).isEqualTo(123L)
        assertThat(legalEntityAssociation.parentLegalEntityId()).isEqualTo("string")
        assertThat(legalEntityAssociation.relationshipTypes())
            .containsExactly(LegalEntityAssociation.RelationshipType.BENEFICIAL_OWNER)
        assertThat(legalEntityAssociation.title()).isEqualTo("string")
        assertThat(legalEntityAssociation.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
