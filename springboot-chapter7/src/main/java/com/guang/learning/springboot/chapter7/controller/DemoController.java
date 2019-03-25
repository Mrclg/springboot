package com.guang.learning.springboot.chapter7.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class DemoController {

    @GetMapping("/test")
    public String test(){
        log.info("test invoke .");

        return "hello, world";
    }

}
