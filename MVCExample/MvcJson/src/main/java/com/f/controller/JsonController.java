package com.f.controller;


import com.f.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

//@RestController   // controller + response body
@Controller
@RequestMapping("/json")
public class JsonController {

    @RequestMapping("/m1")
    @ResponseBody
    public User m1() {
        User u = new User();
        u.setPassword("loving");
        u.setName("许晴");
        return u;
    }


    @RequestMapping("/m2")
    @ResponseBody
    public Map<String, Object> m2() {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "许晴晴");
        map.put("age", 28);
        return map;
    }

    @RequestMapping("/m3")
    @ResponseBody
    public User[] m3() {
        User u = new User();
        u.setName("joker");
        u.setPassword("123");

        User u2 = new User();
        u2.setName("lily");
        u2.setPassword("321");

        return new User[] {u, u2};
    }


}
