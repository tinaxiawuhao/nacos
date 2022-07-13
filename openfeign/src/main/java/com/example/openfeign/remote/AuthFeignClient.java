package com.example.openfeign.remote;


import com.example.openfeign.fallback.AuthFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


//@FeignClient( name="provide", fallback = AuthFallbackFactory.class)
@FeignClient( name="provide", fallbackFactory = AuthFallbackFactory.class)
public interface AuthFeignClient {

    @GetMapping("/provide/helloNacos")
    String helloNacos();
}
