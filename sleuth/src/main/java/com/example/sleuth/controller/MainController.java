package com.example.sleuth.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/sleuth")
    @ApiOperation(value = "sleuth", notes = "sleuth")
    public String helloSleuth(){
        return "helloSleuth";
    }


}
