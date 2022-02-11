package com.example.endowment.controller;

import com.example.endowment.domain.Euser;
import com.example.endowment.req.EuserReq;
import com.example.endowment.resp.CommonResp;
import com.example.endowment.resp.EuserResp;
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
    public CommonResp list(EuserReq req){
        CommonResp<List<EuserResp>> resp= new CommonResp<>();
        List<EuserResp> list = euserService.list(req);
        resp.setContent(list);
        return resp;
    }
}
