package com.guang.learning.springboot.chapter5.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.annotation.PostConstruct;

@Profile("dev") //支持数组:@Profile({"dev","test"})
@Configuration
@Slf4j
public class ProfileBean {

    @PostConstruct
    public void init() {

        log.info("dev环境下激活");

    }

}
