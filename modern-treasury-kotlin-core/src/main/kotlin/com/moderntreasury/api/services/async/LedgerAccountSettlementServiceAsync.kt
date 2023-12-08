// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.LedgerAccountSettlement
import com.moderntreasury.api.models.LedgerAccountSettlementCreateParams
import com.moderntreasury.api.models.LedgerAccountSettlementListPageAsync
import com.moderntreasury.api.models.LedgerAccountSettlementListParams
import com.moderntreasury.api.models.LedgerAccountSettlementRetrieveParams
import com.moderntreasury.api.models.LedgerAccountSettlementUpdateParams

interface LedgerAccountSettlementServiceAsync {

    /** Create a ledger account settlement. */
    suspend fun create(
        params: LedgerAccountSettlementCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): LedgerAccountSettlement

    /** Get details on a single ledger account settlement. */
    suspend fun retrieve(
        params: LedgerAccountSettlementRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): LedgerAccountSettlement

    /** Update the details of a ledger account settlement. */
    suspend fun update(
        params: LedgerAccountSettlementUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): LedgerAccountSettlement

    /** Get a list of ledger account settlements. */
    suspend fun list(
        params: LedgerAccountSettlementListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): LedgerAccountSettlementListPageAsync
}
