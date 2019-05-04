package com.f.controller;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *  在model中填充数据，然后在具体视图中进行展示
 *  还需要在配置文件中配置一个bean，取个名字，用来充当请求的uri
 *  它只能处理一个请求，一般情况下会选择注解开发模式
 *  详情见ByeController
 */


// 实现一个Controller接口的方式
// 如果接口只有一个方法这种接口叫函数式接口
public class HelloController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest,
                                      HttpServletResponse httpServletResponse) throws Exception {

        ModelAndView mav = new ModelAndView();
        mav.addObject("girl", "lily");  // attr 类似传给模板的model参数
        mav.setViewName("girl");  // 类似 view
        return mav;
    }
}
