package com.example.springbootswagger2.model;

import io.swagger.annotations.ApiModelProperty;


// 1- complete student def : country and class
public class Student {


    // 5- add swagger api model for all att

    @ApiModelProperty(notes = "Name of the Student", name = "name", required = true, value = "test name")
    private String name;

    private String country;

    private String cls;

    public Student(String name, String country, String cls) {
        super();
        this.name = name;
        this.country = country;
        this.cls = cls;
    }

    public String getCls() {
        return cls;
    }

    public String getCountry() {
        return country;
    }


    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", cls=" + cls + ",country=" + country + "]";
    }

}
