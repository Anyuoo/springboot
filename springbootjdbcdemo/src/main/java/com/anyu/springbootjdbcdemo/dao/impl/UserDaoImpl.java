package com.anyu.springbootjdbcdemo.dao.impl;

import com.anyu.springbootjdbcdemo.dao.UserDao;
import com.anyu.springbootjdbcdemo.entries.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * 持久层
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public void insertUser(User user) {
        String sql="insert into user(username,sex) values(?,?) ";
        jdbcTemplate.update(sql,user.getUserName(),user.getSex());
    }

    @Override
    public List<User> findUserAll() {
        String sql="select * from user";
        List<User> users=jdbcTemplate.query(sql, (ResultSet resultSet, int i)->{
                User user=new User();
                user.setUserName(resultSet.getString("username"));
                user.setSex(resultSet.getString("sex"));
                return user;
            }
        );
        return users;
    }

    @Override
    public void deleteUser(String name) {

    }

    @Override
    public User selectByName(String name) {
        String sql="select * from user where username = ? ";
        Object[] arr=new Object[]{name};
        return jdbcTemplate.query(sql, arr, (ResultSet resultSet)->{
            User user=new User();
            user.setUserName(resultSet.getString("username"));
            user.setSex(resultSet.getString("sex"));
            return user;
        });
    }
}
