package com.example.endowment.controller;

import com.example.endowment.domain.Euser;
import com.example.endowment.service.EuserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/euser")
public class EuserController {
    @Resource
    private EuserService euserService;
    @RequestMapping("/list")
    public List<Euser> hello(){
        return euserService.list();
    }
}
