package com.base.api.model.counterparty;

import com.base.api.response.address.general.Response;
import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CounterpartyPrivatePerson extends Response {

    @SerializedName("Ref")
    String ref;
    @SerializedName("Description")
    String description;
    @SerializedName("FirstName")
    String firstName;
    @SerializedName("MiddleName")
    String middleName;
    @SerializedName("LastName")
    String lastName;
    @SerializedName("Counterparty")
    String counterparty;
    @SerializedName("OwnershipForm")
    String ownershipForm;
    @SerializedName("CounterpartyType")
    String counterpartyType;
    @SerializedName("EDRPOU")
    String EDRPOU;

}
