package com.base.api.model.contact;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PersonData {

    @SerializedName("CounterpartyRef")
    public String counterpartyRef;
    @SerializedName("Ref")
    public String ref;
    @SerializedName("FirstName")
    public String firstName;
    @SerializedName("LastName")
    public String lastName;
    @SerializedName("MiddleName")
    public String middleName;
    @SerializedName("Phone")
    public String phone;
}
