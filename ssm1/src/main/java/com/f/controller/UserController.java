package com.f.controller;


import com.f.pojo.User;
import com.f.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {

    // 自动注入UserService
    @Autowired
    private UserService userService;


    @RequestMapping("/login")
    @ResponseBody
    public String login(User user, HttpSession session) {
        user = userService.get(user);
        if (user != null) {
            session.setAttribute("SESSION_USER", user);
            return "user";
        } else {
            return "redirect:/login.jps";
        }
    }


}
