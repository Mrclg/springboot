package com.guang.learning.springboot.chapter3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource(value="classpath:my.properties",encoding="utf-8")
public class SpringbootChapter3Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootChapter3Application.class, args);
	}

}
