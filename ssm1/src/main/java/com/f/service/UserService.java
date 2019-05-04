package com.f.service;

import com.f.pojo.User;

public interface UserService {

    /**
     * 根据user信息去检查数据库是否存在该用户
     * @param user
     * @return
     */
    User get(User user);
}
