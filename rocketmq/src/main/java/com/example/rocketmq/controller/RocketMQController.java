package com.example.rocketmq.controller;

import com.example.rocketmq.service.MQProducerService;
import org.apache.rocketmq.client.producer.SendResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rocketmq")
public class RocketMQController {

    @Autowired
    private MQProducerService mqProducerService;

    @GetMapping("/send")
    public void send() {
        mqProducerService.send("user");
    }
    
    @GetMapping("/sendTag")
    public SendResult sendTag() {
        return mqProducerService.sendTagMsg("带有tag的字符消息");
    }

}