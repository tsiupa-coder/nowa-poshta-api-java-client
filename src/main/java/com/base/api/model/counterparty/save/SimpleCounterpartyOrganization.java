package com.base.api.model.counterparty.save;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SimpleCounterpartyOrganization {

    @SerializedName("CounterpartyType")
    String counterpartyType;
    @SerializedName("EDRPOU")
    String EDRPOU;
    @SerializedName("CounterpartyProperty")
    String counterpartyProperty;

}
