package com.f.f.mapper;

import com.f.f.pojo.UserBlog;
import com.f.f.pojo.UserWithDetail;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    UserWithDetail queryById(@Param("id") Integer id);

    UserBlog queryByIdWithBlog(@Param("id") Integer id);

}
