package com.base.api.model.common;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SimplePack {
    @SerializedName("Lengthstring")
    public String lengthstring;
    @SerializedName("Widthstring")
    public String widthstring;
    @SerializedName("Heightstring")
    public String heightstring;
    @SerializedName("VolumetricWeightstring")
    public String volumetricWeightstring;
    @SerializedName("TypeOfPackingstring")
    public String typeOfPackingstring;
}
