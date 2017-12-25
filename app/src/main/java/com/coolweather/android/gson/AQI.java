package com.coolweather.android.gson;

/**
 * Created by wlw00 on 2017/12/22.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
