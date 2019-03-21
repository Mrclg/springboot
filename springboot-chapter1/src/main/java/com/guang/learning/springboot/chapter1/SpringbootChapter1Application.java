package com.guang.learning.springboot.chapter1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
@Slf4j
public class SpringbootChapter1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootChapter1Application.class, args);
	}

}
