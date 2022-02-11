package com.example.endowment.service;

import com.example.endowment.domain.User;
import com.example.endowment.domain.UserExample;
import com.example.endowment.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {
    @Resource
    private UserMapper userMapper;

    public List<User> list(){
        return userMapper.selectByExample(new UserExample());
    }
}
