package com.wendy.spring.cloud.feign.error;

import com.wendy.spring.cloud.feign.service.FeignSayHelloService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2017/11/20.
 */
@Component
public class FeignSayHelloServiceHystric implements FeignSayHelloService {
    public String sayHelloFromClient(@RequestParam("name") String name) {
        return "sorry ,"+name;
    }
}
