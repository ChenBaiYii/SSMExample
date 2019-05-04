package com.f.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/baby")
public class BabyController {
    @RequestMapping("/hello")
    public String greeting() {
        System.out.println("baby hello");
        return "forward";
    }
}
