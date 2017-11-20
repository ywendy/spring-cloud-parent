package com.wendy.spring.cloud.feign.web;

import com.wendy.spring.cloud.feign.service.FeignSayHelloService;
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
    FeignSayHelloService feignSayHelloService;

    @RequestMapping("/sayHello")
    public String sayHello(@RequestParam String name){
        return feignSayHelloService.sayHelloFromClient(name);
    }
}
