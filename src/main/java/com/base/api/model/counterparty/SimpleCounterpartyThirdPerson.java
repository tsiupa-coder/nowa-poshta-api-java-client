package com.base.api.model.counterparty;

import com.base.api.response.address.general.Response;
import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SimpleCounterpartyThirdPerson extends Response {

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
    @SerializedName("EDRPOU")
    String eDRPOU;
    @SerializedName("CityRef")
    String cityRef;

}
