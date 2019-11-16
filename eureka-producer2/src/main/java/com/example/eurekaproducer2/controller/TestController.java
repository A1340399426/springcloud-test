package com.example.eurekaproducer2.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private final static Logger LOGGER = LoggerFactory.getLogger(TestController.class);


    @RequestMapping("provide/offerMessage")
    public String testProvider() {

        LOGGER.info("==============生产者2开始生产消息=================");

        return "生产者2发送消息";

    }


}
