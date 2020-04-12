package anyu.springbootmybatis.dao;

import anyu.springbootmybatis.entities.User;

import java.util.List;

public interface UserDao {
    void addUser(User user);
    List<User> findUserAll();
    User findUserById(Integer id);
    void deleteUser(Integer id);
    void updateUser(User user);
}
