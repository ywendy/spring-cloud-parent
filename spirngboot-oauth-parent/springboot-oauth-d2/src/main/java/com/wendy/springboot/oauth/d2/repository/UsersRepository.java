package com.wendy.springboot.oauth.d2.repository;

import com.wendy.springboot.oauth.d2.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Created by Administrator on 2018/1/23.
 */
public interface UsersRepository extends JpaRepository<Users,Integer> {
  Optional<Users>   findByName(String username);
}
