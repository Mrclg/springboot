package com.guang.learning.springboot.chapter1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource(value="classpath:my.properties",encoding="utf-8")
public class SpringbootChapter1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootChapter1Application.class, args);
	}
}
