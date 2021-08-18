package com.nefelibata.test01.service;

import com.nefelibata.test01.entity.User;

import java.util.List;

public interface UserService {
    int addUser(String username,int password,String phone);//用于注册时，添加用户
    List<User> queryByUsername(String username);//用于登陆时，验证用户

    }

