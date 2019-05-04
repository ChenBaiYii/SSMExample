package com.f.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


/** web对象可以同过模拟的对象完成操作
 *  也可以通过原生ServletAPI完成
 */

@Controller
@RequestMapping("/web")
public class WebElementController {

    // 模拟请求
    @RequestMapping("/request")
    public String request(WebRequest r) {
        String girl = r.getParameter("girl");
        System.out.println("parameter get girl name is : " + girl);
        return "forward";
    }

    // 真实request
    @RequestMapping("/realRequest")
    public String realRequest(HttpServletRequest r) {
        System.out.println("girl name: " + r.getParameter("girl"));
        return "forward";
    }
    @RequestMapping("session")
    public String requestSession(HttpSession session) {
        session.setAttribute("g", "jinja");
        session.getServletContext().setAttribute("ctx", "in the servlet context");
        return "redirect:/jsp/redirect.jsp";
    }

    //---------------- 以下为注解详解示例部分 ---------------------

    /**
     * @RequestMapping(value={"/m1", "/m2"})  value可以传入多个值
     * method 指定接受的http方法
     * params 可以去指定参数, 还可以限定参数的特征, 要求等于某个值
     * headers 可以限定headers
     * consumes 消费者 媒体类型
     * produces 生产者 产生响应的类型
     */
    @RequestMapping(value = {"/m1", "/m2"}, method = RequestMethod.GET)
    public String m1() {
        System.out.println("in m1 function!");
        return "forward";
    }


    /** ant 风格写法
     *  . 任意一个字符 非/
     *  * 零个或任意多个字符 非/
     *  ** 支持/层路径 /必须紧跟m2
     */
    @RequestMapping(value = {"/m2?"})
    public String m2() {
        System.out.println("in m1 function!");
        return "forward";
    }


    /** 对于非 get post 的请求需要额外添加过滤器到 web.xml,
     *  然后在form表单里添加隐藏属性
     *
     */
    @DeleteMapping(path = {"/delete"})
    public String m5() {
        System.out.println("delete request");
        return "forward";
    }


}
