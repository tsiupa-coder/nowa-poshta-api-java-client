package com.base.api.model.common;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MessageCodeText {
    @SerializedName("MessageCode")
    String messageCode;
    @SerializedName("MessageText")
    String messageText;
    @SerializedName("MessageDescriptionRU")
    String messageDescriptionRU;
    @SerializedName("MessageDescriptionUA")
    String messageDescriptionUA;
}
