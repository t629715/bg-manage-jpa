package com.example.bgmanagejpa.interceptors;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author: adminisrator
 * @date: 2019/1/12
 * @description: 处理跨域拦截器
 */
public class CorsIntercept extends HandlerInterceptorAdapter {
    public CorsIntercept() {
        super();
    }
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
                             Object handler){
        response.setHeader("Access-Control-Allow-Origin",request.getHeader("Origin"));
        response.setHeader("Access-Control-Allow-Credentials", "true");
        response.setHeader("Access-Control-Allow-Methods", "*");
        response.setHeader("Access-Control-Allow-Headers", "token,Content-Type,sign,device");
        response.setHeader("Access-Control-Expose-Headers", "*");
        return true;
    }
}
