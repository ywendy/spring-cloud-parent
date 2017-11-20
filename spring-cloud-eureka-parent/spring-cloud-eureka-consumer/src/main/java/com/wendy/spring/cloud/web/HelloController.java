package com.wendy.spring.cloud.web;

import com.wendy.spring.cloud.servie.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/11/20.
 */
@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;


    @RequestMapping("/sayHello")
    public String sayHello(@RequestParam String name){
        return helloService.sysHello(name);
    }
}
