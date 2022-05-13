package com.base.api.response.info.contact;

import com.base.api.model.contact.ContactPerson;
import com.base.api.response.general.Response;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CreateContactPerson extends Response {
    ArrayList<ContactPerson> data;
}
