package com.cognizant.spring.bootdemo;

import org.springframework.stereotype.Component;

@Component
public class GreetingComponent implements GreetingService {

    @Override
    public void greet() {
        System.out.println("Welcome to Spring Boot Application from GreetingComponent!");
    }
}
