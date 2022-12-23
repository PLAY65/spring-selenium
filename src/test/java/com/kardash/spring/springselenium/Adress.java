package com.kardash.spring.springselenium;

import org.springframework.stereotype.Component;

@Component
public class Adress {
    private String street;

    public Adress(){
        this.street="123 non main";
    }

    public String getStreet() {
        return street;
    }
}
