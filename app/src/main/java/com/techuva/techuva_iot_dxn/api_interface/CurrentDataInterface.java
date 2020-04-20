package com.techuva.techuva_iot_dxn.api_interface;

import com.google.gson.JsonElement;
import com.techuva.techuva_iot_dxn.app.Constants;
import com.techuva.techuva_iot_dxn.model.CurrentDataMainObject;
import com.techuva.techuva_iot_dxn.model.CurrentDataPostParameter;
import com.techuva.techuva_iot_dxn.model.WaterMonCurrentDataPostParameter;
import com.techuva.techuva_iot_dxn.response_model.WaterMonMainObject;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;


public interface CurrentDataInterface {

    @POST(Constants.CurrentData)
    Call<CurrentDataMainObject>  getStringScalar(@Body CurrentDataPostParameter postParameter);

    @POST(Constants.CurrentData)
    Call<CurrentDataMainObject>  getStringScalarWithSession(@Header("authUser") int headerValue, @Header("authorization") String authorization, @Body CurrentDataPostParameter postParameter);

    @POST(Constants.GetWaterMonValues)
    Call<WaterMonMainObject>  getWaterMonValues(@Header("authUser") int headerValue, @Header("authorization") String authorization, @Body WaterMonCurrentDataPostParameter postParameter);

    @POST(Constants.CurrentDataForWaterMon)
    Call<JsonElement>  getCurrentDataForWaterMon(@Header("authUser") int headerValue, @Header("authorization") String authorization, @Body CurrentDataPostParameter postParameter);

    @POST(Constants.DataValueWaterMon)
    Call<JsonElement>  getAllDataWaterMon(@Header("authUser") int headerValue, @Header("authorization") String authorization, @Body WaterMonCurrentDataPostParameter postParameter);

    @POST(Constants.ChannelDataProcom)
    Call<JsonElement>  getChannelDataForProcom(@Header("authUser") int headerValue, @Header("authorization") String authorization, @Body CurrentDataPostParameter postParameter);


}
