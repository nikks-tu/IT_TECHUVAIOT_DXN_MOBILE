package com.techuva.techuva_iot_dxn.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CurrentDataValueObject {

    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("ChannelNumber")
    @Expose
    public Integer channelNumber;
    @SerializedName("Label")
    @Expose
    private String label;
    @SerializedName("Value")
    @Expose
    private String value;
    @SerializedName("channeldescription")
    @Expose
    private String channelDescription;
    @SerializedName("channeldefaultvalue")
    @Expose
    private String channelDefaultValue;
    @SerializedName("icon")
    @Expose
    private String icon;
    @SerializedName("display_order")
    @Expose
    private Integer displayOrder;
    @SerializedName("time")
    @Expose
    private String time;
    @SerializedName("unit_of_measure")
    @Expose
    public String unit_of_measure;
    @SerializedName("ProvisionedOn")
    @Expose
    public String provisionedOn;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getChannelNumber() {
        return channelNumber;
    }

    public void setChannelNumber(Integer channelNumber) {
        this.channelNumber = channelNumber;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getUnit_of_measure() {
        return unit_of_measure;
    }

    public void setUnit_of_measure(String unit_of_measure) {
        this.unit_of_measure = unit_of_measure;
    }


    public String getChannelDescription() {
        return channelDescription;
    }

    public void setChannelDescription(String channelDescription) {
        this.channelDescription = channelDescription;
    }

    public String getChannelDefaultValue() {
        return channelDefaultValue;
    }

    public void setChannelDefaultValue(String channelDefaultValue) {
        this.channelDefaultValue = channelDefaultValue;
    }

    public String getProvisionedOn() {
        return provisionedOn;
    }

    public void setProvisionedOn(String provisionedOn) {
        this.provisionedOn = provisionedOn;
    }


}
