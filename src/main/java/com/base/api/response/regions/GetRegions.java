package com.base.api.response.regions;

import com.base.api.model.region.Region;
import com.base.api.response.general.Response;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class GetRegions extends Response {
    public boolean success;
    public ArrayList<Region> data;
    public ArrayList<String> errors;
}
