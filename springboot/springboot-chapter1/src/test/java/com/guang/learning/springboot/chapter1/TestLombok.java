package com.guang.learning.springboot.chapter1;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 测试 lombok
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class TestLombok {

    @Test
    public void testLog(){
        TestBean testBean = new TestBean("guang", 123);
        log.error("Something else is wrong here . testBean={}", testBean.toString());
    }

}
