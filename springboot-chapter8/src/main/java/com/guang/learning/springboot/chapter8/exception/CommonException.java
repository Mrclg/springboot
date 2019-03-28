package com.guang.learning.springboot.chapter8.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 自定义异常
 */
@AllArgsConstructor
@Data
public class CommonException extends RuntimeException {

    private int code;

    private String msg;

}
