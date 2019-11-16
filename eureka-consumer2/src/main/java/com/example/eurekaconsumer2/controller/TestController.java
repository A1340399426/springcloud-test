package com.example.eurekaconsumer2.controller;


import com.example.eurekaconsumer2.service.FeignInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private FeignInterface service;

    @RequestMapping("consumer/getMessage")
   public String testConsumer() {

        String message = service.getMessage();
        return "消费者2:" + message;
    }
}
