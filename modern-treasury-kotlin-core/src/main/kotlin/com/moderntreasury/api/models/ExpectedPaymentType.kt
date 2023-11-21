// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException

class ExpectedPaymentType
@JsonCreator
private constructor(
    private val value: JsonField<String>,
) {

    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExpectedPaymentType && this.value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()

    companion object {

        val ACH = ExpectedPaymentType(JsonField.of("ach"))

        val AU_BECS = ExpectedPaymentType(JsonField.of("au_becs"))

        val BACS = ExpectedPaymentType(JsonField.of("bacs"))

        val BOOK = ExpectedPaymentType(JsonField.of("book"))

        val CARD = ExpectedPaymentType(JsonField.of("card"))

        val CHATS = ExpectedPaymentType(JsonField.of("chats"))

        val CHECK = ExpectedPaymentType(JsonField.of("check"))

        val CROSS_BORDER = ExpectedPaymentType(JsonField.of("cross_border"))

        val DK_NETS = ExpectedPaymentType(JsonField.of("dk_nets"))

        val EFT = ExpectedPaymentType(JsonField.of("eft"))

        val HU_ICS = ExpectedPaymentType(JsonField.of("hu_ics"))

        val INTERAC = ExpectedPaymentType(JsonField.of("interac"))

        val MASAV = ExpectedPaymentType(JsonField.of("masav"))

        val NEFT = ExpectedPaymentType(JsonField.of("neft"))

        val NICS = ExpectedPaymentType(JsonField.of("nics"))

        val NZ_BECS = ExpectedPaymentType(JsonField.of("nz_becs"))

        val PROVXCHANGE = ExpectedPaymentType(JsonField.of("provxchange"))

        val RO_SENT = ExpectedPaymentType(JsonField.of("ro_sent"))

        val RTP = ExpectedPaymentType(JsonField.of("rtp"))

        val SE_BANKGIROT = ExpectedPaymentType(JsonField.of("se_bankgirot"))

        val SEN = ExpectedPaymentType(JsonField.of("sen"))

        val SEPA = ExpectedPaymentType(JsonField.of("sepa"))

        val SG_GIRO = ExpectedPaymentType(JsonField.of("sg_giro"))

        val SIC = ExpectedPaymentType(JsonField.of("sic"))

        val SIGNET = ExpectedPaymentType(JsonField.of("signet"))

        val WIRE = ExpectedPaymentType(JsonField.of("wire"))

        val ZENGIN = ExpectedPaymentType(JsonField.of("zengin"))

        fun of(value: String) = ExpectedPaymentType(JsonField.of(value))
    }

    enum class Known {
        ACH,
        AU_BECS,
        BACS,
        BOOK,
        CARD,
        CHATS,
        CHECK,
        CROSS_BORDER,
        DK_NETS,
        EFT,
        HU_ICS,
        INTERAC,
        MASAV,
        NEFT,
        NICS,
        NZ_BECS,
        PROVXCHANGE,
        RO_SENT,
        RTP,
        SE_BANKGIROT,
        SEN,
        SEPA,
        SG_GIRO,
        SIC,
        SIGNET,
        WIRE,
        ZENGIN,
    }

    enum class Value {
        ACH,
        AU_BECS,
        BACS,
        BOOK,
        CARD,
        CHATS,
        CHECK,
        CROSS_BORDER,
        DK_NETS,
        EFT,
        HU_ICS,
        INTERAC,
        MASAV,
        NEFT,
        NICS,
        NZ_BECS,
        PROVXCHANGE,
        RO_SENT,
        RTP,
        SE_BANKGIROT,
        SEN,
        SEPA,
        SG_GIRO,
        SIC,
        SIGNET,
        WIRE,
        ZENGIN,
        _UNKNOWN,
    }

    fun value(): Value =
        when (this) {
            ACH -> Value.ACH
            AU_BECS -> Value.AU_BECS
            BACS -> Value.BACS
            BOOK -> Value.BOOK
            CARD -> Value.CARD
            CHATS -> Value.CHATS
            CHECK -> Value.CHECK
            CROSS_BORDER -> Value.CROSS_BORDER
            DK_NETS -> Value.DK_NETS
            EFT -> Value.EFT
            HU_ICS -> Value.HU_ICS
            INTERAC -> Value.INTERAC
            MASAV -> Value.MASAV
            NEFT -> Value.NEFT
            NICS -> Value.NICS
            NZ_BECS -> Value.NZ_BECS
            PROVXCHANGE -> Value.PROVXCHANGE
            RO_SENT -> Value.RO_SENT
            RTP -> Value.RTP
            SE_BANKGIROT -> Value.SE_BANKGIROT
            SEN -> Value.SEN
            SEPA -> Value.SEPA
            SG_GIRO -> Value.SG_GIRO
            SIC -> Value.SIC
            SIGNET -> Value.SIGNET
            WIRE -> Value.WIRE
            ZENGIN -> Value.ZENGIN
            else -> Value._UNKNOWN
        }

    fun known(): Known =
        when (this) {
            ACH -> Known.ACH
            AU_BECS -> Known.AU_BECS
            BACS -> Known.BACS
            BOOK -> Known.BOOK
            CARD -> Known.CARD
            CHATS -> Known.CHATS
            CHECK -> Known.CHECK
            CROSS_BORDER -> Known.CROSS_BORDER
            DK_NETS -> Known.DK_NETS
            EFT -> Known.EFT
            HU_ICS -> Known.HU_ICS
            INTERAC -> Known.INTERAC
            MASAV -> Known.MASAV
            NEFT -> Known.NEFT
            NICS -> Known.NICS
            NZ_BECS -> Known.NZ_BECS
            PROVXCHANGE -> Known.PROVXCHANGE
            RO_SENT -> Known.RO_SENT
            RTP -> Known.RTP
            SE_BANKGIROT -> Known.SE_BANKGIROT
            SEN -> Known.SEN
            SEPA -> Known.SEPA
            SG_GIRO -> Known.SG_GIRO
            SIC -> Known.SIC
            SIGNET -> Known.SIGNET
            WIRE -> Known.WIRE
            ZENGIN -> Known.ZENGIN
            else -> throw ModernTreasuryInvalidDataException("Unknown ExpectedPaymentType: $value")
        }

    fun asString(): String = _value().asStringOrThrow()
}
