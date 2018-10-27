package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

public class City extends DataSupport{
    private int id;
    private String cityName;
    private int cityCode;
    private int provinceId;
    public int getId() {
        return id;
    }

    public String getCityName(){
        return cityName;
    }

    public int getCityCode() {
        return  cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setId() {
        this.id = id;
    }

    public void setCityName() {
        this.cityName = cityName;
    }

    public void setCityCode() {
        this.cityCode = cityCode;
    }

    public void setProvinceId() {
        this.provinceId = provinceId;
    }
}
