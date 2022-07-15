package com.example.rocketmq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class RocketmqApplication {

	public static void main(String[] args) {
		SpringApplication.run(RocketmqApplication.class, args);
	}

}
