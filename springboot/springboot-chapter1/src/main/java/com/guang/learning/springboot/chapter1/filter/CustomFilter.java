package com.guang.learning.springboot.chapter1.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

//@WebFilter(filterName="customFilter",urlPatterns={"/*"})
@Slf4j
//@Order(value = 10)
public class CustomFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("CustomFilter init .");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("CustomFilter doFilter .");

        //对request、response进行一些预处理

        // 比如设置请求编码

        servletRequest.setCharacterEncoding("UTF-8");

        servletResponse.setCharacterEncoding("UTF-8");

        //TODO 进行业务逻辑

        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        log.info("CustomFilter destroy .");
    }
}
