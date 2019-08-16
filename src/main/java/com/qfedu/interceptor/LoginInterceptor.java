package com.qfedu.interceptor;

import com.qfedu.pojo.User;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String requestURI = request.getRequestURI();
        User user = (User) request.getSession().getAttribute(StrUtils.LOGIN_USER);
        if(user == null){
            /*
               说明还没有登陆，需要跳转到登陆页面使用jqery中方法发送ajax请求，会有一个特殊的请求头
             */
            String value = request.getHeader("X-Requested-With");
            /*
               XMLHttpRequest 说明是ajax请求
             */
            if("XMLHttpRequest".equals(value)){
                response.getWriter().write("{\"code\":0, \"info\":\"未登陆\"}");
            }else {
                /*
                   非ajax请求，直接重定向到登陆页面
                 */
                response.sendRedirect(request.getContextPath() + "/login.html");
            }
            return false;
        }else{
            return true;
        }
    }
}
