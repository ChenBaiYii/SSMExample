package com.f.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/cookie")
public class CookieController {

    @RequestMapping("/c1")
    @ResponseBody
    public String c(@CookieValue("JSESSIONID") String jsessionid) {
        System.out.println(jsessionid);
        return "msg";
    }
}
