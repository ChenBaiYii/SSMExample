package com.f.f;

import com.f.f.mapper.GirlMapper;
import com.f.f.pojo.A;
import com.f.f.pojo.B;
import com.f.f.pojo.Girl;
import com.f.f.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class Test1 {
    @Test
    public void m1() {
        SqlSession sqlSession = MyBatisUtil.getSession();
        GirlMapper mapper = sqlSession.getMapper(GirlMapper.class);
        Girl g = new Girl();
        g.setName("lily");
        g.setFlower("lily");
        g.setBirthday(new Date());

        mapper.insert(g);

        sqlSession.commit();  // 提交
        sqlSession.close();
    }

    @Test
    public void m2() {  // 测试 select
        SqlSession sqlSession = MyBatisUtil.getSession();
        GirlMapper mapper = sqlSession.getMapper(GirlMapper.class);
        Girl girl = mapper.queryById(1L);
        System.out.println("the result name is:" + girl.getName());  // 查询到的数据
        sqlSession.close();

    }

    @Test
    public void m3() {  // 测试 参数传递
        SqlSession sqlSession = MyBatisUtil.getSession();
        GirlMapper mapper = sqlSession.getMapper(GirlMapper.class);
        Girl girl = mapper.queryById2(1L);
        System.out.println("the result name is:" + girl.getName());  // 查询到的数据
        sqlSession.close();

    }

    @Test
    public void m4() {  // 测试query by name
        SqlSession sqlSession = MyBatisUtil.getSession();
        GirlMapper mapper = sqlSession.getMapper(GirlMapper.class);

        // 只要不是主键查询都有可能返回多个值
        Girl girl = mapper.queryByName("lily");
        System.out.println("the flower:" + girl.getFlower());  // 查询到的数据
        sqlSession.close();
    }

    @Test
    public void m5() {  // 测试query by name and flower
        SqlSession sqlSession = MyBatisUtil.getSession();
        GirlMapper mapper = sqlSession.getMapper(GirlMapper.class);

        // 只要不是主键查询都有可能返回多个值
        Girl girl = mapper.queryByNameFlower("lily", "lily");
        System.out.println("query by name and flower:" + girl.getFlower());  // 查询到的数据
        sqlSession.close();
    }

    @Test
    public void m6() {  // 测试javabean
        SqlSession sqlSession = MyBatisUtil.getSession();
        GirlMapper mapper = sqlSession.getMapper(GirlMapper.class);

        Girl g = new Girl();
        g.setName("lily");
        g.setFlower("lily");
        Girl girl = mapper.queryByNameFlower2(g);
        System.out.println("javabean test:" + girl.getFlower());  // 查询到的数据
        sqlSession.close();
    }

    @Test
    public void m7() {  // 测试map
        SqlSession sqlSession = MyBatisUtil.getSession();
        GirlMapper mapper = sqlSession.getMapper(GirlMapper.class);

        Map<String, Object> map = new HashMap<>();

        map.put("name", "lily");
        map.put("flower", "lily");
        Girl girl = mapper.queryByNameFlower3(map);

        System.out.println("map test:" + girl.getName());  // 查询到的数据
        sqlSession.close();
    }

    @Test
    public void m8() {  // 测试多个javabean
        SqlSession sqlSession = MyBatisUtil.getSession();
        GirlMapper mapper = sqlSession.getMapper(GirlMapper.class);

        A a = new A();
        a.setName("lily");

        B b = new B();
        b.setFlower("lily");

        Girl girl = mapper.queryByAB(a, b);

        System.out.println("many javabean:" + girl.getName());  // 查询到的数据
        sqlSession.close();
    }

}
