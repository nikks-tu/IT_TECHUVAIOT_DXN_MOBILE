package com.techuva.techuva_iot_dxn.api_interface;


import com.techuva.techuva_iot_dxn.app.Constants;
import com.techuva.techuva_iot_dxn.model.ForwarningPostParameters;
import com.techuva.techuva_iot_dxn.response_model.ForwarningMainObject;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;


public interface ForwarningDataInterface {

    @POST(Constants.ForwarningDataCall)
    Call<ForwarningMainObject>  getStringScalar(@Body ForwarningPostParameters postParameter);

    @POST(Constants.ForwarningDataCall)
    Call<ForwarningMainObject>  getStringScalarWithSession(@Header("authUser") int headerValue, @Header("authorization") String authorization, @Body ForwarningPostParameters postParameter);

}
