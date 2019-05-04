package com.f.mapper;

import com.f.pojo.User;
import org.springframework.stereotype.Repository;


public interface UserMapper {
    User select(User user);

}
