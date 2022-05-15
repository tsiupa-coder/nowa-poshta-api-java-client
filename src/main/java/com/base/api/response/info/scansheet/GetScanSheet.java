package com.base.api.response.info.scansheet;

import com.base.api.model.scansheet.ScanSheet;
import com.base.api.response.general.Response;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class GetScanSheet extends Response {
    ArrayList<ScanSheet> data;
}
