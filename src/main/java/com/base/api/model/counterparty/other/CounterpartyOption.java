package com.base.api.model.counterparty.other;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CounterpartyOption {
    @SerializedName("AddressDocumentDelivery")
    boolean addressDocumentDelivery;
    @SerializedName("AfterpaymentType")
    boolean afterpaymentType;
    @SerializedName("BackwardDeliverySubtypesDocuments")
    boolean backwardDeliverySubtypesDocuments;
    @SerializedName("BlockInternationalSenderLKK")
    boolean blockInternationalSenderLKK;
    @SerializedName("CalculationByFactualWeight")
    boolean calculationByFactualWeight;
    @SerializedName("CanAfterpaymentOnGoodsCost")
    boolean canAfterpaymentOnGoodsCost;
    @SerializedName("CanCreditDocuments")
    boolean canCreditDocuments;
    @SerializedName("CanEWTransporter")
    boolean canEWTransporter;
    @SerializedName("CanForwardingService")
    boolean canForwardingService;
    @SerializedName("CanNonCashPayment")
    boolean canNonCashPayment;
    @SerializedName("CanPayTheThirdPerson")
    boolean canPayTheThirdPerson;
    @SerializedName("CanSameDayDelivery")
    boolean canSameDayDelivery;
    @SerializedName("CanSameDayDeliveryStandart")
    boolean canSameDayDeliveryStandart;
    @SerializedName("CanSentFromPostomat")
    boolean canSentFromPostomat;
    @SerializedName("CanSignedDocuments")
    boolean canSignedDocuments;
    @SerializedName("CarCall")
    boolean carCall;
    @SerializedName("CreditDocuments")
    boolean creditDocuments;
    @SerializedName("CustomerReturn")
    boolean customerReturn;
    @SerializedName("DayCustomerReturn")
    boolean dayCustomerReturn;
    @SerializedName("DebtorParams")
    ArrayList<DebtorParam> debtorParams;
    @SerializedName("DeliveryByHand")
    boolean deliveryByHand;
    @SerializedName("DescentFromFloor")
    boolean descentFromFloor;
    @SerializedName("FillingWarranty")
    boolean fillingWarranty;
    @SerializedName("HaveMoneyWallets")
    boolean haveMoneyWallets;
    @SerializedName("HideDeliveryCost")
    boolean hideDeliveryCost;
    @SerializedName("InternationalDelivery")
    boolean internationalDelivery;
    @SerializedName("InternationalDeliveryServiceType")
    boolean internationalDeliveryServiceType;
    @SerializedName("LoyaltyProgram")
    boolean loyaltyProgram;
    @SerializedName("MainCounterparty")
    boolean mainCounterparty;
    @SerializedName("PickupService")
    boolean pickupService;
    @SerializedName("PrintMarkingAllowedTypes")
    PrintMarkingAllowedTypes printMarkingAllowedTypes;
    @SerializedName("SecurePayment")
    boolean securePayment;
    @SerializedName("Services")
    boolean services;
    @SerializedName("ShowDeliveryByHand")
    boolean showDeliveryByHand;
    @SerializedName("SignedDocuments")
    boolean signedDocuments;
    @SerializedName("TransferPricingConditions")
    boolean transferPricingConditions;
}
