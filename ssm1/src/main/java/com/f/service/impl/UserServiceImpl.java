package com.f.service.impl;

import com.f.mapper.UserMapper;
import com.f.pojo.User;
import com.f.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// 标记为一个组件
@Service("userService")
public class UserServiceImpl implements UserService {

    // 注入mapper
    @Autowired
    private UserMapper userMapper;

    @Override
    public User get(User user) {

        User u1 = userMapper.select(user);
        return u1;
    }
}
