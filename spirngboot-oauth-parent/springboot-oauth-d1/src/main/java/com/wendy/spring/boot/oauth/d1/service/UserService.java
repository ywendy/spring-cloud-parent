package com.wendy.spring.boot.oauth.d1.service;

import com.wendy.spring.boot.oauth.d1.model.User;

import java.util.List;

/**
 * Created by Administrator on 2018/1/22.
 */
public interface UserService {
    User save(User user);
    List<User> findAll();
    void delete(Long id);
}
