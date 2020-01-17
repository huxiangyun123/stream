package com.shenhua.stream.controller;

import com.shenhua.stream.client.StreamClient;
import com.shenhua.stream.send.MqMessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableBinding(StreamClient.class)
public class StreamController {

    @Autowired
    MqMessageProducer mqMessageProducer;

    @GetMapping("/test")
    public void test(){
        mqMessageProducer.sendMsg("hello spring cloud stream");
    }
}
