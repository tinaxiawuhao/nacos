package com.example.sentinel.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;

// blockHandler定义了流控触发后的处理逻辑，fallback则是当接口发生错误异常后会触发的逻辑
@RestController
public class MainController {

    private AtomicInteger count = new AtomicInteger();

    @GetMapping("/sentinel")
    public String sentinelTest(){
        return "hello";
    }

    @GetMapping("/sayHello")
    @SentinelResource(value = "testSayHello",blockHandler = "blockHandler",fallback = "fallback")
    public String sayHello(String name ){
        if(count.incrementAndGet() % 2 == 0 ){
            throw new RuntimeException("error");
        }
        return "Hello World "+name;
    }

    public String blockHandler(String name,BlockException e){
        e.printStackTrace();
        return "Blocked "+name;
    }

    public String fallback(String name,Throwable e){
        e.printStackTrace();
        return "Fallback "+name;
    }
}
