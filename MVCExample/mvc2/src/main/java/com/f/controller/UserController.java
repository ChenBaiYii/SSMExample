package com.f.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {


    @PutMapping("/put")
    @ResponseBody  // 返回数据不返回页面
//    public Map<String, String> put(@PathVariable("name") String name) {
    public String put(String name) {
        // 此处可以用pojo传递 put(User user) {...}

        System.out.println("in hello controller....");
        System.out.println(name);

//        Map<String, String> map = new HashMap<>();
//        map.put("msg", "ok");
//        return map;
        return "this ok";
    }
}
