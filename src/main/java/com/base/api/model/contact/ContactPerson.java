package com.base.api.model.contact;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ContactPerson {

    @SerializedName("Ref")
    String ref;
    @SerializedName("Description")
    String description;
    @SerializedName("LastName")
    String lastName;
    @SerializedName("FirstName")
    String firstName;
    @SerializedName("MiddleName")
    String middleName;
    @SerializedName("Phones")
    String phones;
    @SerializedName("Email")
    String email;
}
