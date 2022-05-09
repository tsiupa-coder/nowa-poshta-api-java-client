package com.base.api.model.tracking;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SimpleDocumentTracking {

    @SerializedName("Documents")
    ArrayList<SimpleDocument> documents;

    @SerializedName("CheckWeightMethod")
    String checkWeightMethod;

    @SerializedName("CalculatedWeight")
    String calculatedWeight;

}
