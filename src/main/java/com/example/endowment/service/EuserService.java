package com.example.endowment.service;

import com.example.endowment.domain.Euser;
import com.example.endowment.domain.EuserExample;
import com.example.endowment.mapper.EuserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EuserService {
    @Resource
    private EuserMapper euserMapper;

    public List<Euser> list(){
        return euserMapper.selectByExample(new EuserExample());
    }
}
