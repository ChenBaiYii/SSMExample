package com.f.f;

import com.f.f.mapper.AddressesMapper;
import com.f.f.pojo.Addresses;
import com.f.f.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestDynamicSQL {
    // 测试动态sql
    @Test
    public void m1() {
        // 默认开启一级缓存 一级换成是会话级缓存 关闭session后将重新取数据
        // 数据更新后缓存将失效
        SqlSession sqlSession = MyBatisUtil.getSession();
        AddressesMapper mapper = sqlSession.getMapper(AddressesMapper.class);

        List<Addresses> addresses = mapper.queryByCountryCity("san diego", "ca");
        System.out.printf(addresses.toString());

        sqlSession.close();
    }

    @Test
    public void m2() {  // 测试set  ok哒
        SqlSession sqlSession = MyBatisUtil.getSession();
        AddressesMapper mapper = sqlSession.getMapper(AddressesMapper.class);
        Addresses addresses = new Addresses();

        addresses.setAddrId(1);
        addresses.setCity("aa");
        addresses.setCountry("china");
        addresses.setState("guang");
        addresses.setStreet("xxx");
        mapper.update(addresses);  // update 数据

        sqlSession.commit();
        sqlSession.close();
    }


    @Test
    public void m3() {  // 测试 choose
        SqlSession sqlSession = MyBatisUtil.getSession();
        AddressesMapper mapper = sqlSession.getMapper(AddressesMapper.class);

        Addresses addresses = new Addresses();
        addresses.setCountry("san diego");

        List<Addresses> l = mapper.query(addresses);
        System.out.println(l);
        System.out.println("m3 done!");

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void m4() {  // 测试 foreach
        SqlSession sqlSession = MyBatisUtil.getSession();
        AddressesMapper mapper = sqlSession.getMapper(AddressesMapper.class);
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        List<Addresses> addresses = mapper.queryByIds(l);
        System.out.println(addresses);
        System.out.println("m4 done!");

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void m5() {  // 测试 foreach
        SqlSession sqlSession = MyBatisUtil.getSession();
        AddressesMapper mapper = sqlSession.getMapper(AddressesMapper.class);
        List<Addresses> addresses = mapper.queryLike("%g%");

        System.out.println(addresses);
        System.out.println("m5 done!");

        sqlSession.commit();
        sqlSession.close();
    }


}
