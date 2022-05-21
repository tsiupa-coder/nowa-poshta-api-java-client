package com.base.api.model.additionalservice;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PossibilityChangeEW {
    @SerializedName("CanChangeSender")
    public boolean canChangeSender;
    @SerializedName("CanChangeRecipient")
    public boolean canChangeRecipient;
    @SerializedName("CanChangePayerTypeOrPaymentMethod")
    public boolean canChangePayerTypeOrPaymentMethod;
    @SerializedName("CanChangeBackwardDeliveryDocuments")
    public boolean canChangeBackwardDeliveryDocuments;
    @SerializedName("CanChangeBackwardDeliveryMoney")
    public boolean canChangeBackwardDeliveryMoney;
    @SerializedName("CanChangeCash2Card")
    public boolean canChangeCash2Card;
    @SerializedName("CanChangeBackwardDeliveryOther")
    public boolean canChangeBackwardDeliveryOther;
    @SerializedName("CanChangeAfterpaymentType")
    public boolean canChangeAfterpaymentType;
    @SerializedName("CanChangeLiftingOnFloor")
    public boolean canChangeLiftingOnFloor;
    @SerializedName("CanChangeLiftingOnFloorWithElevator")
    public boolean canChangeLiftingOnFloorWithElevator;
    @SerializedName("CanChangeFillingWarranty")
    public boolean canChangeFillingWarranty;
    @SerializedName("SenderCounterparty")
    public String senderCounterparty;
    @SerializedName("ContactPersonSender")
    public String contactPersonSender;
    @SerializedName("SenderPhone")
    public String senderPhone;
    @SerializedName("RecipientCounterparty")
    public String recipientCounterparty;
    @SerializedName("ContactPersonRecipient")
    public String contactPersonRecipient;
    @SerializedName("RecipientPhone")
    public String recipientPhone;
    @SerializedName("PayerType")
    public String payerType;
    @SerializedName("PaymentMethod")
    public String paymentMethod;
}
