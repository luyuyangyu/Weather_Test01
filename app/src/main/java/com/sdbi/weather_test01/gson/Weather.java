package com.sdbi.weather_test01.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Weather {
    public String city;
    public Realtime realtime;
    @SerializedName("future")
    public List<Future> FutureList;
}
