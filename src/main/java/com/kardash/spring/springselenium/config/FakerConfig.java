package com.kardash.spring.springselenium.config;

import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class FakerConfig {

    @Bean
    public Faker getFaker(){
        return new Faker();
    }
}
