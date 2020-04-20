package com.techuva.techuva_iot_dxn.api_interface;

import com.techuva.techuva_iot_dxn.app.Constants;
import com.techuva.techuva_iot_dxn.model.ForgotPassPostParameters;
import com.techuva.techuva_iot_dxn.model.ForgotPasswordMainObject;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;


public interface ForgotPasswordDataInterface {

    @POST(Constants.ForgetPassword)
    Call<ForgotPasswordMainObject> getStringScalar(@Body ForgotPassPostParameters postParameter);

}
