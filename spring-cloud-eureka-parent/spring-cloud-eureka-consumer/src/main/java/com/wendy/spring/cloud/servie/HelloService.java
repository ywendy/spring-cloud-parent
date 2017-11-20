package com.wendy.spring.cloud.servie;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Administrator on 2017/11/20.
 */
@Service
public class HelloService {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "sayHelloError")
    public String sysHello(String name){
        return restTemplate.getForObject("http://spring-sayhello-service/sayHello?name="+name,String.class);
    }

    public String sayHelloError(String name){
        return "hello:"+name+" ,sorry system error!";
    }

}
