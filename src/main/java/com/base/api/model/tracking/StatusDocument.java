package com.base.api.model.tracking;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class StatusDocument {

    @SerializedName("Number")
    String number;
    @SerializedName("Redelivery")
    String redelivery;
    @SerializedName("RedeliverySum")
    String redeliverySum;
    @SerializedName("RedeliveryNum")
    String redeliveryNum;
    @SerializedName("RedeliveryPayer")
    String redeliveryPayer;
    @SerializedName("OwnerDocumentType")
    String ownerDocumentType;
    @SerializedName("LastCreatedOnTheBasisDocumentType")
    String lastCreatedOnTheBasisDocumentType;
    @SerializedName("LastCreatedOnTheBasisPayerType")
    String lastCreatedOnTheBasisPayerType;
    @SerializedName("LastCreatedOnTheBasisDateTime")
    String lastCreatedOnTheBasisDateTime;
    @SerializedName("LastTransactionStatusGM")
    String lastTransactionStatusGM;
    @SerializedName("LastTransactionDateTimeGM")
    String lastTransactionDateTimeGM;
    @SerializedName("LastAmountTransferGM")
    String lastAmountTransferGM;
    @SerializedName("DateCreated")
    String dateCreated;
    @SerializedName("DocumentWeight")
    String documentWeight;
    @SerializedName("FactualWeight")
    String factualWeight;
    @SerializedName("VolumeWeight")
    String volumeWeight;
    @SerializedName("CheckWeight")
    String checkWeight;
    @SerializedName("DocumentCost")
    String documentCost;
    @SerializedName("SumBeforeCheckWeight")
    String sumBeforeCheckWeight;
    @SerializedName("PayerType")
    String payerType;
    @SerializedName("RecipientFullName")
    String recipientFullName;
    @SerializedName("RecipientDateTime")
    String recipientDateTime;
    @SerializedName("ScheduledDeliveryDate")
    String scheduledDeliveryDate;
    @SerializedName("PaymentMethod")
    String paymentMethod;
    @SerializedName("CargoDescriptionString")
    String cargoDescriptionString;
    @SerializedName("CargoType")
    String cargoType;
    @SerializedName("CitySender")
    String citySender;
    @SerializedName("CityRecipient")
    String cityRecipient;
    @SerializedName("WarehouseRecipient")
    String warehouseRecipient;
    @SerializedName("CounterpartyType")
    String counterpartyType;
    @SerializedName("AfterpaymentOnGoodsCost")
    String afterpaymentOnGoodsCost;
    @SerializedName("ServiceType")
    String serviceType;
    @SerializedName("UndeliveryReasonsSubtypeDescription")
    String undeliveryReasonsSubtypeDescription;
    @SerializedName("WarehouseRecipientNumber")
    String warehouseRecipientNumber;
    @SerializedName("LastCreatedOnTheBasisNumber")
    String lastCreatedOnTheBasisNumber;
    @SerializedName("PhoneRecipient")
    String phoneRecipient;
    @SerializedName("RecipientFullNameEW")
    String recipientFullNameEW;
    @SerializedName("WarehouseRecipientInternetAddressRef")
    String warehouseRecipientInternetAddressRef;
    @SerializedName("MarketplacePartnerToken")
    String marketplacePartnerToken;
    @SerializedName("ClientBarcode")
    String clientBarcode;
    @SerializedName("RecipientAddress")
    String recipientAddress;
    @SerializedName("CounterpartyRecipientDescription")
    String counterpartyRecipientDescription;
    @SerializedName("CounterpartySenderType")
    String counterpartySenderType;
    @SerializedName("DateScan")
    String dateScan;
    @SerializedName("PaymentStatus")
    String paymentStatus;
    @SerializedName("PaymentStatusDate")
    String paymentStatusDate;
    @SerializedName("AmountToPay")
    String amountToPay;
    @SerializedName("AmountPaid")
    String amountPaid;
    @SerializedName("Status")
    String status;
    @SerializedName("StatusCode")
    String statusCode;
    @SerializedName("RefEW")
    String refEW;
    @SerializedName("BackwardDeliverySubTypesActions")
    String backwardDeliverySubTypesActions;
    @SerializedName("BackwardDeliverySubTypesServices")
    String backwardDeliverySubTypesServices;
    @SerializedName("UndeliveryReasons")
    String undeliveryReasons;
    @SerializedName("DatePayedKeeping")
    String datePayedKeeping;
}
