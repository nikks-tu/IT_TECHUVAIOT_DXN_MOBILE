package com.techuva.techuva_iot_dxn.api_interface;

import com.google.gson.JsonElement;
import com.techuva.techuva_iot_dxn.app.Constants;
import com.techuva.techuva_iot_dxn.model.FullHistoryMainObject;
import com.techuva.techuva_iot_dxn.model.HistoryDataAllChannelPostParamter;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface HistoryTableGetData {



    @POST(Constants.HistoryDataAllChannels)
    Call<FullHistoryMainObject>  getStringScalar(@Body HistoryDataAllChannelPostParamter postParameter);


  /*  @POST(Constants.HistoryDataAllChannels)
    Call<FullHistoryMainObject>  getStringScalarWithSession(@Header("authUser") int headerValue, @Header("authorization") String authorization, @Body HistoryDataAllChannelPostParamter postParameter);

 */   @POST(Constants.HistoryDataAllChannelsForAgri)
    Call<FullHistoryMainObject>  getHistoryForAgriWithSession(@Header("authUser") int headerValue, @Header("authorization") String authorization, @Body HistoryDataAllChannelPostParamter postParameter);

    @POST(Constants.HistoryDataAllChannelsForAgri)
    Call<JsonElement>  getHistoryForAgriasJson(@Header("authUser") int headerValue, @Header("authorization") String authorization, @Body HistoryDataAllChannelPostParamter postParameter);

    @POST(Constants.HistoryDataAllChannels)
    Call<JsonElement>  getStringScalarWithSession(@Header("authUser") int headerValue, @Header("authorization") String authorization, @Body HistoryDataAllChannelPostParamter postParameter);

}
