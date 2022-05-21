package com.base.api.model.additionalservice;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ReturnOrder {
    @SerializedName("OrderRef")
    public String orderRef;
    @SerializedName("OrderNumber")
    public String orderNumber;
    @SerializedName("OrderStatus")
    public String orderStatus;
    @SerializedName("DocumentNumber")
    public String documentNumber;
    @SerializedName("CounterpartyRecipient")
    public String counterpartyRecipient;
    @SerializedName("ContactPersonRecipient")
    public String contactPersonRecipient;
    @SerializedName("AddressRecipient")
    public String addressRecipient;
    @SerializedName("DeliveryCost")
    public String deliveryCost;
    @SerializedName("EstimatedDeliveryDate")
    public String estimatedDeliveryDate;
    @SerializedName("ExpressWaybillNumber")
    public String expressWaybillNumber;
    @SerializedName("ExpressWaybillStatus")
    public String expressWaybillStatus;
}
