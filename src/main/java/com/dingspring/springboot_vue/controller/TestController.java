package com.dingspring.springboot_vue.controller;

import com.dingspring.springboot_vue.domain.Demo;
import com.dingspring.springboot_vue.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author dingding
 * @create 2021-03-27 20:40
 */

@RestController
@RequestMapping("/demo")
public class TestController {
    @Resource
    private DemoService demoService;
    @GetMapping("/list")
    public List<Demo> list(){
        return demoService.list();
    }
}
