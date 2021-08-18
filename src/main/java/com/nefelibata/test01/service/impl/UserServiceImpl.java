package com.nefelibata.test01.service.impl;

import com.nefelibata.test01.entity.User;
import com.nefelibata.test01.mapper.UserMapper;
import com.nefelibata.test01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    public int addUser(String username,int password,String phone){
        User user = new User(username,password,phone);
        int count = userMapper.addUser(user);
        return count;
    }
    public List<User> queryByUsername(String username){
        List <User> userList = userMapper.queryByUsername(username);
        return userList;
    }



}
