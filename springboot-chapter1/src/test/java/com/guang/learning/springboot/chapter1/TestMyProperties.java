package com.guang.learning.springboot.chapter1;

import com.guang.learning.springboot.chapter1.config.Config;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 测试自定义配置文件 my.properties
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
@PropertySource(value="classpath:my.properties",encoding="utf-8")
public class TestMyProperties {

    @Autowired
    private Config config;

    @Test
    public void test(){
        log.info("autoValue={}", config.toString());
    }

}
