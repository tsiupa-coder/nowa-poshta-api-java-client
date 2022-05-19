package com.base.api.model.additionalservice;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ReturnReasonsSubtype {
    @SerializedName("Ref")
    String ref;
    @SerializedName("Description")
    String description;
    @SerializedName("ReasonRef")
    String reasonRef;
}
