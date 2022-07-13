package com.example.openfeign.controller;


import com.example.openfeign.remote.AuthFeignClient;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "openfeign")
public class MainController {

    @Autowired
    private AuthFeignClient authFeignClient;

    @GetMapping("/hello")
    @ApiOperation(value = "你好", notes = "hello")
    public String hello() {
        return authFeignClient.helloNacos();
    }

}
