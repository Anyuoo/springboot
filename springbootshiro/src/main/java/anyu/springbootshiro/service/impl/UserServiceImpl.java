package anyu.springbootshiro.service.impl;

import anyu.springbootshiro.entity.User;
import anyu.springbootshiro.mapper.UserMapper;
import anyu.springbootshiro.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Service;


@Service
@ImportResource
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectById(Integer id) {
        return userMapper.selectById(id);
    }

    @Override
    public User selectByName(String username) {
        return userMapper.selectByName(username);
    }
}
