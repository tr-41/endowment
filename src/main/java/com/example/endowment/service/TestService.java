package com.example.endowment.service;

import com.example.endowment.domain.Test;
import com.example.endowment.domain.TestExample;
import com.example.endowment.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestService {
    @Resource
    private TestMapper testMapper;

    public List<Test> list(){
        return testMapper.selectByExample(new TestExample());
    }
}
