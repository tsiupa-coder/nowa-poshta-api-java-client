package com.base.api.model.scansheet;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ScanSheet {

    @SerializedName("Ref")
    public String ref;
    @SerializedName("Number")
    public String number;
    @SerializedName("DateTime")
    public String dateTime;
    @SerializedName("Count")
    public String count;
    @SerializedName("CitySenderRef")
    public String citySenderRef;
    @SerializedName("CitySender")
    public String citySender;
    @SerializedName("SenderAddressRef")
    public String senderAddressRef;
    @SerializedName("SenderAddress")
    public String senderAddress;
    @SerializedName("SenderRef")
    public String senderRef;
    @SerializedName("Sender")
    public String sender;
}
