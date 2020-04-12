package anyu.springbootmybatis.services;

import anyu.springbootmybatis.entities.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    List<User> findUserAll();
    User findUserById(Integer id);
    void updateUser(User user);
    void deleteUser(Integer id);
}
