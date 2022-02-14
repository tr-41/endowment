package com.example.endowment.controller;

import com.example.endowment.req.EuserQueryReq;
import com.example.endowment.req.EuserSaveReq;
import com.example.endowment.resp.CommonResp;
import com.example.endowment.resp.EuserResp;
import com.example.endowment.service.EuserService;
import org.springframework.web.bind.annotation.RequestBody;
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
    public CommonResp list(EuserQueryReq req){
        CommonResp<List<EuserResp>> resp= new CommonResp<>();
        List<EuserResp> list = euserService.list(req);
        resp.setData(list);
        resp.setMessage("操作成功！");
        return resp;
    }

    @RequestMapping("/create")
    public CommonResp create(@RequestBody EuserSaveReq req){
        CommonResp resp = new CommonResp<>();
        euserService.save(req);
        resp.setMessage("操作成功！");
        return resp;
    }
}
