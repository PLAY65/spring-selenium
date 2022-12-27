package com.kardash.spring.springselenium.condition;

import com.kardash.spring.springselenium.SpringBaseTestNGTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class CarTest extends SpringBaseTestNGTest {

    @Autowired
    private Car car;

    @Test
    public void carTest(){
        this.car.run();
    }
}
