package com.guang.learning.springboot.chapter1.controller;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

//@RestController = @Controller + @ResponseBody 默认直接返回json
//是Spring4之后加入的注解，原来在@Controller中返回json需要@ResponseBody来配合，
//如果直接用@RestController替代@Controller就不需要再配置@ResponseBody，默认返回json格式。
@RestController
@Slf4j
public class DemoController {

    /**
     * @GetMapping 等同于 @RequestMapping(method = RequestMethod.GET)
     * @PostMapping 等同于 @RequestMapping(method = RequestMethod.POST)
     * @return
     */
    @GetMapping(value = "/demoGetMapping")
    public String demoGetMapping(){
        return "hello,GetMapping!";
    }
    @RequestMapping(value = "/demoRequestMapping", method = RequestMethod.GET)
    public String demoRequestMapping() {
        return "hello,RequestMapping!";
    }



    /**
     * post请求
     * Content-Type=application/json
     * @param jsonObject
     * @return
     */
    @PostMapping(value = "/demoRequestBody")
    public String demoRequestBody(@RequestBody JSONObject jsonObject){
        return jsonObject.toString();
    }

    /**
     * get/post请求
     * Content-Type=application/x-www-form-urlencoded
     * @param map
     * @return
     */
    @RequestMapping(value = "/demoRequestBody2")
    public String demoRequestBody2(@RequestBody MultiValueMap map){
        return map.toString();
    }


    @GetMapping(value = "/demoPathVariable/{param}")
    public String demoPathVariable(@PathVariable("param") String param){
        return param;
    }

    @GetMapping(value = "/demoRequestParam")
    public String demoRequestParam(@RequestParam("param") String param){
        return param;
    }

    /**
     * @RequestAttribute用于访问由过滤器或拦截器创建的、预先存在的请求属性，效果等同与request.getAttrbute().
     * @param attr
     * @return
     */
    @GetMapping(value = "/demoRequestAttribute")
    public String demoRequestAttribute(@RequestAttribute("attr") String attr){
        return attr;
    }


}
