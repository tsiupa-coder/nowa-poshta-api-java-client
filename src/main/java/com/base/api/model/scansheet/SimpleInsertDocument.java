package com.base.api.model.scansheet;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SimpleInsertDocument {

    @SerializedName("DocumentRefs")
    ArrayList<String> documentRefs;
    @SerializedName("Ref")
    String ref;
    @SerializedName("Date")
    String date;
}
