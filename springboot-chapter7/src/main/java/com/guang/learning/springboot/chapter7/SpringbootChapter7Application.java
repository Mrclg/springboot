package com.guang.learning.springboot.chapter7;

import com.guang.learning.springboot.chapter7.filters.CustomFilter;
import com.guang.learning.springboot.chapter7.filters.CustomFilter2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;

import javax.servlet.Filter;

@SpringBootApplication
@ServletComponentScan
public class SpringbootChapter7Application {

//    @Bean
//    public FilterRegistrationBean filterRegistrationBean() {
//
//        FilterRegistrationBean registration = new FilterRegistrationBean();
//
//        //当过滤器有注入其他bean类时，可直接通过@bean的方式进行实体类过滤器，这样不可自动注入过滤器使用的其他bean类。
//        //当然，若无其他bean需要获取时，可直接new CustomFilter()，也可使用getBean的方式。
//        registration.setFilter(customFilter());
//
//        //过滤器名称
//        registration.setName("customFilter");
//
//        //拦截路径
//        registration.addUrlPatterns("/*");
//
//        //设置顺序
//        registration.setOrder(10);
//
//        return registration;
//
//    }
//
//    @Bean
//    public Filter customFilter() {
//        return new CustomFilter();
//    }
//
//    @Bean
//    public FilterRegistrationBean filterRegistrationBean2() {
//
//        FilterRegistrationBean registration = new FilterRegistrationBean();
//
//        //当过滤器有注入其他bean类时，可直接通过@bean的方式进行实体类过滤器，这样不可自动注入过滤器使用的其他bean类。
//        //当然，若无其他bean需要获取时，可直接new CustomFilter()，也可使用getBean的方式。
//        registration.setFilter(customFilter2());
//
//        //过滤器名称
//        registration.setName("customFilter2");
//
//        //拦截路径
//        registration.addUrlPatterns("/*");
//
//        //设置顺序
//        registration.setOrder(1);
//
//        return registration;
//
//    }
//
//    @Bean
//    public Filter customFilter2() {
//        return new CustomFilter2();
//    }

	public static void main(String[] args) {
		SpringApplication.run(SpringbootChapter7Application.class, args);
	}

}
