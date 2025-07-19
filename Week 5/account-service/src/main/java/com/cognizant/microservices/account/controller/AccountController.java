package com.cognizant.microservices.account.controller;

import com.cognizant.microservices.account.model.Account;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {

    @GetMapping
    public Account getAccountDetails() {
        return new Account("ACC123456", "Savings", 12000.50);
    }
}
