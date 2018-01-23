package com.germplasm.service;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.germplasm.dao.AreaMapper;
import com.germplasm.model.Area;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sound.midi.Soundbank;

/**
 * @author scx
 * @date 2018/1/21 16:18
 */
@Service
public class AreaService {

    @Autowired
    private AreaMapper areaMapper;

    public String getAreaNameById(String id){
        Area area = areaMapper.selectByPrimaryKey(id);
        /*System.out.println(area.getParentId());
        String areaName = "";
        if(area.getParentId().equals("0") ){
            System.out.println(area.getName());
            return area.getName();
        }else {
            String  name = getAreaNameById(area.getParentId());
            areaName = areaName + name;
            System.out.println(areaName);
            return areaName;
        }*/
        if(area == null){
            return "";
        }else {
            return area.getName();
        }
    }

}
