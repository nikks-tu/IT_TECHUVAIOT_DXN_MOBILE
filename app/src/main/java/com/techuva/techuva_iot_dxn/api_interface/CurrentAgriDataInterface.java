package com.techuva.techuva_iot_dxn.api_interface;

import com.techuva.techuva_iot_dxn.app.Constants;
import com.techuva.techuva_iot_dxn.model.CurrentDataAgriPostParameter;
import com.techuva.techuva_iot_dxn.model.CurrentDataMainObject;
import com.techuva.techuva_iot_dxn.model.CurrentDataPostParameter;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;


public interface CurrentAgriDataInterface {

    @POST(Constants.CurrentDataAgri)
    Call<CurrentDataMainObject>  getStringScalar(@Body CurrentDataPostParameter postParameter);

    @POST(Constants.CurrentData)
    Call<CurrentDataMainObject>  getStringScalarWithSession(@Header("authUser") int headerValue, @Header("authorization") String authorization, @Body CurrentDataAgriPostParameter postParameter);

}
