package com.base.api.model.counterparty.other;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DebtorParam {
    @SerializedName("AgreementId")
    String agreementId;
    @SerializedName("PaymTermId")
    String paymTermId;
    @SerializedName("PastDueDebts")
    String pastDueDebts;
    @SerializedName("BlockedStatus")
    String blockedStatus;
}

