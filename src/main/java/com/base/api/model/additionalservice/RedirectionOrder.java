package com.base.api.model.additionalservice;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RedirectionOrder {
    @SerializedName("OrderRef")
    public String orderRef;
    @SerializedName("OrderNumber")
    public String orderNumber;
    @SerializedName("DateTime")
    public String dateTime;
    @SerializedName("DocumentNumber")
    public String documentNumber;
    @SerializedName("Note")
    public String note;
    @SerializedName("CityRecipient")
    public String cityRecipient;
    @SerializedName("RecipientAddress")
    public String recipientAddress;
    @SerializedName("CounterpartyRecipient")
    public String counterpartyRecipient;
    @SerializedName("RecipientName")
    public String recipientName;
    @SerializedName("PhoneRecipient")
    public String phoneRecipient;
    @SerializedName("PayerType")
    public String payerType;
    @SerializedName("DeliveryCost")
    public String deliveryCost;
    @SerializedName("EstimatedDeliveryDate")
    public String estimatedDeliveryDate;
    @SerializedName("ExpressWaybillNumber")
    public String expressWaybillNumber;
    @SerializedName("ExpressWaybillStatus")
    public String expressWaybillStatus;
}
