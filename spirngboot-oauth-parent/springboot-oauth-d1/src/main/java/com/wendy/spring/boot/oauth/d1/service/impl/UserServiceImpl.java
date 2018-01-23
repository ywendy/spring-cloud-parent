package com.wendy.spring.boot.oauth.d1.service.impl;

import com.wendy.spring.boot.oauth.d1.dao.UserDao;
import com.wendy.spring.boot.oauth.d1.model.User;
import com.wendy.spring.boot.oauth.d1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2018/1/22.
 */
@Service("userService")
public class UserServiceImpl implements UserService, UserDetailsService {

    @Autowired
    private UserDao userDao;

    public User save(User user) {
        return userDao.save(user);
    }

    public List<User> findAll() {
        List<User> list = new ArrayList<>();
        userDao.findAll().iterator().forEachRemaining(list::add);
        return list;
    }

    public void delete(Long id) {
        userDao.delete(id);
    }

    public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {
        User user = userDao.findByUsername(userId);
        if (user == null){
            throw  new UsernameNotFoundException("Invalid username or password.");
        }
        return new org.springframework.security.core.userdetails.User(user.getUsername(),user.getPassword(),getAuthority());



    }

    private List<SimpleGrantedAuthority> getAuthority(){

        return Arrays.asList(new SimpleGrantedAuthority("ROLE_ADMIN"));

    }

}
