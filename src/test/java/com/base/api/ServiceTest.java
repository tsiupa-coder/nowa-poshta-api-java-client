package com.base.api;


import com.base.api.model.settlement.SimpleSettlement;
import com.base.api.request.Pagination;
import com.base.api.response.adresses.CreateAddress;
import com.base.api.response.adresses.GetAddresses;
import com.base.api.model.address.SimpleAddress;
import com.base.api.response.city.GetCity;
import junit.framework.TestCase;
import org.junit.Test;

import java.io.IOException;

public class ServiceTest extends TestCase {

    private Service service;

    private final String API_KEY = "64db4746458023076ed38c878a0b398f";

    @Override
    public void setUp() throws Exception {
        service = new Service();
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

        info.data.get(0).addresses.forEach(System.out::println);
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
        service.findSettlement(simpleSettlement, pagination, "test_api_key");
    }


    public void test_getRegions() throws IOException {

        service.getRegions("test_api_key");


    }
}