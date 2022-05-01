package com.deenn.springsecurity.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @GetMapping("/")
    public String home() {
        return "Welcome";
    }

    @GetMapping("/user")
    public String user() {
        return "Welcome user";
    }

    @GetMapping("/admin")
    public String admin() {
        return "welcome admin";
    }
}
