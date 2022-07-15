package com.example.rocketmq.controller;

import com.example.rocketmq.service.MQProducerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.rocketmq.client.producer.SendResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rocketmq")
@Api(tags = "rocketmq")
public class RocketMQController {

    @Autowired
    private MQProducerService mqProducerService;

    @GetMapping("/send")
    @ApiOperation(value = "发送信息", notes = "发送信息")
    public void send() {
        mqProducerService.send("user");
    }
    
    @GetMapping("/sendTag")
    @ApiOperation(value = "发送tag信息", notes = "发送tag信息")
    public SendResult sendTag() {
        return mqProducerService.sendTagMsg("带有tag的字符消息");
    }

}