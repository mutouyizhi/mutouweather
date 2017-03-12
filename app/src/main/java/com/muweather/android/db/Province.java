package com.muweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by DELL on 2017-03-12.
 */

public class Province extends DataSupport {

    private int id;

    private String ProvinceName;

    private int provinceCode;

    public String getProvinceName() {
        return ProvinceName;
    }

    public void setProvinceName(String provinceName) {
        ProvinceName = provinceName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
