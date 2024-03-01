// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LegalEntityTest {

    @Test
    fun createLegalEntity() {
        val legalEntity =
            LegalEntity.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addresses(
                    listOf(
                        LegalEntity.LegalEntityAddress.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .addressTypes(
                                listOf(LegalEntity.LegalEntityAddress.AddressType.BUSINESS)
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
                .dateOfBirth(LocalDate.parse("2019-12-27"))
                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .doingBusinessAsNames(listOf("string"))
                .email("string")
                .firstName("string")
                .identifications(
                    listOf(
                        LegalEntity.Identification.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .idType(LegalEntity.Identification.IdType.AR_CUIL)
                            .issuingCountry("string")
                            .liveMode(true)
                            .object_("string")
                            .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                )
                .lastName("string")
                .legalEntityType(LegalEntity.LegalEntityType.BUSINESS)
                .legalStructure(LegalEntity.LegalStructure.CORPORATION)
                .liveMode(true)
                .metadata(LegalEntity.Metadata.builder().build())
                .object_("string")
                .phoneNumbers(
                    listOf(LegalEntity.PhoneNumber.builder().phoneNumber("string").build())
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .website("string")
                .build()
        assertThat(legalEntity).isNotNull
        assertThat(legalEntity.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(legalEntity.addresses())
            .containsExactly(
                LegalEntity.LegalEntityAddress.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addressTypes(listOf(LegalEntity.LegalEntityAddress.AddressType.BUSINESS))
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
        assertThat(legalEntity.businessName()).isEqualTo("string")
        assertThat(legalEntity.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(legalEntity.dateOfBirth()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(legalEntity.discardedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(legalEntity.doingBusinessAsNames()).containsExactly("string")
        assertThat(legalEntity.email()).isEqualTo("string")
        assertThat(legalEntity.firstName()).isEqualTo("string")
        assertThat(legalEntity.identifications())
            .containsExactly(
                LegalEntity.Identification.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .idType(LegalEntity.Identification.IdType.AR_CUIL)
                    .issuingCountry("string")
                    .liveMode(true)
                    .object_("string")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(legalEntity.lastName()).isEqualTo("string")
        assertThat(legalEntity.legalEntityType()).isEqualTo(LegalEntity.LegalEntityType.BUSINESS)
        assertThat(legalEntity.legalStructure()).isEqualTo(LegalEntity.LegalStructure.CORPORATION)
        assertThat(legalEntity.liveMode()).isEqualTo(true)
        assertThat(legalEntity.metadata()).isEqualTo(LegalEntity.Metadata.builder().build())
        assertThat(legalEntity.object_()).isEqualTo("string")
        assertThat(legalEntity.phoneNumbers())
            .containsExactly(LegalEntity.PhoneNumber.builder().phoneNumber("string").build())
        assertThat(legalEntity.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(legalEntity.website()).isEqualTo("string")
    }
}
