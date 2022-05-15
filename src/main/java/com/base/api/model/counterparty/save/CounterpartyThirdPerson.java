package com.base.api.model.counterparty.save;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CounterpartyThirdPerson {

    @SerializedName("Ref")
    String ref;
    @SerializedName("Description")
    String description;
    @SerializedName("OwnershipForm")
    String ownershipForm;
    @SerializedName("OwnershipFormDescription")
    String ownershipFormDescription;
    @SerializedName("EDRPOU")
    String EDRPOU;
    @SerializedName("CounterpartyType")
    String counterpartyType;

}
