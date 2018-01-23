package com.germplasm.dao;

import com.germplasm.model.EvaluateInfoWithBLOBs;
import org.apache.ibatis.jdbc.SQL;

public class EvaluateInfoSqlProvider {

    public String insertSelective(EvaluateInfoWithBLOBs record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("evaluate_info");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getGermId() != null) {
            sql.VALUES("germ_id", "#{germId,jdbcType=CHAR}");
        }
        
        if (record.getAdvantage() != null) {
            sql.VALUES("advantage", "#{advantage,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getDisadvantage() != null) {
            sql.VALUES("disadvantage", "#{disadvantage,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getUtility() != null) {
            sql.VALUES("utility", "#{utility,jdbcType=LONGVARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(EvaluateInfoWithBLOBs record) {
        SQL sql = new SQL();
        sql.UPDATE("evaluate_info");
        
        if (record.getGermId() != null) {
            sql.SET("germ_id = #{germId,jdbcType=CHAR}");
        }
        
        if (record.getAdvantage() != null) {
            sql.SET("advantage = #{advantage,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getDisadvantage() != null) {
            sql.SET("disadvantage = #{disadvantage,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getUtility() != null) {
            sql.SET("utility = #{utility,jdbcType=LONGVARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}