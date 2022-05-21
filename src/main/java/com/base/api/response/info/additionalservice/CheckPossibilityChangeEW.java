package com.base.api.response.info.additionalservice;

import com.base.api.model.additionalservice.PossibilityChangeEW;
import com.base.api.model.additionalservice.PossibilityCreate;
import com.base.api.response.general.Response;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CheckPossibilityChangeEW extends Response {
    ArrayList<PossibilityChangeEW> data;

}
