package com.anyu.springbootjdbcdemo.dao;

import com.anyu.springbootjdbcdemo.entries.User;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface UserDao {
    void insertUser(User user);
    void deleteUser(String name);
    User selectByName(String name);
    List<User> findUserAll();
}
