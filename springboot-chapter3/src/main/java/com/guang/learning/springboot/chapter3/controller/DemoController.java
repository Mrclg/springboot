package com.guang.learning.springboot.chapter3.controller;

import com.guang.learning.springboot.chapter3.config.Config;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class DemoController {

    @Value("${blog.address}")
    private String address;

    @Value("${blog.author}")
    private String author;

    @Value("${blog.desc}")
    private String desc;

    @Value("${blog.value}")
    private String value;

    @Value("${blog.number}")
    private int number;

    @Value("${blog.bignumber}")
    private long bignumber;

    @Value("${blog.test1}")
    private int test1;

    @Value("${blog.test2}")
    private int test2;

    @Autowired
    private Config config;

    @RequestMapping("/")
    public Config test(){
        log.info("address={}", address);
        log.info("author={}", author);
        log.info("desc={}", desc);
        log.info("value={}", value);
        log.info("number={}", number);
        log.info("bignumber={}", bignumber);
        log.info("test1={}", test1);
        log.info("test2={}", test2);

        return config;
    }

}
