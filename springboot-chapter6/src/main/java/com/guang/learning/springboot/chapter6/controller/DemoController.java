package com.guang.learning.springboot.chapter6.controller;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class DemoController {

    @GetMapping("/param")
    public String requestParam(@RequestParam("id") String id){
        return "id="+id;
    }

    @GetMapping("/path/{id}")
    public String pathVariable(@PathVariable("id") String id){
        return "id="+id;
    }

    @GetMapping("/req/attr")
    public String reqAttr(@RequestAttribute("id") String id){
        return "id="+id;
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

}
