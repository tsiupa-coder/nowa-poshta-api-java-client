package com.base.api;


import com.base.api.model.addresses.settlement.SimpleSettlement;
import com.base.api.request.Pagination;
import com.base.api.response.info.address.adresses.CreateAddress;
import com.base.api.response.info.address.adresses.GetAddresses;
import com.base.api.model.addresses.address.SimpleAddress;
import com.base.api.response.info.address.city.GetCity;
import com.base.api.mainservice.Address_Service;
import com.base.api.response.info.address.department.GetWarehouseTypes;
import com.base.api.response.info.address.regions.GetRegions;
import junit.framework.TestCase;
import org.junit.Test;

import java.io.IOException;

public class Address_ServiceTest extends TestCase {

    private Address_Service service;

    private final String API_KEY = "64db4746458023076ed38c878a0b398f";

    @Override
    public void setUp() throws Exception {
        service = new Address_Service();
    }

    @Test
    public void test_get_City() throws IOException {
        Pagination pagination = new Pagination();
        pagination.setLimit(100);
        pagination.setPage(1);

        GetCity info = service.getCity("золочів", pagination, API_KEY);

        info.getData().get(0).getAddresses().forEach(System.out::println);
    }


    public void test_find_address() throws IOException {
        Pagination pagination = new Pagination();
        pagination.setLimit(100);
        pagination.setPage(1);

        GetAddresses info = service.getAddresses(
                "тернопільська",
                "e71abb60-4b33-11e4-ab6d-005056801329",
                pagination,
                API_KEY);

        info.getData().get(0).getAddresses().forEach(System.out::println);
    }

    public void test_create_address() throws IOException {
        SimpleAddress address = new SimpleAddress();
        address.setCounterpartyRef("e71abb60-4b33-11e4-ab6d-005056801329");  // TODO: 02.05.22 set correct id "контергагент"
        address.setStreetRef("84bfba17-684f-11e6-8304-00505688561d");
        address.setBuildingNumber("7");
        address.setFlat("2");
        address.setNote("this is test address, please don't sent here anything");

        CreateAddress info = service.createAddress(address, API_KEY);

       // System.out.println(info.getData().get(0).getRef());
        //System.out.println(info.getData().get(0).getDescription());
        info.getErrors().forEach(System.out::println);

        // TODO: 02.05.22 Counterparty doesn't exists, Street doesn't exists, Note too long
    }


    public void test_findSettlement() throws IOException {
        SimpleSettlement simpleSettlement = new SimpleSettlement();
        simpleSettlement.setFindByString("vervevr");
        simpleSettlement.setWarehouse("12234");

        Pagination pagination = new Pagination();
        pagination.setPage(1);
        service.findSettlement(simpleSettlement, pagination, API_KEY);
    }


    public void test_getRegions() throws IOException {

        GetRegions info = service.getRegions(API_KEY);
        info.getStatusResponse();
        info.getData().forEach(System.out::println);

    }

    public void test_getWarehouseTypes() throws IOException {

        GetWarehouseTypes info = service.getWarehouseTypes(API_KEY);

        info.getStatusResponse();
        info.getData().forEach(System.out::println);
    }
}