package com.wechart.service;

import com.wechart.entity.User;
import java.util.List;

public interface UserService {


    //根据id查询信息

    /**
     * <p>Title: findUserById</p>
     * <p>Description: </p>
     *
     * @param id 查询用户的id
     * @return
     * @throws Exception
     */
    List<User> findUserById(Integer id) throws Exception;

    //修改用户信息

    /**
     * <p>Title: updateUser</p>
     * <p>Description: </p>
     *
     * @param id 修改用户的id
     * @param User  修改的用户信息
     * @throws Exception
     */
    void updateUser(Integer id, User user) throws Exception;

}
