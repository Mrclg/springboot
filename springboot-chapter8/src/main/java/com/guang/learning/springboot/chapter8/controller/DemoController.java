package com.guang.learning.springboot.chapter8.controller;

import com.guang.learning.springboot.chapter8.utils.ValidatorUtil;
import com.guang.learning.springboot.chapter8.vo.DemoRequestVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@Slf4j
public class DemoController {


    /**
     * 使用@valid进行参数校验(application/x-www-form-urlencoded, 参数校验异常处理类：BindException)
     * @param req
     * @return
     */
    @PostMapping("/demo/valid")
    public String demoValid(@Valid DemoRequestVo req) {

        return req.getCode() + "," + req.getName();

    }
    /**
     * 使用@valid进行参数校验(application/json, 参数校验异常处理类：MethodArgumentNotValidException)
     * @param req
     * @return
     */
    @PostMapping("/demo/valid2")
    public String demoValid2(@Valid @RequestBody DemoRequestVo req) {

        return req.getCode() + "," + req.getName();

    }

    /**
     * 不使用@valid的情况
     * @param req
     * @return
     */
    @PostMapping("/demo/valid3")
    public String demoValid3(@RequestBody DemoRequestVo req) {

        //手动校验
        ValidatorUtil.validate(req);

        return req.getCode() + "," + req.getName();

    }

}
