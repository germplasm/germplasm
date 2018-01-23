package com.germplasm.dao;

import com.germplasm.model.PlantInfo;
import org.apache.ibatis.jdbc.SQL;

public class PlantInfoSqlProvider {

    public String insertSelective(PlantInfo record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("plant_info");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getGermId() != null) {
            sql.VALUES("germ_id", "#{germId,jdbcType=CHAR}");
        }
        
        if (record.getBreedWay() != null) {
            sql.VALUES("breed_way", "#{breedWay,jdbcType=VARCHAR}");
        }
        
        if (record.getTreeVigor() != null) {
            sql.VALUES("tree_vigor", "#{treeVigor,jdbcType=VARCHAR}");
        }
        
        if (record.getRootStock() != null) {
            sql.VALUES("root_stock", "#{rootStock,jdbcType=VARCHAR}");
        }
        
        if (record.getTreePose() != null) {
            sql.VALUES("tree_pose", "#{treePose,jdbcType=VARCHAR}");
        }
        
        if (record.getTreeHeight() != null) {
            sql.VALUES("tree_height", "#{treeHeight,jdbcType=DECIMAL}");
        }
        
        if (record.getTreeShape() != null) {
            sql.VALUES("tree_shape", "#{treeShape,jdbcType=VARCHAR}");
        }
        
        if (record.getCrownDiameter() != null) {
            sql.VALUES("crown_diameter", "#{crownDiameter,jdbcType=DECIMAL}");
        }
        
        if (record.getPoleHeight() != null) {
            sql.VALUES("pole_height", "#{poleHeight,jdbcType=DECIMAL}");
        }
        
        if (record.getBranchNum() != null) {
            sql.VALUES("branch_num", "#{branchNum,jdbcType=INTEGER}");
        }
        
        if (record.getPolePerimeter() != null) {
            sql.VALUES("pole_perimeter", "#{polePerimeter,jdbcType=DECIMAL}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(PlantInfo record) {
        SQL sql = new SQL();
        sql.UPDATE("plant_info");
        
        if (record.getGermId() != null) {
            sql.SET("germ_id = #{germId,jdbcType=CHAR}");
        }
        
        if (record.getBreedWay() != null) {
            sql.SET("breed_way = #{breedWay,jdbcType=VARCHAR}");
        }
        
        if (record.getTreeVigor() != null) {
            sql.SET("tree_vigor = #{treeVigor,jdbcType=VARCHAR}");
        }
        
        if (record.getRootStock() != null) {
            sql.SET("root_stock = #{rootStock,jdbcType=VARCHAR}");
        }
        
        if (record.getTreePose() != null) {
            sql.SET("tree_pose = #{treePose,jdbcType=VARCHAR}");
        }
        
        if (record.getTreeHeight() != null) {
            sql.SET("tree_height = #{treeHeight,jdbcType=DECIMAL}");
        }
        
        if (record.getTreeShape() != null) {
            sql.SET("tree_shape = #{treeShape,jdbcType=VARCHAR}");
        }
        
        if (record.getCrownDiameter() != null) {
            sql.SET("crown_diameter = #{crownDiameter,jdbcType=DECIMAL}");
        }
        
        if (record.getPoleHeight() != null) {
            sql.SET("pole_height = #{poleHeight,jdbcType=DECIMAL}");
        }
        
        if (record.getBranchNum() != null) {
            sql.SET("branch_num = #{branchNum,jdbcType=INTEGER}");
        }
        
        if (record.getPolePerimeter() != null) {
            sql.SET("pole_perimeter = #{polePerimeter,jdbcType=DECIMAL}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}