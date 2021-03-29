package com.dingspring.springboot_vue.service;

import com.dingspring.springboot_vue.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author dingding
 * @create 2021-03-29 23:19
 */

@Service
public class testServer {
    @Resource
    private TestMapper testMapper;
    public List<Test> list(){
        return testMapper.list();
    }
}
