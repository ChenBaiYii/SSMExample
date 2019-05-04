package com.f.f.mapper;

import com.f.f.pojo.Addresses;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface AddressesMapper {

    Addresses queryById(Integer id);

    /**
     * 返回一个 addresses 数组
     *
     * @param counter
     * @param city
     * @return
     */
    List<Addresses> queryByCountryCity(@Param("country") String counter, @Param("city") String city);

    int update(Addresses addresses);

    List<Addresses> query(Addresses addresses);

    List<Addresses> queryByIds(List<Integer> list);

    List<Addresses> queryLike(@Param("city") String city);   // 模糊查询测试


}
