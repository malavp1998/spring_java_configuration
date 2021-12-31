package com.javaConfig.model;

import org.springframework.stereotype.Component;
//@Component
public class Student {

    int id;
    String name= "Piyush student";

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
