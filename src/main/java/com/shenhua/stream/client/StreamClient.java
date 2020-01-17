package com.shenhua.stream.client;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;



public interface StreamClient {

    String TEST_OUT_PUT = "testOutPut";

    String TEST_IN_PUT = "testInPut";


    @Output(TEST_OUT_PUT)
    MessageChannel testOutPut();


    @Input(TEST_IN_PUT)
    SubscribableChannel testInPut();

}
