package com.germplasm.service;

import com.germplasm.common.Result;
import com.germplasm.common.ResultUtil;
import com.germplasm.dao.RoleMapper;
import com.germplasm.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by hx on 2017/12/3.
 */
@Service
public class RoleService {

    @Autowired
    private RoleMapper roleMapper;

    /**
     * 查找所有角色
     * @return roleList
     */
    /*public Result<Role> findAllRoles(){
        List<Role> roleList = roleMapper.getAllRoles();
        if (roleList.size()!=0){
            return ResultUtil.success(roleList);
        }else {
            return ResultUtil.error(1,"没有角色呢！");
        }
    }*/

    public List<Role> findAllRoles(){
        List<Role> roleList = roleMapper.getAllRoles();
        return roleList;
    }

    /**
     * 查找角色Id和角色名
     * @return
     */
    public List<Map> findIDDesc(){
        List<Role> roleList = roleMapper.getAllRoles();
        List<Map> idDescList = new ArrayList<Map>();
        for(Role role : roleList){
            Integer id = role.getId();
            String descript = role.getDescript();
            Map<String,Object> map = new HashMap<String,Object>();
            map.put("id",id);
            map.put("descript",descript);
            idDescList.add(map);
        }
        return idDescList;
    }

}
