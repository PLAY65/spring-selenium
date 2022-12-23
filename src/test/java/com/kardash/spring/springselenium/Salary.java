package com.kardash.spring.springselenium;

import org.springframework.stereotype.Component;

@Component
public class Salary {
    private String amount;

    public Salary(){
        this.amount = "123";
    }

    public String getAmount(){
        return amount;
    }
}
