package com.germplasm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by hx on 2017/12/5.
 */
@Controller

/**
 * 页面导航
 */
public class Navigation {

    @RequestMapping(value = "/index")
    public String getIndex(){
        return "/index";
    }

    @RequestMapping(value = "/top")
    public  String getTop(){return "/top";}

    @RequestMapping(value = "/left")
    public String getLeft(){return "/left";}

    @RequestMapping(value = "/main")
    public String getMain(){return "/main";}

    @RequestMapping(value = "/bottom")
    public String getBottom(){return "/bottom";}

    @RequestMapping(value = "/swich")
    public String getSwich(){return "/swich";}

    @RequestMapping(value = "/userListPage")
    public String getUserListPage(){return "/user/userList";}

    @RequestMapping(value = "/roleListPage")
    public String getRoleListPage(){return "/role/roleList";}

    @RequestMapping(value = "/rolesPage")
    public String getUsers(){return "/role/roleList";}




}
