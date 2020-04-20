package com.techuva.techuva_iot_dxn.api_interface;

import com.google.gson.JsonElement;
import com.techuva.techuva_iot_dxn.app.Constants;
import com.techuva.techuva_iot_dxn.model.CurrentDataPostParameter;
import com.techuva.techuva_iot_dxn.model.DeviceTokenPostParameter;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;


public interface DeviceTokenDataInterface {

    @POST(Constants.SaveDeviceToken)
    Call<JsonElement>  getStringScalar(@Body CurrentDataPostParameter postParameter);

    @POST(Constants.SaveDeviceToken)
    Call<JsonElement>  getStringScalarWithSession(@Header("authUser") int headerValue, @Header("authorization") String authorization, @Body DeviceTokenPostParameter postParameter);

}
