package com.wendy.springboot.oauth.d2.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.stream.Collectors;

/**
 * Created by Administrator on 2018/1/23.
 */
public class CustomUserDetails extends Users implements UserDetails{


    public CustomUserDetails(final  Users users) {
        super(users);
    }

    public Collection<? extends GrantedAuthority> getAuthorities() {
    return     getRoles()
                .stream()
                .map(role -> new SimpleGrantedAuthority("ROLE_"+role.getRole()))
                .collect(Collectors.toList());
    }

    public String getPassword() {
        return super.getPassword();
    }

    public String getUsername() {
        return super.getName();
    }

    public boolean isAccountNonExpired() {
        return true;
    }

    public boolean isAccountNonLocked() {
        return true;
    }

    public boolean isCredentialsNonExpired() {
        return true;
    }

    public boolean isEnabled() {
        return true;
    }
}
