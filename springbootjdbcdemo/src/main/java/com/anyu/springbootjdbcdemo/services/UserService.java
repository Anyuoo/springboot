package com.anyu.springbootjdbcdemo.services;

import com.anyu.springbootjdbcdemo.entries.User;

import java.util.List;

public interface UserService {
    void update(User user);
    void delete(String name);
    User selectByName(String name);
    List<User> findUserAll();
}
