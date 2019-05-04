package com.f.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/** 注解模式的开发步骤
 *  1.配置基础扫描包，注解才会生效
 *  2.在指定的类上面添加@Controller注解
 *  3.添加@RequestMapping('bye'), 此处即是uri some/bye
 *      RequestMapping可以写在类上也可以写在方法上，推荐写类上
 */



// 不需要继承任何类和实现任何接口
@Controller
public class ByeController {

    @RequestMapping("/byex")
    public String bye(Model model) {
        model.addAttribute("model", "modeller");

        // 此处的返回值就是视图的名称
        // 将会到 prefix/去寻找 bye.suffix文件
        return "bye";

    }

    @RequestMapping("/goodBye")
    public String goodBye(Model model) {
        model.addAttribute("line", "看夜樱长空雪满裘，流年独走辗转春秋，待到陈酿都尝够，浅埋一坛青梅沽酒。");
        return "bye";
    }


}
