package com.shenhua.stream.send;

import com.shenhua.stream.client.StreamClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

@EnableBinding(StreamClient.class)
public class MqMessageProducer {

    @Autowired
    @Output(StreamClient.TEST_OUT_PUT)
    private MessageChannel channel;


    public void sendMsg(String msg) {
        channel.send(MessageBuilder.withPayload(msg).build());
        System.err.println("消息发送成功："+msg);
    }
}