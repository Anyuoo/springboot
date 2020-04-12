package com.anyu.springbootjdbcdemo.services.impl;

import com.anyu.springbootjdbcdemo.dao.UserDao;
import com.anyu.springbootjdbcdemo.dao.impl.UserDaoImpl;
import com.anyu.springbootjdbcdemo.entries.User;
import com.anyu.springbootjdbcdemo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 用户管理业务层
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    @Override
    @Transactional
    public void update(User user) {
        userDao.insertUser(user);
    }

    @Override
    public void delete(String name) {

    }

    @Override
    public List<User> findUserAll() {
        return userDao.findUserAll();
    }

    @Override
    public User selectByName(String name) {
        return userDao.selectByName(name);
    }
}
