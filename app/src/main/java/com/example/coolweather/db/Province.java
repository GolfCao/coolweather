package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

public class Province extends DataSupport {
    private int id;
    private String provinceName;
    private int provinceCode;

    public int getId() {
        return id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public int getPrivinceCode() {
        return provinceCode;
    }

    public void setId() {
        this.id = id;
    }

    public void setProvinceName() {
        this.provinceName = provinceName;
    }

    public void setProvinceCode() {
        this.provinceCode = provinceCode;
    }
}
