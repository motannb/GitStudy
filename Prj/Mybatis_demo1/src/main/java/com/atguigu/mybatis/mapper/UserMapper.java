package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    int insertUser();

    User checkLoginByParam(@Param("username") String username, @Param("password") String password);

    void updateUser();

    void deleteUser();

    User getUserById();

    List<User> getAllUser();
}
