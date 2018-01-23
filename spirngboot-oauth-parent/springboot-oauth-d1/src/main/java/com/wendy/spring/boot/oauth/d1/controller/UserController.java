package com.wendy.spring.boot.oauth.d1.controller;

import com.wendy.spring.boot.oauth.d1.model.User;
import com.wendy.spring.boot.oauth.d1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Administrator on 2018/1/22.
 */
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "user",method = RequestMethod.GET)
    public List<User> listUser(){
        return userService.findAll();
    }


    @RequestMapping(value = "user",method = RequestMethod.POST)
    public User create(@RequestBody User user){
        return userService.save(user);
    }



    @RequestMapping(value = "user/{id}",method = RequestMethod.DELETE)
    public String delete(@PathVariable(value = "id") Long id){
        userService.delete(id);
        return "success";
    }
}
