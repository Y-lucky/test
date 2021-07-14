package com.cykj.service.impl;

import com.cykj.bean.User;
import com.cykj.mapper.UserMapper;
import com.cykj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper ;
    @Override
    public User selectUser(User user) {
        User us = userMapper.selectUser(user);
        return us;
    }
}
