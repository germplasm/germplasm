package com.germplasm.service;

import com.germplasm.dao.AreaMapper;
import com.germplasm.dao.BaseInfoMapper;
import com.germplasm.dao.UserMapper;
import com.germplasm.model.Area;
import com.germplasm.model.BaseInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author scx
 * @date 2018/1/21 9:09
 */
@Service
public class BaseInfoService {

    @Autowired
    private BaseInfoMapper baseInfoMapper;

    @Autowired
    private AreaService areaService;

    /**
     * 查找种质资源列表
     * @return
     */
    public List<Map> findAllBaseInfo(Integer page,Integer pageSize){
        List<BaseInfo> baseInfoList = baseInfoMapper.getAllBaseInfo(page,pageSize);
        List<Map> allBaseInfoList = new ArrayList<Map>();
        for (BaseInfo baseInfo : baseInfoList){
            String id = baseInfo.getId();
            String germName = baseInfo.getGermName();
            String sciName = baseInfo.getSciName();
            String germType = baseInfo.getGermType();
            String source = baseInfo.getSource();
            String soilType = baseInfo.getSoilType();
            String address = baseInfo.getAddress();
            String  collectArea = "";
            if(baseInfo.getCityId()!= null){
                collectArea += areaService.getAreaNameById(baseInfo.getCityId());
            }else if(baseInfo.getCountyId() != null){
                collectArea += areaService.getAreaNameById(baseInfo.getCountyId());
            }else if(baseInfo.getTownId() != null){
                collectArea += areaService.getAreaNameById(baseInfo.getTownId());
            }
            if(address!=null){
                collectArea += address;
            }
            Map<String,Object> map = new HashMap<String,Object>();
            map.put("id",id);
            map.put("germName",germName);
            map.put("sciName",sciName);
            map.put("germType",germType);
            map.put("source",source);
            map.put("soilType",soilType);
            map.put("collectArea",collectArea);
            allBaseInfoList.add(map);
        }
        return  allBaseInfoList;
    }

    public int countBaseInfoNumber(){
        return baseInfoMapper.countBaseInfoNumber();
    }
}
