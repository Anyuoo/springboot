package anyu.springbootmybatis.dao.impl;

import anyu.springbootmybatis.dao.UserDao;
import anyu.springbootmybatis.entities.User;
import anyu.springbootmybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private UserMapper userMapper;
    @Override
    public void addUser(User user) {
        this.userMapper.insert(user);
    }

    @Override
    public List<User> findUserAll() {
        return this.userMapper.findAll();
    }

    @Override
    public User findUserById(Integer id) {
        return this.userMapper.selectByPrimaryKey(id);
    }

    @Override
    public void deleteUser(Integer id) {
    this.userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void updateUser(User user) {
        this.userMapper.updateByPrimaryKey(user);
    }
}
