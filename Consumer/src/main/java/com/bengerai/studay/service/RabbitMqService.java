package com.bengerai.studay.service;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

/**
 * mq 消息服务类.
 *
 * @author zhouyl bengerai@126.com
 */
@Service
@RabbitListener(queues = "hello")
public class RabbitMqService {

    @RabbitHandler
    public void receive(final String message) {

        System.out.printf("Receive Message %s from RabbitMQ\n", message);
    }

}
