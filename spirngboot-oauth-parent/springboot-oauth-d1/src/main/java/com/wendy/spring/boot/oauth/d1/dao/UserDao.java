package com.wendy.spring.boot.oauth.d1.dao;

import com.wendy.spring.boot.oauth.d1.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2018/1/22.
 */
@Repository
public interface UserDao extends CrudRepository<User,Long> {
    User findByUsername(String username);
}
