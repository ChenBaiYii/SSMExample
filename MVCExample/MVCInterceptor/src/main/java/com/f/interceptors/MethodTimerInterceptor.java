package com.f.interceptors;

/**
 * spring mvc 提供了拦截器，它将在请求具体处理之前做检查，有权决定接下来是否继续，
 * 也可以对请求进行加工。拦截器可以设计多个
 */


// 方法耗时统计拦截器

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 拦截器顺序
 * 如果有n个拦截器，并且都能拦截到某个url的时候，配置在前面的优先
 * i1 i2 i3
 * 前置 i1 i2 i3
 * 后置 i3 i2 i1
 */


// 通过实现拦截器接口, 然后去springmvc配置文件中去配置
public class MethodTimerInterceptor implements HandlerInterceptor {
    @Override  // 前置处理
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 1.定义开始时间
        long start = System.currentTimeMillis();
        // 2.将其存储到请求域当中
        request.setAttribute("start", start);
        return true;  // 设置为true，否则无法通过
        // 寻找下一个拦截器, 如果没有拦截器则去 Controller
    }

    @Override  // 后置处理
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        // 1.取出start
        long start = (long) request.getAttribute("start");
        // 2.得到end时间
        long end = System.currentTimeMillis();
        // 3.记录一下耗时
        long spendTime = end - start;

        if (spendTime > 1000) {
            System.out.println("方法耗时严重, 耗时:" + spendTime + " 毫秒");
        } else {
            System.out.println("方法耗时: " + spendTime + " 毫秒");
        }


    }

    @Override  // 完成处理
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
