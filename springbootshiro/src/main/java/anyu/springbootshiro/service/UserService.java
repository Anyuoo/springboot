package anyu.springbootshiro.service;

import anyu.springbootshiro.entity.User;

public interface UserService {
    public User selectById(Integer id);

    public User selectByName(String username);
}
