package com.wendy.spring.cloud.feign.service;

import com.wendy.spring.cloud.feign.error.FeignSayHelloServiceHystric;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2017/11/20.
 */
@FeignClient(value = "spring-sayhello-service",fallback = FeignSayHelloServiceHystric.class)
public interface FeignSayHelloService {

    @RequestMapping("/sayHello")
     String sayHelloFromClient(@RequestParam("name") String name);
}
