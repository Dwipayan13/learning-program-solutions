package com.cognizant.springcore.ioc;

public class HelloGreetingService implements GreetingService {
    public void greet() {
        System.out.println(" Hello from HelloGreetingService (Spring IoC)!");
    }
}
