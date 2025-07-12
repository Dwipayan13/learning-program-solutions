package com.cognizant.rest.spring_rest_handson;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Country country = (Country) context.getBean("country");

        System.out.println("Country Code: " + country.getCode());
        System.out.println("Country Name: " + country.getName());
    }
}
