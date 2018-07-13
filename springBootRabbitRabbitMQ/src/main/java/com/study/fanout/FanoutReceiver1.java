package com.study.fanout;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author liuxin
 * @Title: FanoutReceiver1
 * @ProjectName springBootTest
 * @Description: TODO
 * @date 2018/7/1315:10
 */
@Component
@RabbitListener(queues = "fanout.A")
public class FanoutReceiver1 {
    @RabbitHandler
    public void process(String message){
        System.err.println("receiver1 "+message);
    }
}
