package com.guang.learning.springboot.chapter1.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ConfigurationProperties(prefix = "config")
@Data
public class Config {

    String code;

    String name;

    List<String> hobby;
}
