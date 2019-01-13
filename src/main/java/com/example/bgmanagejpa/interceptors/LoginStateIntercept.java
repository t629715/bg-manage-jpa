package com.example.bgmanagejpa.interceptors;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.bgmanagejpa.util.JwtUtil;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author: adminisrator
 * @date: 2019/1/12
 * @description: 根据token进行登陆状态判断
 */
public class LoginStateIntercept extends HandlerInterceptorAdapter {
    public LoginStateIntercept() {
        super();
    }
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,Object handler) throws IOException {
        String token = request.getHeader("token");
        if (StringUtils.isEmpty(token)){
            response.setHeader("Content-type","text/html;charset=UTF-8");
            response.getWriter().write(responseData());
            return false;
        }
        try{
            JwtUtil.decodeToken(token);
        }catch (Exception e){
            response.setHeader("Content-type","text/html;charset=UTF-8");
            response.getWriter().write(responseData());
            return false;
        }
        return true;
    }
    private String responseData(){
        Map map = new ConcurrentHashMap(16);
        map.put("code","1001");
        map.put("msg","登陆过期");
        return JSON.toJSONString(map.toString());

    }
}
