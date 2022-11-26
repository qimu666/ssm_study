package com.qimu.mapper;

import com.qimu.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IUserMapper {
    /**
     * 查询所有用户信息
     *
     * @return
     */
    List<User> selectAll();

    /**
     * 动态获取用户信息
     *
     * @param user
     * @return
     */
    List<User> dynamicGetAllUser(User user);

    /**
     * 动态添加用户信息
     *
     * @param user
     * @return
     */
    Integer dynamicAddUser(User user);

    /**
     * 通过id动态修改用户信息
     *
     * @param user
     * @return
     */
    Integer dynamicUpdateUserById(User user);

    /**
     * 通过id动态删除用户信息
     *
     * @param id
     * @return
     */
    Integer dynamicDeleteUserById(@Param("id") Integer[] id);

    /**
     * 查找用户和角色
     *
     * @return
     */
    List<User> findUserAndRole();
}
