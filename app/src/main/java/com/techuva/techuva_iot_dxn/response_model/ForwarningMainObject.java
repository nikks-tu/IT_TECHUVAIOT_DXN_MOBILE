package com.techuva.techuva_iot_dxn.response_model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ForwarningMainObject {

    @SerializedName("result")
    @Expose
    private List<forwarningResultObject> result = null;
    @SerializedName("info")
    @Expose
    private forwarningInfoObject info;

    public List<forwarningResultObject> getResult() {
        return result;
    }

    public void setResult(List<forwarningResultObject> result) {
        this.result = result;
    }

    public forwarningInfoObject getInfo() {
        return info;
    }

    public void setInfo(forwarningInfoObject info) {
        this.info = info;
    }

}