package com.base.api.model.counterparty.update;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SimpleCounterparty {

    @SerializedName("Ref")
    String ref;
    @SerializedName("CityRef")
    String cityRef;
    @SerializedName("FirstName")
    String firstName;
    @SerializedName("MiddleName")
    String middleName;
    @SerializedName("LastName")
    String lastName;
    @SerializedName("Phone")
    String phone;
    @SerializedName("Email")
    String email;
    @SerializedName("CounterpartyType")
    String counterpartyType;
    @SerializedName("CounterpartyProperty")
    String counterpartyProperty;
}
