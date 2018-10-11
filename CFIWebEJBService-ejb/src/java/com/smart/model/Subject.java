package com.smart.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


public class Subject implements Serializable{
    public Subject(){

    }
    @SerializedName("Name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
