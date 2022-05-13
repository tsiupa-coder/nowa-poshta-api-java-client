package com.base.api.model.counterparty.update;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Counterparty {

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
    @SerializedName("OwnershipFormDescription")
    String ownershipFormDescription;
    @SerializedName("EDRPOU")
    String EDRPOU;
    @SerializedName("CounterpartyType")
    String counterpartyType;
    @SerializedName("ContactPerson")
    String contactPerson;
}
