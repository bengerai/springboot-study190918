package com.bengerai.studay.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * mq 消息发送服务类.
 *
 * @author zhouyl bengerai@126.com
 */
@Service
public class RabbitMqService {

    /**
     * spring中rabbitmq操作服务类实例.
     */
    @Autowired
    private AmqpTemplate amqpTemplate;

    /**
     * 测试发送消息到MQ.
     *
     * @param message 待发送的消息
     */
    public void send(final String message) {

        System.out.printf("Sender Message %s to RabbitMQ\n", message);
        amqpTemplate.convertAndSend("hello", message);
    }

}
