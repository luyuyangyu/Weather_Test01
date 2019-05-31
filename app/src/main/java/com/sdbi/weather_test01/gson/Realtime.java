package com.sdbi.weather_test01.gson;

import com.google.gson.annotations.SerializedName;

/*
"temperature":"24",
        "humidity":"41",
        "info":"晴",
        "wid":"00",
        "direct":"东北风",
        "power":"4级",
        "aqi":"66"
*/
public class Realtime {
    @SerializedName("temperature")
    public String temperature;
    @SerializedName("humidity")
    public String humidity;
    @SerializedName("info")
    public String info;
    @SerializedName("direct")
    public String direct;
    @SerializedName("power")
    public String power;
    @SerializedName("aqi")
    public String aqi;

}
