package com.base.api;

import com.base.api.model.addresses.address.SimpleAddress;
import com.base.api.model.addresses.city.CompanyCity;
import com.base.api.model.addresses.settlement.SimpleSettlement;
import com.base.api.model.addresses.street.SimpleStreet;
import com.base.api.model.addresses.warehouse.SimpleWarehouse;
import com.base.api.request.Pagination;
import com.base.api.response.address.adresses.CreateAddress;
import com.base.api.response.address.adresses.DeleteAddress;
import com.base.api.response.address.adresses.GetAddresses;
import com.base.api.response.address.adresses.GetSettlements;
import com.base.api.response.address.adresses.UpdateAddress;
import com.base.api.response.address.city.GetCity;
import com.base.api.response.address.city.GetCompanyCities;
import com.base.api.response.address.department.GetDepartment;
import com.base.api.response.address.department.GetWarehouseTypes;
import com.base.api.response.address.regions.GetRegions;
import com.base.api.response.address.street.GetStreet;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.IOException;

public class Address_Service extends Service {


    /**
     * returns cities by given parameters
     *
     * @param city       - city's name
     * @param pagination - contains page and limit, if u understand me :)
     * @param api_key    - takes from nowa-poshta app
     * @return - GetCity, represents endpoint response
     * @throws IOException
     */
    public GetCity getCity(String city, Pagination pagination, String api_key) throws IOException {


        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("apiKey", api_key);
        jsonObject.addProperty("modelName", "Address");
        jsonObject.addProperty("calledMethod", "searchSettlements");

        JsonObject jsonObjectIn = new JsonObject();
        jsonObjectIn.addProperty("CityName", city);
        jsonObjectIn.addProperty("Limit", pagination.getLimit());
        jsonObjectIn.addProperty("Page", pagination.getPage());

        jsonObject.add("methodProperties", jsonObjectIn);


        return service
                .postRequest(URL, jsonObject)
                .getResponse(new GetCity());
    }

    /**
     * returns addresses by given parameters
     *
     * @param streetName    - street's name, which u want find
     * @param settlementRef - it's reference, where is that street
     * @param pagination    - contains page and limit, if u understand me :)
     * @param api_key       -  takes from nowa-poshta app
     * @return - GetAddresses, represents api response
     * @throws IOException
     */
    public GetAddresses getAddresses(String streetName, String settlementRef, Pagination pagination, String api_key) throws IOException {


        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("apiKey", api_key);
        jsonObject.addProperty("modelName", "Address");
        jsonObject.addProperty("calledMethod", "searchSettlementStreets");

        JsonObject jsonObjectIn = new JsonObject();
        jsonObjectIn.addProperty("StreetName", streetName);
        jsonObjectIn.addProperty("SettlementRef", settlementRef);
        jsonObjectIn.addProperty("Limit", pagination.getLimit());
        jsonObjectIn.addProperty("Page", pagination.getPage());

        jsonObject.add("methodProperties", jsonObjectIn);


        return service
                .postRequest(URL, jsonObject)
                .getResponse(new GetAddresses());
    }

    // TODO: 07.05.22 Need testing

    /**
     * create address
     *
     * @param address - object represents address
     * @param api_key - takes from nowa-poshta app
     * @return
     * @throws IOException
     */
    public CreateAddress createAddress(SimpleAddress address, String api_key) throws IOException {

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("apiKey", api_key);
        jsonObject.addProperty("modelName", "Address");
        jsonObject.addProperty("calledMethod", "save");

        JsonObject jsonObjectIn = (JsonObject) new Gson().toJsonTree(address);

        jsonObject.add("methodProperties", jsonObjectIn);

        return service
                .postRequest(URL, jsonObject)
                .getResponse(new CreateAddress());
    }


    // TODO: 07.05.22 need testing

    /**
     * delete address, that u created
     *
     * @param address_ref
     * @param api_key     - takes from nowa-poshta app
     * @return
     * @throws IOException
     */
    public DeleteAddress deleteAddress(String address_ref, String api_key) throws IOException {

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("apiKey", api_key);
        jsonObject.addProperty("modelName", "Address");
        jsonObject.addProperty("calledMethod", "delete");

        JsonObject jsonObjectIn = new JsonObject();
        jsonObjectIn.addProperty("Ref", address_ref);

        jsonObject.add("methodProperties", jsonObjectIn);

        return service.postRequest(URL, jsonObject).getResponse(new DeleteAddress());
    }

    // TODO: 07.05.22 need testing

    /**
     * update your address
     *
     * @param address - representation of address
     * @param api_key - takes from nowa-poshta app
     * @return
     * @throws IOException
     */
    public UpdateAddress updateAddress(SimpleAddress address, String api_key) throws IOException {

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("apiKey", api_key);
        jsonObject.addProperty("modelName", "Address");
        jsonObject.addProperty("calledMethod", "update");

        JsonObject jsonObjectIn = (JsonObject) new Gson().toJsonTree(address);

        jsonObject.add("methodProperties", jsonObjectIn);

        return service
                .postRequest(URL, jsonObject)
                .getResponse(new UpdateAddress());
    }


    // TODO: 08.05.22 need testing

    /**
     * @param settlement - representation of settlement
     * @param pagination - contains page and limit, if u understand me :)
     * @param api_key    - takes from nowa-poshta app
     * @return
     * @throws IOException
     */
    public GetSettlements findSettlement(SimpleSettlement settlement, Pagination pagination, String api_key) throws IOException {

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("apiKey", api_key);
        jsonObject.addProperty("modelName", "Address");
        jsonObject.addProperty("calledMethod", "getSettlements");

        JsonObject jsonObjectIn = (JsonObject) new Gson().toJsonTree(settlement);
        jsonObjectIn.addProperty("Page", pagination.getPage());
        jsonObjectIn.addProperty("Limit", pagination.getLimit());

        jsonObject.add("methodProperties", jsonObjectIn);


        return service
                .postRequest(URL, jsonObject)
                .getResponse(new GetSettlements());
    }

    // TODO: 08.05.22 need testing

    /**
     * @param city       - representation company's city
     * @param pagination - - contains page and limit, if u understand me :)
     * @param api_key    - - takes from nowa-poshta app
     * @return
     * @throws IOException
     */
    public GetCompanyCities getCompanyCity(CompanyCity city, Pagination pagination, String api_key) throws IOException {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("apiKey", api_key);
        jsonObject.addProperty("modelName", "Address");
        jsonObject.addProperty("calledMethod", "getCities");

        JsonObject jsonObjectIn = (JsonObject) new Gson().toJsonTree(city);
        jsonObjectIn.addProperty("Page", pagination.getPage());
        jsonObjectIn.addProperty("Limit", pagination.getLimit());

        jsonObject.add("methodProperties", jsonObjectIn);
        return service
                .postRequest(URL, jsonObject)
                .getResponse(new GetCompanyCities());
    }

    /**
     * @param api_key - takes from nowa-poshta app
     * @return
     * @throws IOException
     */
    public GetRegions getRegions(String api_key) throws IOException {

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("apiKey", api_key);
        jsonObject.addProperty("modelName", "Address");
        jsonObject.addProperty("calledMethod", "getAreas");

        JsonObject jsonObjectIn = new JsonObject();
        jsonObject.add("methodProperties", jsonObjectIn);

        return service
                .postRequest(URL, jsonObject)
                .getResponse(new GetRegions());

    }


    public GetDepartment getDepartment(SimpleWarehouse warehouse, Pagination pagination, String api_key) throws IOException {

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("apiKey", api_key);
        jsonObject.addProperty("modelName", "Address");
        jsonObject.addProperty("calledMethod", "getWarehouses");

        JsonObject jsonObjectIn = (JsonObject) new Gson().toJsonTree(warehouse);
        jsonObjectIn.addProperty("Page", pagination.getPage());
        jsonObjectIn.addProperty("Limit", pagination.getLimit());

        jsonObject.add("methodProperties", jsonObjectIn);

        return service
                .postRequest(URL, jsonObject)
                .getResponse(new GetDepartment());
    }


    public GetWarehouseTypes getWarehouseTypes(String api_key) throws IOException {

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("apiKey", api_key);
        jsonObject.addProperty("modelName", "Address");
        jsonObject.addProperty("calledMethod", "getWarehouseTypes");

        JsonObject jsonObjectIn = new JsonObject();
        jsonObject.add("methodProperties", jsonObjectIn);

        return service
                .postRequest(URL, jsonObject)
                .getResponse(new GetWarehouseTypes());
    }

    private GetStreet getStreet(SimpleStreet street, Pagination pagination, String api_key) throws IOException {

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("apiKey", api_key);
        jsonObject.addProperty("modelName", "Address");
        jsonObject.addProperty("calledMethod", "getStreet");

        JsonObject jsonObjectIn = (JsonObject) new Gson().toJsonTree(street);
        jsonObjectIn.addProperty("Page", pagination.getPage());
        jsonObjectIn.addProperty("Limit", pagination.getLimit());

        jsonObject.add("methodProperties", jsonObjectIn);

        return service.postRequest(URL, jsonObject).getResponse(new GetStreet());

    }


}
