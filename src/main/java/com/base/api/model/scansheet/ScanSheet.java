package com.base.api.model.scansheet;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ScanSheet {

    @SerializedName("Ref")
    String ref;
    @SerializedName("Number")
    String number;
    @SerializedName("DateTime")
    String dateTime;
    @SerializedName("Count")
    String count;
    @SerializedName("CitySenderRef")
    String citySenderRef;
    @SerializedName("CitySender")
    String citySender;
    @SerializedName("SenderAddressRef")
    String senderAddressRef;
    @SerializedName("SenderAddress")
    String senderAddress;
    @SerializedName("SenderRef")
    String senderRef;
    @SerializedName("Sender")
    String sender;
}
