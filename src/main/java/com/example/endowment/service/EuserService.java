package com.example.endowment.service;

import com.example.endowment.domain.Euser;
import com.example.endowment.domain.EuserExample;
import com.example.endowment.mapper.EuserMapper;
import com.example.endowment.req.EuserQueryReq;
import com.example.endowment.req.EuserSaveReq;
import com.example.endowment.resp.EuserResp;
import com.example.endowment.resp.PageResp;
import com.example.endowment.util.CopyUtil;
import com.example.endowment.util.SnowFlake;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private static final Logger LOG = LoggerFactory.getLogger(EuserService.class);

    /**
     * 分页查询参保人员信息
     */
    public PageResp<EuserResp> list(EuserQueryReq req) {
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
        PageHelper.startPage(req.getPage(), req.getLimit());
        List<Euser> eusers = euserMapper.selectByExample(example);

        PageInfo<Euser> pageInfo = new PageInfo<>(eusers);
        LOG.info("总行数:{}",pageInfo.getTotal());
        LOG.info("总页数:{}",pageInfo.getPages());

        PageResp<EuserResp> pageResp = new PageResp();
        List<EuserResp> euserResps = CopyUtil.copyList(eusers, EuserResp.class);
        pageResp.setTotal(pageInfo.getTotal());
        pageResp.setItems(euserResps);
        return pageResp;
    }

    /**
     * 保存参保人员信息
     */
    public int save(EuserSaveReq req) {
        Euser euser = CopyUtil.copy(req, Euser.class);
        euser.setId(req.getId());
        euser.setName(req.getName());
        euser.setIdnumber(req.getIdnumber());
        euser.setAddress(req.getAddress());
        euser.setAccount(req.getAccount());
        euser.setDisability(req.getDisability());
        euser.setFamilyplanning(req.getFamilyplanning());
        euser.setPoverty(req.getPoverty());
        int result = euserMapper.insert(euser);
        return result;
    }

    /**
     * 编辑参保人员信息
     */
    public int update(EuserSaveReq req) {
        Euser euser = CopyUtil.copy(req, Euser.class);
        int result = euserMapper.updateByPrimaryKey(euser);
        return result;
    }

    /**
     * 删除参保人员信息
     */
    public int delete(EuserSaveReq req) {
        int result = euserMapper.deleteByPrimaryKey(req.getId());
        return result;
    }
}
