package com.kardash.spring.springselenium;

import com.github.javafaker.Faker;
import com.kardash.spring.springselenium.config.FakerConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.PropertySource;

import java.util.List;

@SpringBootTest
class SpringSeleniumApplicationTests {

    @Autowired
    private Faker faker;

    @Autowired
    private FakerConfig fakerConfig;

    @Value("${TEST_URL:Path}")
    private String path;

    @Value("${timeout}")
    private int timeout;

    @Test
    void contextLoads() {
        System.out.println(faker.name().firstName());
    }

}
