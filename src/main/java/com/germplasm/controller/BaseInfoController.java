package com.germplasm.controller;

import com.germplasm.common.PageUtil;
import com.germplasm.common.Result;
import com.germplasm.service.BaseInfoService;
import netscape.javascript.JSObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author scx
 * @date 2018/1/21 11:20
 */
@RestController
@RequestMapping(value = "/baseInfo")
public class BaseInfoController {

    @Autowired
    private BaseInfoService baseInfoService;

    @RequestMapping(value = "/baseInfoList",method = RequestMethod.GET)
    public Map findAllBaseInfo( HttpServletRequest request){
        int page=Integer.parseInt(request.getParameter("page"));
        int rows=Integer.parseInt(request.getParameter("rows"));
         page = (page == 0?1:page);
         rows = (rows == 0?10:rows);
        int total=baseInfoService.countBaseInfoNumber();
        List<Map> baseInformation=baseInfoService.findAllBaseInfo((page-1)*rows,rows);
        Map resultMap=new HashMap();
        resultMap.put("total",total);
        resultMap.put("rows",baseInformation);
        return resultMap;
    }
}
