package com.dingspring.springboot_vue.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dingding
 * @create 2021-03-27 20:40
 */

@RestController
public class TestController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello Word";
    }
}
