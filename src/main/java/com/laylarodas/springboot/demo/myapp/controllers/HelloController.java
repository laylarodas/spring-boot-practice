package com.laylarodas.springboot.demo.myapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("/hello")
    public String helloAlternative() {
        return "Hello World from /hello endpoint!";
    }
}

