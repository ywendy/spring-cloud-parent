package com.wendy.spring.cloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by Administrator on 2017/11/20.
 */
@EnableConfigServer
@SpringBootApplication
public class MyConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyConfigServerApplication.class,args);
    }
}
