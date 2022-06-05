package com.base.api;

import com.base.api.mainservice.Common_Service;
import com.base.api.response.info.common.GetCargoTypes;
import junit.framework.TestCase;

import java.io.IOException;

public class Common_ServiceTest extends TestCase {

    Common_Service service = new Common_Service();
    private final String API_KEY = "64db4746458023076ed38c878a0b398f";
    public void testGetTimeIntervals() {

    }

    public void testGetCargoTypes() throws IOException {
        GetCargoTypes info =  service.getCargoTypes(API_KEY);

        System.out.println(info.getStatusResponse());
        info.getData().forEach(System.out::println);
    }

    public void testGetBackwardDeliveryCargoTypes() throws IOException {
        GetCargoTypes info = service.getBackwardDeliveryCargoTypes(API_KEY);

        System.out.println(info.getStatusResponse());
        info.getData().forEach(System.out::println);
    }

    public void testGetPalletsList() {
        service.getPalletsList(API_KEY);
    }

    public void testGetTypesOfPayersForRedelivery() {
    }

    public void testGetPackList() {
    }

    public void testGetTiresWheelsList() {
    }

    public void testGetCargoDescriptionList() {
    }

    public void testGetMessageCodeText() {
    }

    public void testGetServiceTypes() {
    }

    public void testGetOwnershipFormsList() {
    }
}