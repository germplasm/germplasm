package com.germplasm.dao;

import com.germplasm.model.BotanyInfo;
import org.apache.ibatis.jdbc.SQL;

public class BotanyInfoSqlProvider {

    public String insertSelective(BotanyInfo record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("botany_info");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getGermId() != null) {
            sql.VALUES("germ_id", "#{germId,jdbcType=CHAR}");
        }
        
        if (record.getSlightlyColor() != null) {
            sql.VALUES("slightly_color", "#{slightlyColor,jdbcType=VARCHAR}");
        }
        
        if (record.getSlightlyInternodeLen() != null) {
            sql.VALUES("slightly_internode_len", "#{slightlyInternodeLen,jdbcType=DECIMAL}");
        }
        
        if (record.getSlightlyFuzz() != null) {
            sql.VALUES("slightly_fuzz", "#{slightlyFuzz,jdbcType=VARCHAR}");
        }
        
        if (record.getSlightlyLenticelNum() != null) {
            sql.VALUES("slightly_lenticel_num", "#{slightlyLenticelNum,jdbcType=VARCHAR}");
        }
        
        if (record.getSlightlyLenticelSize() != null) {
            sql.VALUES("slightly_lenticel_size", "#{slightlyLenticelSize,jdbcType=VARCHAR}");
        }
        
        if (record.getSlightlyLenticelShape() != null) {
            sql.VALUES("slightly_lenticel_shape", "#{slightlyLenticelShape,jdbcType=VARCHAR}");
        }
        
        if (record.getBranchColor() != null) {
            sql.VALUES("branch_color", "#{branchColor,jdbcType=VARCHAR}");
        }
        
        if (record.getBranchLenticelNum() != null) {
            sql.VALUES("branch_lenticel_num", "#{branchLenticelNum,jdbcType=VARCHAR}");
        }
        
        if (record.getBranchLenticelSize() != null) {
            sql.VALUES("branch_lenticel_size", "#{branchLenticelSize,jdbcType=VARCHAR}");
        }
        
        if (record.getBranchLenticelShape() != null) {
            sql.VALUES("branch_lenticel_shape", "#{branchLenticelShape,jdbcType=VARCHAR}");
        }
        
        if (record.getBudShape() != null) {
            sql.VALUES("bud_shape", "#{budShape,jdbcType=VARCHAR}");
        }
        
        if (record.getBudSize() != null) {
            sql.VALUES("bud_size", "#{budSize,jdbcType=VARCHAR}");
        }
        
        if (record.getBudColor() != null) {
            sql.VALUES("bud_color", "#{budColor,jdbcType=VARCHAR}");
        }
        
        if (record.getBudInsertionType() != null) {
            sql.VALUES("bud_insertion_type", "#{budInsertionType,jdbcType=VARCHAR}");
        }
        
        if (record.getFlowerBudShape() != null) {
            sql.VALUES("flower_bud_shape", "#{flowerBudShape,jdbcType=VARCHAR}");
        }
        
        if (record.getFlowerBudSize() != null) {
            sql.VALUES("flower_bud_size", "#{flowerBudSize,jdbcType=VARCHAR}");
        }
        
        if (record.getFlowerBudColor() != null) {
            sql.VALUES("flower_bud_color", "#{flowerBudColor,jdbcType=VARCHAR}");
        }
        
        if (record.getFlowerBudInsertionType() != null) {
            sql.VALUES("flower_bud_insertion_type", "#{flowerBudInsertionType,jdbcType=VARCHAR}");
        }
        
        if (record.getLeafShape() != null) {
            sql.VALUES("leaf_shape", "#{leafShape,jdbcType=VARCHAR}");
        }
        
        if (record.getLeafLength() != null) {
            sql.VALUES("leaf_length", "#{leafLength,jdbcType=DECIMAL}");
        }
        
        if (record.getLeafWidth() != null) {
            sql.VALUES("leaf_width", "#{leafWidth,jdbcType=DECIMAL}");
        }
        
        if (record.getLeafOpex() != null) {
            sql.VALUES("leaf_opex", "#{leafOpex,jdbcType=VARCHAR}");
        }
        
        if (record.getLeafBase() != null) {
            sql.VALUES("leaf_base", "#{leafBase,jdbcType=VARCHAR}");
        }
        
        if (record.getLeafColor() != null) {
            sql.VALUES("leaf_color", "#{leafColor,jdbcType=VARCHAR}");
        }
        
        if (record.getLeafFlatDegree() != null) {
            sql.VALUES("leaf_flat_degree", "#{leafFlatDegree,jdbcType=VARCHAR}");
        }
        
        if (record.getLeafSawtoothSize() != null) {
            sql.VALUES("leaf_sawtooth_size", "#{leafSawtoothSize,jdbcType=VARCHAR}");
        }
        
        if (record.getLeafSawtoothShape() != null) {
            sql.VALUES("leaf_sawtooth_shape", "#{leafSawtoothShape,jdbcType=VARCHAR}");
        }
        
        if (record.getLeafSawtoothNeedle() != null) {
            sql.VALUES("leaf_sawtooth_needle", "#{leafSawtoothNeedle,jdbcType=VARCHAR}");
        }
        
        if (record.getLeafSawtoothFlatness() != null) {
            sql.VALUES("leaf_sawtooth_flatness", "#{leafSawtoothFlatness,jdbcType=VARCHAR}");
        }
        
        if (record.getLeafFuzz() != null) {
            sql.VALUES("leaf_fuzz", "#{leafFuzz,jdbcType=VARCHAR}");
        }
        
        if (record.getLeafstalkLength() != null) {
            sql.VALUES("leafstalk_length", "#{leafstalkLength,jdbcType=DECIMAL}");
        }
        
        if (record.getLeafstalkThickness() != null) {
            sql.VALUES("leafstalk_thickness", "#{leafstalkThickness,jdbcType=DECIMAL}");
        }
        
        if (record.getLeafstalkFuzz() != null) {
            sql.VALUES("leafstalk_fuzz", "#{leafstalkFuzz,jdbcType=VARCHAR}");
        }
        
        if (record.getStipule() != null) {
            sql.VALUES("stipule", "#{stipule,jdbcType=VARCHAR}");
        }
        
        if (record.getInflorescence() != null) {
            sql.VALUES("inflorescence", "#{inflorescence,jdbcType=VARCHAR}");
        }
        
        if (record.getBloomPerInflore() != null) {
            sql.VALUES("bloom_per_inflore", "#{bloomPerInflore,jdbcType=INTEGER}");
        }
        
        if (record.getAlabastrumColor() != null) {
            sql.VALUES("alabastrum_color", "#{alabastrumColor,jdbcType=VARCHAR}");
        }
        
        if (record.getPetalNum() != null) {
            sql.VALUES("petal_num", "#{petalNum,jdbcType=INTEGER}");
        }
        
        if (record.getPetalColor() != null) {
            sql.VALUES("petal_color", "#{petalColor,jdbcType=VARCHAR}");
        }
        
        if (record.getPetalShape() != null) {
            sql.VALUES("petal_shape", "#{petalShape,jdbcType=VARCHAR}");
        }
        
        if (record.getCorollaDiameter() != null) {
            sql.VALUES("corolla_diameter", "#{corollaDiameter,jdbcType=DECIMAL}");
        }
        
        if (record.getPedicelLength() != null) {
            sql.VALUES("pedicel_length", "#{pedicelLength,jdbcType=DECIMAL}");
        }
        
        if (record.getPedicelFuzz() != null) {
            sql.VALUES("pedicel_fuzz", "#{pedicelFuzz,jdbcType=VARCHAR}");
        }
        
        if (record.getStamenNum() != null) {
            sql.VALUES("stamen_num", "#{stamenNum,jdbcType=VARCHAR}");
        }
        
        if (record.getPistilNum() != null) {
            sql.VALUES("pistil_num", "#{pistilNum,jdbcType=INTEGER}");
        }
        
        if (record.getAntherColor() != null) {
            sql.VALUES("anther_color", "#{antherColor,jdbcType=VARCHAR}");
        }
        
        if (record.getPistilHeight() != null) {
            sql.VALUES("pistil_height", "#{pistilHeight,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(BotanyInfo record) {
        SQL sql = new SQL();
        sql.UPDATE("botany_info");
        
        if (record.getGermId() != null) {
            sql.SET("germ_id = #{germId,jdbcType=CHAR}");
        }
        
        if (record.getSlightlyColor() != null) {
            sql.SET("slightly_color = #{slightlyColor,jdbcType=VARCHAR}");
        }
        
        if (record.getSlightlyInternodeLen() != null) {
            sql.SET("slightly_internode_len = #{slightlyInternodeLen,jdbcType=DECIMAL}");
        }
        
        if (record.getSlightlyFuzz() != null) {
            sql.SET("slightly_fuzz = #{slightlyFuzz,jdbcType=VARCHAR}");
        }
        
        if (record.getSlightlyLenticelNum() != null) {
            sql.SET("slightly_lenticel_num = #{slightlyLenticelNum,jdbcType=VARCHAR}");
        }
        
        if (record.getSlightlyLenticelSize() != null) {
            sql.SET("slightly_lenticel_size = #{slightlyLenticelSize,jdbcType=VARCHAR}");
        }
        
        if (record.getSlightlyLenticelShape() != null) {
            sql.SET("slightly_lenticel_shape = #{slightlyLenticelShape,jdbcType=VARCHAR}");
        }
        
        if (record.getBranchColor() != null) {
            sql.SET("branch_color = #{branchColor,jdbcType=VARCHAR}");
        }
        
        if (record.getBranchLenticelNum() != null) {
            sql.SET("branch_lenticel_num = #{branchLenticelNum,jdbcType=VARCHAR}");
        }
        
        if (record.getBranchLenticelSize() != null) {
            sql.SET("branch_lenticel_size = #{branchLenticelSize,jdbcType=VARCHAR}");
        }
        
        if (record.getBranchLenticelShape() != null) {
            sql.SET("branch_lenticel_shape = #{branchLenticelShape,jdbcType=VARCHAR}");
        }
        
        if (record.getBudShape() != null) {
            sql.SET("bud_shape = #{budShape,jdbcType=VARCHAR}");
        }
        
        if (record.getBudSize() != null) {
            sql.SET("bud_size = #{budSize,jdbcType=VARCHAR}");
        }
        
        if (record.getBudColor() != null) {
            sql.SET("bud_color = #{budColor,jdbcType=VARCHAR}");
        }
        
        if (record.getBudInsertionType() != null) {
            sql.SET("bud_insertion_type = #{budInsertionType,jdbcType=VARCHAR}");
        }
        
        if (record.getFlowerBudShape() != null) {
            sql.SET("flower_bud_shape = #{flowerBudShape,jdbcType=VARCHAR}");
        }
        
        if (record.getFlowerBudSize() != null) {
            sql.SET("flower_bud_size = #{flowerBudSize,jdbcType=VARCHAR}");
        }
        
        if (record.getFlowerBudColor() != null) {
            sql.SET("flower_bud_color = #{flowerBudColor,jdbcType=VARCHAR}");
        }
        
        if (record.getFlowerBudInsertionType() != null) {
            sql.SET("flower_bud_insertion_type = #{flowerBudInsertionType,jdbcType=VARCHAR}");
        }
        
        if (record.getLeafShape() != null) {
            sql.SET("leaf_shape = #{leafShape,jdbcType=VARCHAR}");
        }
        
        if (record.getLeafLength() != null) {
            sql.SET("leaf_length = #{leafLength,jdbcType=DECIMAL}");
        }
        
        if (record.getLeafWidth() != null) {
            sql.SET("leaf_width = #{leafWidth,jdbcType=DECIMAL}");
        }
        
        if (record.getLeafOpex() != null) {
            sql.SET("leaf_opex = #{leafOpex,jdbcType=VARCHAR}");
        }
        
        if (record.getLeafBase() != null) {
            sql.SET("leaf_base = #{leafBase,jdbcType=VARCHAR}");
        }
        
        if (record.getLeafColor() != null) {
            sql.SET("leaf_color = #{leafColor,jdbcType=VARCHAR}");
        }
        
        if (record.getLeafFlatDegree() != null) {
            sql.SET("leaf_flat_degree = #{leafFlatDegree,jdbcType=VARCHAR}");
        }
        
        if (record.getLeafSawtoothSize() != null) {
            sql.SET("leaf_sawtooth_size = #{leafSawtoothSize,jdbcType=VARCHAR}");
        }
        
        if (record.getLeafSawtoothShape() != null) {
            sql.SET("leaf_sawtooth_shape = #{leafSawtoothShape,jdbcType=VARCHAR}");
        }
        
        if (record.getLeafSawtoothNeedle() != null) {
            sql.SET("leaf_sawtooth_needle = #{leafSawtoothNeedle,jdbcType=VARCHAR}");
        }
        
        if (record.getLeafSawtoothFlatness() != null) {
            sql.SET("leaf_sawtooth_flatness = #{leafSawtoothFlatness,jdbcType=VARCHAR}");
        }
        
        if (record.getLeafFuzz() != null) {
            sql.SET("leaf_fuzz = #{leafFuzz,jdbcType=VARCHAR}");
        }
        
        if (record.getLeafstalkLength() != null) {
            sql.SET("leafstalk_length = #{leafstalkLength,jdbcType=DECIMAL}");
        }
        
        if (record.getLeafstalkThickness() != null) {
            sql.SET("leafstalk_thickness = #{leafstalkThickness,jdbcType=DECIMAL}");
        }
        
        if (record.getLeafstalkFuzz() != null) {
            sql.SET("leafstalk_fuzz = #{leafstalkFuzz,jdbcType=VARCHAR}");
        }
        
        if (record.getStipule() != null) {
            sql.SET("stipule = #{stipule,jdbcType=VARCHAR}");
        }
        
        if (record.getInflorescence() != null) {
            sql.SET("inflorescence = #{inflorescence,jdbcType=VARCHAR}");
        }
        
        if (record.getBloomPerInflore() != null) {
            sql.SET("bloom_per_inflore = #{bloomPerInflore,jdbcType=INTEGER}");
        }
        
        if (record.getAlabastrumColor() != null) {
            sql.SET("alabastrum_color = #{alabastrumColor,jdbcType=VARCHAR}");
        }
        
        if (record.getPetalNum() != null) {
            sql.SET("petal_num = #{petalNum,jdbcType=INTEGER}");
        }
        
        if (record.getPetalColor() != null) {
            sql.SET("petal_color = #{petalColor,jdbcType=VARCHAR}");
        }
        
        if (record.getPetalShape() != null) {
            sql.SET("petal_shape = #{petalShape,jdbcType=VARCHAR}");
        }
        
        if (record.getCorollaDiameter() != null) {
            sql.SET("corolla_diameter = #{corollaDiameter,jdbcType=DECIMAL}");
        }
        
        if (record.getPedicelLength() != null) {
            sql.SET("pedicel_length = #{pedicelLength,jdbcType=DECIMAL}");
        }
        
        if (record.getPedicelFuzz() != null) {
            sql.SET("pedicel_fuzz = #{pedicelFuzz,jdbcType=VARCHAR}");
        }
        
        if (record.getStamenNum() != null) {
            sql.SET("stamen_num = #{stamenNum,jdbcType=VARCHAR}");
        }
        
        if (record.getPistilNum() != null) {
            sql.SET("pistil_num = #{pistilNum,jdbcType=INTEGER}");
        }
        
        if (record.getAntherColor() != null) {
            sql.SET("anther_color = #{antherColor,jdbcType=VARCHAR}");
        }
        
        if (record.getPistilHeight() != null) {
            sql.SET("pistil_height = #{pistilHeight,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}