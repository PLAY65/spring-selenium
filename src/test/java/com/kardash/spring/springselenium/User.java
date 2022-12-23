package com.kardash.spring.springselenium;

import org.springframework.stereotype.Component;

@Component
public class User {

    private Adress adress;
    private Salary salary;

    public User(Adress adress, Salary salary){
        this.adress = adress;
        this.salary = salary;
    }

    public void printDetails(){
        System.out.println("Adress " + this.adress.getStreet());
        System.out.println("Salary " + this.salary.getAmount());
    }
}
