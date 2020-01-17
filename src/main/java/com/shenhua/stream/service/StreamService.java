package com.shenhua.stream.service;

import com.shenhua.stream.client.StreamClient;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
@EnableBinding(StreamClient.class)
public class StreamService {

    @StreamListener(StreamClient.TEST_IN_PUT)
    public void messageInPut(Message<String> message) {

        System.err.println(" 消息接收成功：" + message.getPayload());
    }
}
