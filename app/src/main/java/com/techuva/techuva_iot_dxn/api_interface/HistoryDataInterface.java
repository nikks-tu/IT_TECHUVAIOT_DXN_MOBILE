package com.techuva.techuva_iot_dxn.api_interface;


import com.techuva.techuva_iot_dxn.app.Constants;
import com.techuva.techuva_iot_dxn.model.HistoryDataMainObject;
import com.techuva.techuva_iot_dxn.model.HistoryDataPostParamter;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;


public interface HistoryDataInterface {

    @POST(Constants.HistoryData)
    Call<HistoryDataMainObject>  getStringScalar(@Body HistoryDataPostParamter postParameter);

    @POST(Constants.HistoryData)
    Call<HistoryDataMainObject>  getStringScalarWithSession(@Header("authUser") int headerValue, @Header("authorization") String authorization, @Body HistoryDataPostParamter postParameter);

}
