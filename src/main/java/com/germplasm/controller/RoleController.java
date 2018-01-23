package com.germplasm.controller;

import com.germplasm.common.Result;
import com.germplasm.model.Role;
import com.germplasm.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by hx on 2017/11/29.
 */
@RestController
@RequestMapping(value = "/role")

public class RoleController {

    @Autowired
    private RoleService roleService;

    /**
     * 查找所有用户信息
     * @return
     */

  /*  @RequestMapping(value = "/bbb",method = RequestMethod.GET)
    public String index(){
        return "/role/roleList";
    }*/

    /**
     * 查询所有的角色列表
     * @return
     */
    @RequestMapping(value = "/roles",method = RequestMethod.GET)
    @ResponseBody
    public Result<Role> findAllRoles(){

        return roleService.findAllRoles();

    }





}
