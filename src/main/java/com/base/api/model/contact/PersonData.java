package com.base.api.model.contact;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PersonData {

    @SerializedName("CounterpartyRef")
    String counterpartyRef;
    @SerializedName("Ref")
    String ref;
    @SerializedName("FirstName")
    String firstName;
    @SerializedName("LastName")
    String lastName;
    @SerializedName("MiddleName")
    String middleName;
    @SerializedName("Phone")
    String phone;
}
