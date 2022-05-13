package com.base.api.model.counterparty.other;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PrintMarkingAllowedTypes {
    @SerializedName("vdf")
    int vbf;
}
