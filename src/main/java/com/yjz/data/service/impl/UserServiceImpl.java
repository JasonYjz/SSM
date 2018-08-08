package com.yjz.data.service.impl;

import com.yjz.data.dao.IUserDao;
import com.yjz.data.pojo.User;
import com.yjz.data.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements IUserService {
    @Resource
    private IUserDao userDao;

//    @Override
//    public User getUserById(int userId) {
//        // TODO Auto-generated method stub
//        return this.userDao.selectByPrimaryKey(userId);
//    }


    public User getUserById(int userId) {
        return this.userDao.selectByPrimaryKey(userId);
    }
}
