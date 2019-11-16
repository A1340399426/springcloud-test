package com.example.eurekaconsumer2.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "eureka-producer")
@Component
public interface FeignInterface {

    @RequestMapping("provide/offerMessage")
    public String getMessage();
}
