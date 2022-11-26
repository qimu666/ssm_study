package com.qimu.service.impl;

import com.qimu.mapper.IUserMapper;
import com.qimu.pojo.User;
import com.qimu.service.IUserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class IUserServiceImpl implements IUserService {
    @Autowired
    private IUserMapper iUserMapper;

    @Override
    public List<User> selectAll() {
        return iUserMapper.selectAll();
    }

    public List<User> dynamicGetAllUser(User user) {
        return iUserMapper.dynamicGetAllUser(user);
    }

    public Integer dynamicAddUser(User user) {
        return iUserMapper.dynamicAddUser(user);
    }

    public Integer dynamicUpdateUserById(User user) {
        return iUserMapper.dynamicUpdateUserById(user);
    }

    public Integer dynamicDeleteUserById(Integer[] id) {
        return iUserMapper.dynamicDeleteUserById(id);
    }

    public List<User> findUserAndRole(){
        return iUserMapper.findUserAndRole();
    }
}
