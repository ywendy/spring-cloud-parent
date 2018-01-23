package com.wendy.springboot.oauth.d2.service;

import com.wendy.springboot.oauth.d2.model.CustomUserDetails;
import com.wendy.springboot.oauth.d2.model.Users;
import com.wendy.springboot.oauth.d2.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Created by Administrator on 2018/1/23.
 */
@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private UsersRepository usersRepository;

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Optional<Users> usersOptional = usersRepository.findByName(username);
        usersOptional
                .orElseThrow( ()-> new UsernameNotFoundException("Username not found"));


        return usersOptional
                .map((users) -> new CustomUserDetails(users))
                .get();

    }
}

