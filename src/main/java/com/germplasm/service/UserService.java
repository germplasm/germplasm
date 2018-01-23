package com.germplasm.service;

import com.germplasm.common.Result;
import com.germplasm.common.ResultUtil;
import com.germplasm.dao.AreaMapper;
import com.germplasm.dao.RoleMapper;
import com.germplasm.dao.UserMapper;
import com.germplasm.model.User;
import com.sun.javafx.collections.MappingChange;
import com.sun.javafx.scene.control.skin.LabeledSkinBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by hx on 2017/11/25.
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RoleMapper roleMapper;

    @Autowired
    private AreaMapper areaMapper;

    //根据ID查找
    public Result<User> findById(Integer id){
        User user = userMapper.selectByPrimaryKey(id);
        if(user!=null){
            return ResultUtil.success(user);
        }else{
            return ResultUtil.error(2,"参数错误");
        }

    }

    /**
     * 查找所有用户
     * @return userList
     */
    public Result<User> findAllUsers(){
        //List<User> userList = userMapper.getAllUsers();
        List<User> userList = userMapper.getAllUsers();
       if(userList.size()!=0){
            return ResultUtil.success(userList);
       }else{
            return ResultUtil.error(1,"没有用户呢！");
       }
    }

    public List<User> findAll(){
        List<User> userList = userMapper.getAllUsers();
        return  userList;
    }

    /**
     * 获取用户列表
     * @return
     */
    public List<Map> findAllUser() {
        List<User> userList = userMapper.getAllUsers();
        List<Map> allUserList = new ArrayList<Map>();
        for(User user : userList){
            String loginName = user.getLoginname();
            String descript = roleMapper.getRoleDesc(user.getRoleId());
            String unite = user.getUnite();
            String areaName = areaMapper.getAreaName(user.getUniteId());
            Map<String,Object> map = new HashMap<String,Object>();
            map.put("loginName",loginName);
            map.put("descript",descript);
            map.put("unite",unite);
            map.put("areaName",areaName);
            allUserList.add(map);
        }
        return allUserList;
    }
}
