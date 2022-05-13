package com.base.api.model.counterparty.save;

import com.base.api.response.address.general.Response;
import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CounterpartyOrganization extends Response {

    @SerializedName("Ref")
    String ref;
    @SerializedName("Description")
    String description;
    @SerializedName("FirstName")
    String firstName;
    @SerializedName("OwnershipForm")
    String ownershipForm;
    @SerializedName("OwnershipFormDescription")
    String ownershipFormDescription;
    @SerializedName("CounterpartyType")
    String counterpartyType;
    @SerializedName("EDRPOU")
    String EDRPOU;

}
