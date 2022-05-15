package com.base.api.model.common;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OwnershipForms {
    @SerializedName("Ref")
    String ref;
    @SerializedName("Description")
    String description;
    @SerializedName("FullName")
    String fullName;
}
