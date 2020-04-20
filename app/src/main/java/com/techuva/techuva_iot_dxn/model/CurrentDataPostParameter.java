package com.techuva.techuva_iot_dxn.model;

public class CurrentDataPostParameter {


    private String deviceId;
    private String userId;
    private String channelNo;

    public CurrentDataPostParameter(String deviceId, String userId, String channelNo) {
        this.deviceId = deviceId;
        this.userId = userId;
        this.channelNo = channelNo;
    }

    public CurrentDataPostParameter(String deviceId) {
        this.deviceId = deviceId;
    }

    public CurrentDataPostParameter(String deviceId, String userId) {
        this.deviceId = deviceId;
        this.userId = userId;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getChannelNo() {
        return channelNo;
    }

    public void setChannelNo(String channelNo) {
        this.channelNo = channelNo;
    }

}
