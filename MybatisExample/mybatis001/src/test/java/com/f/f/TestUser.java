package com.f.f;

import com.f.f.mapper.UserMapper;
import com.f.f.pojo.UserBlog;
import com.f.f.pojo.UserWithDetail;
import com.f.f.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class TestUser {
    @Test
    public void m1() {
        SqlSession sqlSession = MyBatisUtil.getSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        UserWithDetail userWithDetail =  mapper.queryById(1);

        System.out.println(userWithDetail);

        sqlSession.close();
    }



    @Test
    public void m2() {  // 测试多对多封装返回数据结果
        SqlSession sqlSession = MyBatisUtil.getSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        UserBlog userBlog =  mapper.queryByIdWithBlog(1);

        System.out.println("USER:\n"+ userBlog + "\nBLOG:\n" + userBlog.getBlog() + "COMMENT:\n");

        sqlSession.close();
    }



}
