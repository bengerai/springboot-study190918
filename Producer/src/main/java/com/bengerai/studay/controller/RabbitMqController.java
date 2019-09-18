package com.bengerai.studay.controller;

import com.bengerai.studay.service.RabbitMqService;
import com.sun.net.httpserver.Authenticator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rabbitmq")
public class RabbitMqController {

    @Autowired
    private RabbitMqService rabbitMqService;

    @GetMapping("/send")
    public HttpStatus send(String message) {
        rabbitMqService.send(message);

        return HttpStatus.OK;
    }

}
