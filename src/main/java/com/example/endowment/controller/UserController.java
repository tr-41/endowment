package com.example.endowment.controller;

import com.example.endowment.domain.User;
import com.example.endowment.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {
    @Resource
    private UserService userService;
    @RequestMapping("/hello")
    public List<User> hello(){
        return userService.list();
    }
}
