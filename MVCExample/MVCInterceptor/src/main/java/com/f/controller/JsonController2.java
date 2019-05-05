package com.f.controller;


import com.f.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

//@RestController   // controller + response body
@Controller
@RequestMapping("/json")
public class JsonController2 {

    // 前端提交对象过来
    @RequestMapping("/add")
    public String add(@RequestBody User user) {
        System.out.println(user.getName() + " " + user.getPassword());
        return "msg";
    }


}
