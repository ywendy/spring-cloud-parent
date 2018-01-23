package com.wendy.springboot.oauth.d2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * Created by Administrator on 2018/1/23.
 */
@RestController
@RequestMapping("/rest/hello")
public class HelloResource {

    @GetMapping("/principal")
    public Principal user(Principal principal) {
        return principal;
    }

    @GetMapping
    public String hello() {
        return "Hello World";
    }
}
