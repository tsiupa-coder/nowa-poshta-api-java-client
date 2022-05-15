package com.base.api.model.common;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SimplePack {
    @SerializedName("Lengthstring")
    String lengthstring;
    @SerializedName("Widthstring")
    String widthstring;
    @SerializedName("Heightstring")
    String heightstring;
    @SerializedName("VolumetricWeightstring")
    String volumetricWeightstring;
    @SerializedName("TypeOfPackingstring")
    String typeOfPackingstring;
}
