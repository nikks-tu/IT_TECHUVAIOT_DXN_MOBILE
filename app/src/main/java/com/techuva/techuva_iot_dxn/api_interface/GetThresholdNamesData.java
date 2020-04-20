package com.techuva.techuva_iot_dxn.api_interface;

import com.google.gson.JsonElement;
import com.techuva.techuva_iot_dxn.app.Constants;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

public interface GetThresholdNamesData {

    @GET(Constants.GetHBLThresholdNamesList)
    Call<JsonElement> getStringScalar();

    @GET(Constants.GetHBLThresholdNamesList)
    Call<JsonElement> getStringScalarWithSession(@Header("authUser") int headerValue, @Header("authorization") String authorization);
}