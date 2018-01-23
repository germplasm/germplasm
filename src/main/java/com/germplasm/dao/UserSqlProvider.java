package com.germplasm.dao;

import com.germplasm.model.User;
import org.apache.ibatis.jdbc.SQL;

public class UserSqlProvider {

    public String insertSelective(User record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("user");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getLoginname() != null) {
            sql.VALUES("loginName", "#{loginname,jdbcType=VARCHAR}");
        }
        
        if (record.getPasswd() != null) {
            sql.VALUES("passwd", "#{passwd,jdbcType=VARCHAR}");
        }
        
        if (record.getUnite() != null) {
            sql.VALUES("unite", "#{unite,jdbcType=VARCHAR}");
        }
        
        if (record.getRoleId() != null) {
            sql.VALUES("role_id", "#{roleId,jdbcType=INTEGER}");
        }
        
        if (record.getUniteId() != null) {
            sql.VALUES("unite_id", "#{uniteId,jdbcType=CHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(User record) {
        SQL sql = new SQL();
        sql.UPDATE("user");
        
        if (record.getLoginname() != null) {
            sql.SET("loginName = #{loginname,jdbcType=VARCHAR}");
        }
        
        if (record.getPasswd() != null) {
            sql.SET("passwd = #{passwd,jdbcType=VARCHAR}");
        }
        
        if (record.getUnite() != null) {
            sql.SET("unite = #{unite,jdbcType=VARCHAR}");
        }
        
        if (record.getRoleId() != null) {
            sql.SET("role_id = #{roleId,jdbcType=INTEGER}");
        }
        
        if (record.getUniteId() != null) {
            sql.SET("unite_id = #{uniteId,jdbcType=CHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}