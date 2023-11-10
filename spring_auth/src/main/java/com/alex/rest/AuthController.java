package com.alex.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @GetMapping("/info")
    public String info() {
        return "My application";
    }

    @GetMapping("/about")
    public String about() {
        return "All about us";
    }

    @GetMapping("/admin")
    public String admin() {
        return "I am admin";
    }
}
