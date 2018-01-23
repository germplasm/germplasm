package com.germplasm.dao;

import com.germplasm.model.Area;
import org.apache.ibatis.jdbc.SQL;

public class AreaSqlProvider {

    public String insertSelective(Area record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("area");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=CHAR}");
        }
        
        if (record.getName() != null) {
            sql.VALUES("name", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getParentId() != null) {
            sql.VALUES("parent_id", "#{parentId,jdbcType=CHAR}");
        }
        
        if (record.getLevel() != null) {
            sql.VALUES("level", "#{level,jdbcType=CHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Area record) {
        SQL sql = new SQL();
        sql.UPDATE("area");
        
        if (record.getName() != null) {
            sql.SET("name = #{name,jdbcType=VARCHAR}");
        }
        
        if (record.getParentId() != null) {
            sql.SET("parent_id = #{parentId,jdbcType=CHAR}");
        }
        
        if (record.getLevel() != null) {
            sql.SET("level = #{level,jdbcType=CHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=CHAR}");
        
        return sql.toString();
    }
}