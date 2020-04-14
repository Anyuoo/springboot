package anyu.springbootshiro.mapper;

import anyu.springbootshiro.entity.User;

public interface UserMapper {
    public User selectById(Integer id);

    public User selectByName(String username);
}
