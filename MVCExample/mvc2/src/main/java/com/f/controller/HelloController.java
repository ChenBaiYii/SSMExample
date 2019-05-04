package com.f.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 请求转发与重定向
 */


@Controller
@RequestMapping("/hello")
public class HelloController {

    // 转发
    @RequestMapping("/forward")
    public String forward(Model model) {
        // spring mvc 默认在请求域当中存储值
        System.out.println("准备转发");
        model.addAttribute("skill", "sleep");
        // 默认的选项就是转发
        return "forward";
    }

    // 这个是重定向
    @RequestMapping("/redirect")
    public String redirect() {
        System.out.println("准备重定向");
        // 不带/的写法是相对路径
//        return "redirect:redirect";
        // 如果是重定向则与视图解析的规则无关
        return "redirect:/jsp/redirect.jsp";
    }

    @RequestMapping("/jump")
    public String forwardAnotherController() {
        // 转发到另外一个控制器下
        return "forward:/baby/hello";
    }





}
