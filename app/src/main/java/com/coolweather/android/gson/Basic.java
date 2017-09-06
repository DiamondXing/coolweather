package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {

    //使用注解的方式来让JSON字段和 Java字段之间建立映射关系
    @SerializedName("city") //城市名
    public String cityName;

    @SerializedName("id")  //城市对应的天气id
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")  //天气更新的时间
        public String updateTime;

    }

}
