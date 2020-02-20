package com.example.demo.service;


import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {

    @Resource
    private UserMapper userMapper;

    public Integer insertUser(User user) {
        return userMapper.insertUser(user);
    }

    public Integer insertUser(List<User> users) {
        return userMapper.batchInsertUser(users);
    }

    public User deleteUser(Integer id) {
        return userMapper.deleteUser(id);
    }

    public User updateUser(User user) {
        return userMapper.updateUser(user);
    }

    public User selectUser(Integer id) {
        return userMapper.selectUser(id);
    }

    public List<User> selectUser() {
        return userMapper.selectAllUser();
    }

    public List<User> selectUserByName(String name) {
        return userMapper.selectUserByName(name);
    }

}
