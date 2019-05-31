package com.sdbi.weather_test01.gson;

import com.google.gson.annotations.SerializedName;

/*
"date":"2019-05-31",
				"temperature":"16\/25℃",
				"weather":"晴转多云",
				"wid":{
					"day":"00",
					"night":"01"
				},
				"direct":"西北风转南风"
 */
public class Future {
    @SerializedName("date")
    public String date;
    @SerializedName("temperature")
    public String temperature;
    @SerializedName("weather")
    public String weather;
    @SerializedName("direct")
    public String direct;
}
