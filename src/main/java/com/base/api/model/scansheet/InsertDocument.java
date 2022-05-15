package com.base.api.model.scansheet;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class InsertDocument {

        @SerializedName("Ref")
        public String ref;
        @SerializedName("Number")
        public String number;
        @SerializedName("Date")
        public String date;

}
