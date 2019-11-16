package com.example.eurekaconsumer.service;



import com.example.eurekaconsumer.hystrix.HystrixFallBackClass;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.management.MalformedObjectNameException;
import java.io.IOException;

@FeignClient(value = "eureka-producer",fallback = HystrixFallBackClass.class)
@Component
public interface FeignInterface {

    @RequestMapping(value = "provide/offerMessage")
    public String getMessage() throws IOException, MalformedObjectNameException;

}
