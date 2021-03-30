package com.dingspring.springboot_vue.service;

import com.dingspring.springboot_vue.domain.Demo;
import com.dingspring.springboot_vue.mapper.DemoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author dingding
 * @create 2021-03-30 23:06
 */

@Service
public class DemoService {
    @Resource
    private DemoMapper demoMapper;
    public List<Demo> list(){
        return demoMapper.selectByExample(null);
    }
}
