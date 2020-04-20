package com.techuva.techuva_iot_dxn.api_interface;
import com.techuva.techuva_iot_dxn.app.Constants;
import com.techuva.techuva_iot_dxn.model.DevicesListMainObject;
import com.techuva.techuva_iot_dxn.model.DevicesListPostParameter;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;


public interface ListofDevicesInterface {

    @POST(Constants.ListofDevices)
    Call<DevicesListMainObject> getStringScalar(@Header("authUser") int headerValue, @Header("authorization") String authorization, @Body DevicesListPostParameter postParameter);
}
