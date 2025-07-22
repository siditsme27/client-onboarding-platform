package com.onboarding.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @PostMapping("/register")
    public String register(@RequestBody String user) {
        return "User registered: " + user;
    }

    @GetMapping("/status")
    public String status() {
        return "Onboarding service is up and running.";
    }
}
