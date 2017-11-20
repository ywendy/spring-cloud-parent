package com.wendy.spring.cloud.eureka.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/11/20.
 */
@RestController
public class SayHelloController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/sayHello")
    public String sayHello(@RequestParam String name) {
        return "hello: " + name + " , I am from port:" + port;
    }

}
