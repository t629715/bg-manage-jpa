package com.example.bgmanagejpa.interceptors;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


/**
 * 注册拦截器链
 * @author tt
 */
@Configuration
public class SpringWebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(corsIntercept()).addPathPatterns("/**");
        registry.addInterceptor(loginStateIntercept()).addPathPatterns("/**");
    }
    @Bean
    public CorsIntercept corsIntercept() {
        return new CorsIntercept();
    }
    @Bean
    public LoginStateIntercept loginStateIntercept() {
        return new LoginStateIntercept();
    }
}
