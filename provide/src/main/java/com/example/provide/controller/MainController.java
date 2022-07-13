package com.example.provide.controller;

import com.example.provide.exception.basic.APIResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "provide")
public class MainController {

    @GetMapping("/helloNacos")
    @ApiOperation(value = "你好", notes = "helloNacos")
    public APIResponse<String> helloNacos(){
        return APIResponse.ok("helloNacos");
    }


}
