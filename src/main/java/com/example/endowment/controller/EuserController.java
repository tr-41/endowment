package com.example.endowment.controller;

import com.example.endowment.domain.Euser;
import com.example.endowment.req.EuserQueryReq;
import com.example.endowment.req.EuserSaveReq;
import com.example.endowment.resp.CommonResp;
import com.example.endowment.resp.EuserResp;
import com.example.endowment.resp.PageResp;
import com.example.endowment.service.EuserService;
import com.example.endowment.util.CopyUtil;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/euser")
public class EuserController {
    @Resource
    private EuserService euserService;

    @RequestMapping("/list")
    public CommonResp list(EuserQueryReq req){
        CommonResp<PageResp<EuserResp>> resp= new CommonResp<>();
        PageResp<EuserResp> pageResp = euserService.list(req);
        resp.setData(pageResp);
        resp.setMessage("操作成功！");
        return resp;
    }

    @RequestMapping("/create")
    public CommonResp create(@RequestBody EuserSaveReq req){
        CommonResp resp = new CommonResp<>();
        int result = euserService.save(req);
        if(result > 0) {
            resp.setMessage("success！");
        }
        return resp;
    }

    @RequestMapping("/update")
    public CommonResp update(@RequestBody EuserSaveReq req){
        CommonResp resp = new CommonResp<>();
        int result = euserService.update(req);
        if(result > 0) {
            resp.setMessage("success！");
        }
        return resp;
    }

    @RequestMapping("/delete")
    public CommonResp delete(@RequestBody EuserSaveReq req) {
        CommonResp resp = new CommonResp<>();
        int result = euserService.delete(req);
        if(result > 0) {
            resp.setMessage("success！");
        }
        return resp;
    }
}
