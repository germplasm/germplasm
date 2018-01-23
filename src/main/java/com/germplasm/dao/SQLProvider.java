package com.germplasm.dao;

import com.germplasm.model.BaseInfo;

/**
 * Created by hx on 2017/12/18.
 */
public class SQLProvider {
    public String test(BaseInfo baseInfo){
        StringBuffer sql = new StringBuffer("select * from baseInfo where 1=1");
        if(baseInfo.getGermName()!=null){
            sql.append(" and germ_name=#{name}");
        }
        if(baseInfo.getFamilyName()!=null){
            sql.append(" and family_name=#{fname}");
        }
        return sql.toString();
    }
}
