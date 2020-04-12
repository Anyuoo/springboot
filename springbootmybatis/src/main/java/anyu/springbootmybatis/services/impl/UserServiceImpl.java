package anyu.springbootmybatis.services.impl;

import anyu.springbootmybatis.dao.UserDao;
import anyu.springbootmybatis.entities.User;
import anyu.springbootmybatis.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    @Transactional
    public void addUser(User user) {
        this.userDao.addUser(user);
    }

    @Override
    public List<User> findUserAll() {
        return this.userDao.findUserAll();
    }

    @Override
    public User findUserById(Integer id) {
        return this.userDao.findUserById(id);
    }

    @Override
    @Transactional
    public void deleteUser(Integer id) {
        this.userDao.deleteUser(id);
    }

    @Override
    public void updateUser(User user) {
        this.userDao.updateUser(user);
    }
}
