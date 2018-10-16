package com.guang.learning.springboot.chapter1.controller;

import com.guang.learning.springboot.chapter1.config.Config;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//@RestController = @Controller + @ResponseBody 默认直接返回json
@RestController
@Slf4j
public class DemoController {

    @Autowired
    private Config config;

    @RequestMapping(value = "/demo", method = RequestMethod.GET)
    public String demo() {
        log.info("config={}", config.toString());
        return "hello,SpringBoot!";

    }

}
