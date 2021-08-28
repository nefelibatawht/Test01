package com.nefelibata.test01.controller;

import com.nefelibata.test01.entity.Response;
import com.nefelibata.test01.entity.User;
import com.nefelibata.test01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;
import java.util.Map;


    @RestController
    public class UserController {
        @Autowired
        private UserService service;
        @RequestMapping(value = "/register",method = RequestMethod.POST)
        public Response register(@RequestBody Map<String, String> person){//使用泛型实现一一对应
            String username = person.get("username");
            int password = Integer.parseInt(person.get("password"));
            String phone = person.get("phone");
            //1.判断用户名、密码、手机号是否为空
            if(username != null && password != 0 && phone != null){
                List<User> users =  service.queryByUsername(username);
                //2.判断是否有重复用户名
                if(users!=null && users.size()>0){
                    return new Response(true,"注册失败，用户名重复,请更换",-1);
                }else {
                    int count = service.addUser(username,password,phone);
                    if(count>0){
                        //3.没有重复用户名，注册成功
                        return new Response(true,"注册成功",1);
                    }else {
                        return new Response(true,"注册失败",-1);
                    }
                }
            }else{
                return new Response(true,"注册失败，请检查用户名、密码、手机号是否为空",-1);
            }
        }
        @RequestMapping(value = "/login",method = RequestMethod.POST)
        public Response login(@RequestBody Map<String, String> person){
            String username = person.get("username");
            int password =Integer.parseInt(person.get("password"));
            //1. 判断用户名、密码是否为空
            if(username != null && password != 0 ){
                List<User> users =  service.queryByUsername(username);
                //2. 判断用户名是否存在
                if(users!=null && users.size()>0){
                    User user = users.get(0);
                    //3. 判断密码是否正确
                    if(password == user.getPassword()){
                        //4. 密码正确，登陆成功
                        return new Response(true,"登陆成功",1);
                    }else {
                        return new Response(false,"登陆失败，密码错误",-1);
                    }
                }else {
                    return new Response(true,"登陆失败，用户名不存在",-1);
                }
            }else {
                return new Response(true,"登陆失败，请检查用户名、密码是否为空",-1);
            }
        }
    }

