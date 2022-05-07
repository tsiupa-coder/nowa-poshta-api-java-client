package com.base.api.response.adresses;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SimpleAddress {
    @SerializedName("CounterpartyRef")
    String counterpartyRef;

    @SerializedName("StreetRef")
    String streetRef;

    @SerializedName("BuildingNumber")
    String buildingNumber;

    @SerializedName("Flat")
    String flat;

    @SerializedName("Note")
    String note;
}
