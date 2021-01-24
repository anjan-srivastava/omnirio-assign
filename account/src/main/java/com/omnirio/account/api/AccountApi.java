package com.omnirio.account.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( path = "api/accounts")
public class AccountApi {

    @GetMapping("/")
    public String greet() {
        return "Hello";
    }
}