package com.germplasm.service;

import com.germplasm.common.Result;
import com.germplasm.common.ResultUtil;
import com.germplasm.dao.RoleMapper;
import com.germplasm.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public Result<Role> findAllRoles(){
        List<Role> roleList = roleMapper.getAllRoles();
        if (roleList.size()!=0){
            return ResultUtil.success(roleList);
        }else {
            return ResultUtil.error(1,"没有角色呢！");
        }
    }
}
