package com.example.endowment.controller;

import com.example.endowment.domain.Test;
import com.example.endowment.service.TestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TestController {
    @Resource
    private TestService testService;
    @RequestMapping("/hello")
    public List<Test> hello(){
        return testService.list();
    }
}
