package com.base.api.model.additionalservice;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ChangeDate {
    @SerializedName("IntDocNumber")
    public String intDocNumber;
    @SerializedName("PaymentMethod")
    public String paymentMethod;
    @SerializedName("OrderType")
    public String orderType;
    @SerializedName("SenderContactName")
    public String senderContactName;
    @SerializedName("SenderPhone")
    public String senderPhone;
    @SerializedName("Recipient")
    public String recipient;
    @SerializedName("RecipientContactName")
    public String recipientContactName;
    @SerializedName("RecipientPhone")
    public String recipientPhone;
    @SerializedName("PayerType")
    public String payerType;
}
