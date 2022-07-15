package com.example.sentinel.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/sentinel")
    public String sentinelTest(){
        return "hello";
    }
}
