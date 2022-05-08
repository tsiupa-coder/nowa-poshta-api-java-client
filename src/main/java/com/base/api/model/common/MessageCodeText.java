package com.base.api.model.common;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MessageCodeText {
    @SerializedName("MessageCode")
    public String messageCode;
    @SerializedName("MessageText")
    public String messageText;
    @SerializedName("MessageDescriptionRU")
    public String messageDescriptionRU;
    @SerializedName("MessageDescriptionUA")
    public String messageDescriptionUA;
}
