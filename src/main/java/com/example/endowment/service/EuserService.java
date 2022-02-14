package com.example.endowment.service;

import com.example.endowment.domain.Euser;
import com.example.endowment.domain.EuserExample;
import com.example.endowment.mapper.EuserMapper;
import com.example.endowment.req.EuserQueryReq;
import com.example.endowment.req.EuserSaveReq;
import com.example.endowment.resp.EuserResp;
import com.example.endowment.util.CopyUtil;
import com.example.endowment.util.SnowFlake;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EuserService {
    @Resource
    private EuserMapper euserMapper;

    @Resource
    private SnowFlake snowFlake;

    public List<EuserResp> list(EuserQueryReq req) {
        EuserExample example = new EuserExample();
        EuserExample.Criteria criteria = example.createCriteria();
        if (!ObjectUtils.isEmpty(req.getName())) {
            criteria.andNameLike("%" + req.getName() + "%");
        }
        if (!ObjectUtils.isEmpty(req.getId())) {
            criteria.andIdEqualTo(req.getId());
        }
        if(!ObjectUtils.isEmpty(req.getIdnumber())) {
            criteria.andIdnumberLike("%" + req.getIdnumber() + "%");
        }
        List<Euser> eusers = euserMapper.selectByExample(example);
        List<EuserResp> euserResps = CopyUtil.copyList(eusers, EuserResp.class);
        return euserResps;
    }

    /**
     * 保存参保人员信息
     */
    public void save(EuserSaveReq req) {
        Euser euser = CopyUtil.copy(req, Euser.class);
        euser.setId(snowFlake.nextId());
        euser.setName(req.getName());
        euser.setIdnumber(req.getIdnumber());
        euser.setAddress(req.getAddress());
        euser.setAccount(req.getAccount());
        euser.setDisability(req.getDisability());
        euser.setFamilyplanning(req.getFamilyplanning());
        euser.setPoverty(req.getPoverty());
        euserMapper.insert(euser);
    }
}
