package com.techuva.techuva_iot_dxn.model;

public class CurrentDataAgriPostParameter {

    private String deviceId;


    public CurrentDataAgriPostParameter(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

}
