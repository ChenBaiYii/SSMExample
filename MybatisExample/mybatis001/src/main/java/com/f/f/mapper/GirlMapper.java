package com.f.f.mapper;

import com.f.f.pojo.A;
import com.f.f.pojo.B;
import com.f.f.pojo.Girl;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

public interface GirlMapper {

    int insert(Girl girl);

    Girl queryById(Long id);  // 这里写的东西都要到GirlMapper.xml 中去实现

    Girl queryById2(long id);  // 重载基本数据类型

    Girl queryByName(String name);

    /**
     * 这样写之后GirlMapper.xml 里就可以直接使用 name flower 参数名了
     *
     * @param name
     * @param flower
     * @return
     */
    Girl queryByNameFlower(@Param("name") String name, @Param("flower") String flower);

    // 使用javabean javabean使用属性名引用，名字不能乱写
    Girl queryByNameFlower2(Girl girl);

    // map 用法
    Girl queryByNameFlower3(Map<String, Object> map);

    // 多个javabean

    /**
     * @param a
     * @param b
     * @return
     */
    Girl queryByAB(@Param("a") A a, @Param("b") B b);

}
