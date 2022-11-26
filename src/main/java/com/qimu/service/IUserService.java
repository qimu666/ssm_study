package com.qimu.service;

import com.qimu.pojo.User;

import java.util.List;

public interface IUserService {
    List<User> selectAll();

    List<User> dynamicGetAllUser(User user);

    Integer dynamicAddUser(User user);

    Integer dynamicUpdateUserById(User user);

    Integer dynamicDeleteUserById(Integer[] id);

    List<User> findUserAndRole();
}
