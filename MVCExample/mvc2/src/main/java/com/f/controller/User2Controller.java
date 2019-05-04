package com.f.controller;

// 测试@ModelAttribute

import com.f.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class User2Controller {

    // 在Controller里面的任意一个处理具体的方法之前都会执行
    @ModelAttribute
    public User init() {
        User u = new User();
        System.out.println("init ......");
        u.setName("lily");
        return u;
    }

    @RequestMapping("/show")
    @ResponseBody
    public String show(Model model) {
        return "in show page...";
    }

}
