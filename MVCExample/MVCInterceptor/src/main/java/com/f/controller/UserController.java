package com.f.controller;


import com.f.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/login")
    public String login(User user, HttpSession session) {
        System.out.println("login.....");
        // 数据库检查

        session.setAttribute("SESSION_USER", user);

        // 登录成功将用户存储到会话里面

        return "user";
    }

    @RequestMapping("/delete")
    public String delete() {
        System.out.println("delete...");

        return "user";
    }


}
