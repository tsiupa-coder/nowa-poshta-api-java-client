package com.base.api.model.addresses.department;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Department {

    @SerializedName("SiteKey")
    String siteKey;
    @SerializedName("Description")
    String description;
    @SerializedName("DescriptionRu")
    String descriptionRu;
    @SerializedName("ShortAddress")
    String shortAddress;
    @SerializedName("ShortAddressRu")
    String shortAddressRu;
    @SerializedName("Phone")
    String phone;
    @SerializedName("TypeOfWarehouse")
    String typeOfWarehouse;
    @SerializedName("Ref")
    String ref;
    @SerializedName("Number")
    String number;
    @SerializedName("CityRef")
    String cityRef;
    @SerializedName("CityDescription")
    String cityDescription;
    @SerializedName("CityDescriptionRu")
    String cityDescriptionRu;
    @SerializedName("SettlementRef")
    String settlementRef;
    @SerializedName("SettlementDescription")
    String settlementDescription;
    @SerializedName("SettlementAreaDescription")
    String settlementAreaDescription;
    @SerializedName("SettlementRegionsDescription")
    String settlementRegionsDescription;
    @SerializedName("SettlementTypeDescription")
    String settlementTypeDescription;
    @SerializedName("SettlementTypeDescriptionRu")
    String settlementTypeDescriptionRu;
    @SerializedName("Longitude")
    String longitude;
    @SerializedName("Latitude")
    String latitude;
    @SerializedName("PostFinance")
    String postFinance;
    @SerializedName("BicycleParking")
    String bicycleParking;
    @SerializedName("PaymentAccess")
    String paymentAccess;
    @SerializedName("POSTerminal")
    String pOSTerminal;
    @SerializedName("InternationalShipping")
    String internationalShipping;
    @SerializedName("SelfServiceWorkplacesCount")
    String selfServiceWorkplacesCount;
    @SerializedName("TotalMaxWeightAllowed")
    String totalMaxWeightAllowed;
    @SerializedName("PlaceMaxWeightAllowed")
    String placeMaxWeightAllowed;
    @SerializedName("SendingLimitationsOnDimensions")
    Dimensions sendingLimitationsOnDimensions;
    @SerializedName("ReceivingLimitationsOnDimensions")
    Dimensions receivingLimitationsOnDimensions;
    @SerializedName("Reception")
    Schedule reception;
    @SerializedName("Delivery")
    Schedule delivery;
    @SerializedName("Schedule")
    Schedule schedule;
    @SerializedName("DistrictCode")
    String districtCode;
    @SerializedName("WarehouseStatus")
    String warehouseStatus;
    @SerializedName("WarehouseStatusDate")
    String warehouseStatusDate;
    @SerializedName("CategoryOfWarehouse")
    String categoryOfWarehouse;
    @SerializedName("RegionCity")
    String regionCity;
    @SerializedName("WarehouseForAgent")
    String warehouseForAgent;
    @SerializedName("MaxDeclaredCost")
    String maxDeclaredCost;
    @SerializedName("DenyToSelect")
    String denyToSelect;
    @SerializedName("PostMachineType")
    String postMachineType;
}



