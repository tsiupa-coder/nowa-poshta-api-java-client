package com.base.api.model.additionalservice;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PossibilityCreate {
    @SerializedName("NonCash")
    boolean nonCash;
    @SerializedName("City")
    String city;
    @SerializedName("Counterparty")
    String counterparty;
    @SerializedName("ContactPerson")
    String contactPerson;
    @SerializedName("Address")
    String address;
    @SerializedName("Phone")
    String phone;
    @SerializedName("Ref")
    String ref;
}
