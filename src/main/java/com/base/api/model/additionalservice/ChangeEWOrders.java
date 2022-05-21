package com.base.api.model.additionalservice;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ChangeEWOrders {
    @SerializedName("OrderRef")
    public String orderRef;
    @SerializedName("OrderNumber")
    public String orderNumber;
    @SerializedName("OrderStatus")
    public String orderStatus;
    @SerializedName("DocumentNumber")
    public String documentNumber;
    @SerializedName("DateTime")
    public String dateTime;
    @SerializedName("BeforeChangeSenderCounterparty")
    public String beforeChangeSenderCounterparty;
    @SerializedName("AfterChangeChangeSenderCounterparty")
    public String afterChangeChangeSenderCounterparty;
    @SerializedName("Cost")
    public String cost;
    @SerializedName("BeforeChangeSenderPhone")
    public String beforeChangeSenderPhone;
    @SerializedName("AfterChangeSenderPhone")
    public String afterChangeSenderPhone;
}
