package com.wechart.mapper;

import com.wechart.entity.User;

import java.util.List;

public interface UserMapper {
    public User newUser(User user);
    //public boolean delUser(int id);
    public User updateUser(User user);
    public int queryUserById(int id);
    //public List<User> listAllUser();
    //public List<User> queryUserByName(String name);
}
