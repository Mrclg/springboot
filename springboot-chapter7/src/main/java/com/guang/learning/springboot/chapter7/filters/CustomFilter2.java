package com.guang.learning.springboot.chapter7.filters;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

//@WebFilter(filterName = "customFilter2", urlPatterns = "/*")
@Slf4j
public class CustomFilter2 implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("filter2 初始化");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("doFilter2 请求处理");

        //对request、response进行一些预处理

        // 比如设置请求编码

        // request.setCharacterEncoding("UTF-8");

        // response.setCharacterEncoding("UTF-8");

        //TODO 进行业务逻辑

        //链路 直接传给下一个过滤器
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        log.info("filter2 销毁");
    }
}
