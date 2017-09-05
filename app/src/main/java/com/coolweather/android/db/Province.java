package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

public class Province extends DataSupport { //LitePal中的每个实体类都是必须继承自DataSupport

    private int id; //省ID

    private String provinceName;//省名称

    private int provinceCode;//省代号

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
