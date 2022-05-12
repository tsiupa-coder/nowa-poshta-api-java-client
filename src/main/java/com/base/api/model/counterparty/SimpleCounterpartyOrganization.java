package com.base.api.model.counterparty;

import com.base.api.response.address.general.Response;
import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SimpleCounterpartyOrganization extends Response {

    @SerializedName("CounterpartyType")
    String counterpartyType;
    @SerializedName("EDRPOU")
    String EDRPOU;
    @SerializedName("CounterpartyProperty")
    String counterpartyProperty;

}
