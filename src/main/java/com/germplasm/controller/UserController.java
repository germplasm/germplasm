package com.germplasm.controller;

import com.germplasm.common.Result;
import com.germplasm.common.ResultCode;
import com.germplasm.common.ResultUtil;
import com.germplasm.dao.UserMapper;
import com.germplasm.model.User;
import com.germplasm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * Created by hx on 2017/11/25.
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    /*根据Id查找用户信息
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Result<User> findUserByID(@PathVariable Integer id){

        return userService.findById(id);
    }*/

    /**
     * 查找所有用户
    * @return
      */
    @RequestMapping(value = "/userLists",method = RequestMethod.GET)
    public List<Map> findAllUser(){
        return userService.findAllUser();
    }

    /*@RequestMapping(value = "/users",method = RequestMethod.GET)
    public List<User> findAll(){
        return userService.findAll();
    }*/

}
