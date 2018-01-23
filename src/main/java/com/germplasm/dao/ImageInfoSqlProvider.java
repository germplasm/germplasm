package com.germplasm.dao;

import com.germplasm.model.ImageInfo;
import org.apache.ibatis.jdbc.SQL;

public class ImageInfoSqlProvider {

    public String insertSelective(ImageInfo record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("image_info");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getGermId() != null) {
            sql.VALUES("germ_id", "#{germId,jdbcType=CHAR}");
        }
        
        if (record.getImgDate() != null) {
            sql.VALUES("img_date", "#{imgDate,jdbcType=DATE}");
        }
        
        if (record.getClassify() != null) {
            sql.VALUES("classify", "#{classify,jdbcType=CHAR}");
        }
        
        if (record.getOrdernum() != null) {
            sql.VALUES("ordernum", "#{ordernum,jdbcType=CHAR}");
        }
        
        if (record.getFilename() != null) {
            sql.VALUES("filename", "#{filename,jdbcType=VARCHAR}");
        }
        
        if (record.getDesript() != null) {
            sql.VALUES("desript", "#{desript,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(ImageInfo record) {
        SQL sql = new SQL();
        sql.UPDATE("image_info");
        
        if (record.getGermId() != null) {
            sql.SET("germ_id = #{germId,jdbcType=CHAR}");
        }
        
        if (record.getImgDate() != null) {
            sql.SET("img_date = #{imgDate,jdbcType=DATE}");
        }
        
        if (record.getClassify() != null) {
            sql.SET("classify = #{classify,jdbcType=CHAR}");
        }
        
        if (record.getOrdernum() != null) {
            sql.SET("ordernum = #{ordernum,jdbcType=CHAR}");
        }
        
        if (record.getFilename() != null) {
            sql.SET("filename = #{filename,jdbcType=VARCHAR}");
        }
        
        if (record.getDesript() != null) {
            sql.SET("desript = #{desript,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}