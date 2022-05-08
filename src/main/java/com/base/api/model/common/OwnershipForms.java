package com.base.api.model.common;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OwnershipForms {
    @SerializedName("Ref")
    public String ref;
    @SerializedName("Description")
    public String description;
    @SerializedName("FullName")
    public String fullName;
}
