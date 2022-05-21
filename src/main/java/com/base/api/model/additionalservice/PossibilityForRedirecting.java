package com.base.api.model.additionalservice;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PossibilityForRedirecting {
    @SerializedName("Ref")
    public String ref;
    @SerializedName("Number")
    public String number;
    @SerializedName("PayerType")
    public String payerType;
    @SerializedName("PaymentMethod")
    public String paymentMethod;
    @SerializedName("WarehouseRef")
    public String warehouseRef;
    @SerializedName("WarehouseDescription")
    public String warehouseDescription;
    @SerializedName("AddressDescription")
    public String addressDescription;
    @SerializedName("StreetDescription")
    public String streetDescription;
    @SerializedName("BuildingNumber")
    public String buildingNumber;
    @SerializedName("CityRecipient")
    public String cityRecipient;
    @SerializedName("CityRecipientDescription")
    public String cityRecipientDescription;
    @SerializedName("SettlementRecipient")
    public String settlementRecipient;
    @SerializedName("SettlementRecipientDescription")
    public String settlementRecipientDescription;
    @SerializedName("SettlementType")
    public String settlementType;
    @SerializedName("CounterpartyRecipientRef")
    public String counterpartyRecipientRef;
    @SerializedName("CounterpartyRecipientDescription")
    public String counterpartyRecipientDescription;
    @SerializedName("RecipientName")
    public String recipientName;
    @SerializedName("PhoneSender")
    public String phoneSender;
    @SerializedName("PhoneRecipient")
    public String phoneRecipient;
    @SerializedName("DocumentWeight")
    public String documentWeight;
}
