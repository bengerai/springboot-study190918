package com.bengerai.studay.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitMqSenderServiceTest {

    /**
     * mq send 服务类实例.
     */
    @Autowired
    private RabbitMqService rabbitMqService;

    @Test
    public void send() {

        rabbitMqService.send("bengerai");
    }

}
