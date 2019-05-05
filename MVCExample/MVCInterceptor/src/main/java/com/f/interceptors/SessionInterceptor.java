package com.f.interceptors;

import com.f.pojo.User;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 会话拦截器
 */

public class SessionInterceptor implements HandlerInterceptor {
    // 检查当前会话是否有user，如果有放行，否则拦截
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object user = request.getSession().getAttribute("SESSION_USER");
        if (user == null) {
            System.out.println("您不具备权限, 请先登录");
            return false;
        }
        if (user instanceof User) {
            // 在去数据库检查其身份对不对, 比如用户名密码都对，但用户冻结了
            User u = (User) user;
            u.setPassword(null);  // 设置为空后，方便存储到session里，这里业务session只存名字
            request.getSession().setAttribute("SESSION_USER", u);
            System.out.println("处于登录状态");
            return true;

        } else {
            System.out.println("您不具备权限, 请先登录");
            return false;
        }

    }
}
