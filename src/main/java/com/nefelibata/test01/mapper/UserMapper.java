package com.nefelibata.test01.mapper;

import com.nefelibata.test01.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserMapper {
    int addUser(User user);
    List<User> queryByUsername(String username);
}
