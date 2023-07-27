package com.k7it.sms.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class controller {
    @GetMapping("/")
    public String index() {
        return "index";
    }
    @GetMapping("/login")
    public String login() {
        return "login";
}
    @GetMapping("/register")
    public String register() {
        return "register";
    }
}
