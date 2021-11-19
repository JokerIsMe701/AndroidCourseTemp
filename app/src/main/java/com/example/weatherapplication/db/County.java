package com.example.weatherapplication.db;

import org.litepal.annotation.Column;
import org.litepal.crud.LitePalSupport;

public class County extends LitePalSupport {
    @Column(unique = true)
    private int id;
    @Column(unique = true)
    private String countyName;
    @Column(unique = true)
    private String weatherId;
    @Column(unique = true)
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
