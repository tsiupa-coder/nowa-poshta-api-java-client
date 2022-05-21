package com.base.api;

import com.base.api.model.addresses.address.SimpleAddress;
import com.base.api.model.addresses.city.CompanyCity;
import com.base.api.model.addresses.settlement.SimpleSettlement;
import com.base.api.model.addresses.street.SimpleStreet;
import com.base.api.model.addresses.warehouse.SimpleWarehouse;
import com.base.api.request.Pagination;
import com.base.api.response.info.address.adresses.CreateAddress;
import com.base.api.response.info.address.adresses.DeleteAddress;
import com.base.api.response.info.address.adresses.GetAddresses;
import com.base.api.response.info.address.adresses.GetSettlements;
import com.base.api.response.info.address.adresses.UpdateAddress;
import com.base.api.response.info.address.city.GetCity;
import com.base.api.response.info.address.city.GetCompanyCities;
import com.base.api.response.info.address.department.GetDepartment;
import com.base.api.response.info.address.department.GetWarehouseTypes;
import com.base.api.response.info.address.regions.GetRegions;
import com.base.api.response.info.address.street.GetStreet;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.IOException;

import static com.base.api.model.StringConstants.ADDRESS;
import static com.base.api.model.StringConstants.CITY_NAME;
import static com.base.api.model.StringConstants.DELETE;
import static com.base.api.model.StringConstants.GET_AREAS;
import static com.base.api.model.StringConstants.GET_CITIES;
import static com.base.api.model.StringConstants.GET_SETTLEMENTS;
import static com.base.api.model.StringConstants.GET_STREET;
import static com.base.api.model.StringConstants.GET_WAREHOUSES;
import static com.base.api.model.StringConstants.GET_WAREHOUSE_TYPES;
import static com.base.api.model.StringConstants.LIMIT;
import static com.base.api.model.StringConstants.PAGE;
import static com.base.api.model.StringConstants.REF;
import static com.base.api.model.StringConstants.SAVE;
import static com.base.api.model.StringConstants.SEARCH_SETTLEMENTS;
import static com.base.api.model.StringConstants.SEARCH_SETTLEMENT_STREETS;
import static com.base.api.model.StringConstants.SETTLEMENT_REF;
import static com.base.api.model.StringConstants.STREET_NAME;
import static com.base.api.model.StringConstants.UPDATE;

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

        JsonObject jsonObjectIn = new JsonObject();
        jsonObjectIn.addProperty(CITY_NAME, city);
        jsonObjectIn.addProperty(LIMIT, pagination.getLimit());
        jsonObjectIn.addProperty(PAGE, pagination.getPage());

        JsonObject jsonObject = jsonService.toObject(api_key, ADDRESS, SEARCH_SETTLEMENTS, jsonObjectIn);

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

        JsonObject jsonObjectIn = new JsonObject();
        jsonObjectIn.addProperty(STREET_NAME, streetName);
        jsonObjectIn.addProperty(SETTLEMENT_REF, settlementRef);
        jsonObjectIn.addProperty(LIMIT, pagination.getLimit());
        jsonObjectIn.addProperty(PAGE, pagination.getPage());

        JsonObject jsonObject = jsonService.toObject(api_key, ADDRESS, SEARCH_SETTLEMENT_STREETS, jsonObjectIn);
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

        JsonObject jsonObject = jsonService.toObject(address, api_key, ADDRESS, SAVE);
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

        JsonObject jsonObjectIn = new JsonObject();
        jsonObjectIn.addProperty(REF, address_ref);

        JsonObject jsonObject = jsonService.toObject(api_key, ADDRESS, DELETE, jsonObjectIn);

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

        JsonObject jsonObject = jsonService.toObject(address, api_key, ADDRESS, UPDATE);

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

        JsonObject jsonObjectIn = (JsonObject) new Gson().toJsonTree(settlement);
        jsonObjectIn.addProperty(PAGE, pagination.getPage());
        jsonObjectIn.addProperty(LIMIT, pagination.getLimit());

        JsonObject jsonObject = jsonService.toObject(api_key, ADDRESS, GET_SETTLEMENTS, jsonObjectIn);

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

        JsonObject jsonObjectIn = (JsonObject) new Gson().toJsonTree(city);
        jsonObjectIn.addProperty(PAGE, pagination.getPage());
        jsonObjectIn.addProperty(LIMIT, pagination.getLimit());

        JsonObject jsonObject = jsonService.toObject(api_key, ADDRESS, GET_CITIES, jsonObjectIn);

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

        JsonObject jsonObject = jsonService.toObject(api_key, ADDRESS, GET_AREAS);

        return service
                .postRequest(URL, jsonObject)
                .getResponse(new GetRegions());

    }


    public GetDepartment getDepartment(SimpleWarehouse warehouse, Pagination pagination, String api_key) throws IOException {

        JsonObject jsonObjectIn = (JsonObject) new Gson().toJsonTree(warehouse);
        jsonObjectIn.addProperty(PAGE, pagination.getPage());
        jsonObjectIn.addProperty(LIMIT, pagination.getLimit());

        JsonObject jsonObject = jsonService.toObject(api_key, ADDRESS, GET_WAREHOUSES, jsonObjectIn);

        return service
                .postRequest(URL, jsonObject)
                .getResponse(new GetDepartment());
    }


    public GetWarehouseTypes getWarehouseTypes(String api_key) throws IOException {

        JsonObject jsonObject = jsonService.toObject(api_key, ADDRESS, GET_WAREHOUSE_TYPES);

        return service
                .postRequest(URL, jsonObject)
                .getResponse(new GetWarehouseTypes());
    }

    private GetStreet getStreet(SimpleStreet street, Pagination pagination, String api_key) throws IOException {

        JsonObject jsonObjectIn = (JsonObject) new Gson().toJsonTree(street);
        jsonObjectIn.addProperty(PAGE, pagination.getPage());
        jsonObjectIn.addProperty(LIMIT, pagination.getLimit());

        JsonObject jsonObject = jsonService.toObject(api_key, ADDRESS, GET_STREET, jsonObjectIn);

        return service
                .postRequest(URL, jsonObject)
                .getResponse(new GetStreet());
    }


}
