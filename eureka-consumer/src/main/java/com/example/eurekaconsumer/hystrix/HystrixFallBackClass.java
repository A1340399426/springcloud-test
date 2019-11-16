package com.example.eurekaconsumer.hystrix;

import com.example.eurekaconsumer.service.FeignInterface;
import javafx.beans.DefaultProperty;
import org.omg.CORBA.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

import javax.management.MBeanServer;
import javax.management.MalformedObjectNameException;
import javax.management.ObjectName;
import javax.management.Query;
import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.net.ServerSocket;
import java.util.Set;

@Component
@ConfigurationProperties(prefix = "application")
public class HystrixFallBackClass implements FeignInterface {


    @Value("${server.port}")
    private String port;


    @Override
    public String getMessage() throws IOException, MalformedObjectNameException {
//
//        ServerSocket serverSocket = new ServerSocket(0);
//        int port = serverSocket.getLocalPort();
//
//        return "挂机了:" + port;

//        MBeanServer beanServer = ManagementFactory.getPlatformMBeanServer();
//        Set<ObjectName> objectNames = beanServer.queryNames(new ObjectName("*:type=Connector,*"),
//                Query.match(Query.attr("protocol"), Query.value("HTTP/1.1")));
//        String port = objectNames.iterator().next().getKeyProperty("port");
        return port;

    }
}
