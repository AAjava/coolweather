package com.coolweather.android.db;

/**
 * Created by Administrator on 2017/3/21.
 */
public class Province extends DataSupport {
    private int id;  //每个实体类应有的id
    private String provinceName; //省份名
    private int provinceCode;       //省份代号

    public Province() {
    }

    public Province(int id, String provinceName, int provinceCode) {
        this.id = id;
        this.provinceName = provinceName;
        this.provinceCode = provinceCode;
    }

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