package com.example.endowment.service;

import com.example.endowment.domain.Euser;
import com.example.endowment.domain.EuserExample;
import com.example.endowment.mapper.EuserMapper;
import com.example.endowment.req.EuserReq;
import com.example.endowment.resp.EuserResp;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class EuserService {
    @Resource
    private EuserMapper euserMapper;

    public List<EuserResp> list(EuserReq req) {
        EuserExample example = new EuserExample();
        EuserExample.Criteria criteria = example.createCriteria();
        criteria.andNameLike("%" + req.getName() + "%");
        List<Euser> eusers = euserMapper.selectByExample(example);
        List<EuserResp> list=new ArrayList<>();
        for(Euser euser:eusers){
            EuserResp euserResp=new EuserResp();
            BeanUtils.copyProperties(euser,euserResp);
            list.add(euserResp);
        }
        return list;
    }
}
