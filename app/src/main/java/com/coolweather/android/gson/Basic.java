package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by wlw00 on 2017/12/22.
 */

public class Basic {
    @SerializedName("city")//使JSON和JAVA字段之间建立映射关系
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")

        public String updateTime;
    }
}
