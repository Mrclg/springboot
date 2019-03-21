package com.guang.learning.springboot.chapter1.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class FilterRegistration {

    @Bean
    public FilterRegistrationBean filterRegistrationBean() {

        FilterRegistrationBean registration = new FilterRegistrationBean();

        //当过滤器有注入其他bean类时，可直接通过@bean的方式进行实体类过滤器，这样不可自动注入过滤器使用的其他bean类。
        //当然，若无其他bean需要获取时，可直接new CustomFilter()，也可使用getBean的方式。
        registration.setFilter(new CustomFilter());

        //过滤器名称
        registration.setName("customFilter");

        //拦截路径
        registration.addUrlPatterns("/*");

        //设置顺序
        registration.setOrder(10);

        return registration;

    }

    @Bean
    public FilterRegistrationBean filterRegistrationBean2() {

        FilterRegistrationBean registration = new FilterRegistrationBean();

        //当过滤器有注入其他bean类时，可直接通过@bean的方式进行实体类过滤器，这样不可自动注入过滤器使用的其他bean类。
        //当然，若无其他bean需要获取时，可直接new CustomFilter()，也可使用getBean的方式。
        registration.setFilter(new CustomFilter2());

        //过滤器名称
        registration.setName("customFilter2");

        //拦截路径
        registration.addUrlPatterns("/*");

        //设置顺序
        registration.setOrder(1);

        return registration;

    }

}
