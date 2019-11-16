package com.example.eurekaconsumer.controller;


import com.example.eurekaconsumer.service.FeignInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.management.MalformedObjectNameException;
import java.io.IOException;

@RestController
public class TestController {
    private final static Logger LOGGER = LoggerFactory.getLogger(TestController.class);

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @Autowired
    private RestTemplate restTemplate;

//    @Autowired
//    LoadBalancerClient loadBalancerClient;

    @Autowired
    private FeignInterface service;


    @RequestMapping("consumer/getMessage")
    public String testConsumer() throws IOException, MalformedObjectNameException {

        LOGGER.info("========消费者开始执行========");


        String message = service.getMessage();
        return "消费者1:" + message;

    }
}
