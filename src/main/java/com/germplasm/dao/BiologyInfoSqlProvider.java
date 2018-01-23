package com.germplasm.dao;

import com.germplasm.model.BiologyInfo;
import org.apache.ibatis.jdbc.SQL;

public class BiologyInfoSqlProvider {

    public String insertSelective(BiologyInfo record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("biology_info");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getGermId() != null) {
            sql.VALUES("germ_id", "#{germId,jdbcType=CHAR}");
        }
        
        if (record.getSproutAbility() != null) {
            sql.VALUES("sprout_ability", "#{sproutAbility,jdbcType=CHAR}");
        }
        
        if (record.getBranchAbility() != null) {
            sql.VALUES("branch_ability", "#{branchAbility,jdbcType=CHAR}");
        }
        
        if (record.getBranchAverLength() != null) {
            sql.VALUES("branch_aver_length", "#{branchAverLength,jdbcType=DECIMAL}");
        }
        
        if (record.getGrowtch() != null) {
            sql.VALUES("growtch", "#{growtch,jdbcType=CHAR}");
        }
        
        if (record.getFirstFruitAge() != null) {
            sql.VALUES("first_fruit_age", "#{firstFruitAge,jdbcType=INTEGER}");
        }
        
        if (record.getAcmeFruitAge() != null) {
            sql.VALUES("acme_fruit_age", "#{acmeFruitAge,jdbcType=INTEGER}");
        }
        
        if (record.getLongBranchRatio() != null) {
            sql.VALUES("long_branch_ratio", "#{longBranchRatio,jdbcType=DECIMAL}");
        }
        
        if (record.getMidBranchRatio() != null) {
            sql.VALUES("mid_branch_ratio", "#{midBranchRatio,jdbcType=DECIMAL}");
        }
        
        if (record.getShortBranchRatio() != null) {
            sql.VALUES("short_branch_ratio", "#{shortBranchRatio,jdbcType=DECIMAL}");
        }
        
        if (record.getAxiBudRatio() != null) {
            sql.VALUES("axi_bud_ratio", "#{axiBudRatio,jdbcType=DECIMAL}");
        }
        
        if (record.getPhyFruitDrop() != null) {
            sql.VALUES("phy_fruit_drop", "#{phyFruitDrop,jdbcType=CHAR}");
        }
        
        if (record.getBeforeFruitDrop() != null) {
            sql.VALUES("before_fruit_drop", "#{beforeFruitDrop,jdbcType=CHAR}");
        }
        
        if (record.getSingleAverYield() != null) {
            sql.VALUES("single_aver_yield", "#{singleAverYield,jdbcType=DECIMAL}");
        }
        
        if (record.getSingleMaxYield() != null) {
            sql.VALUES("single_max_yield", "#{singleMaxYield,jdbcType=DECIMAL}");
        }
        
        if (record.getUnitYield() != null) {
            sql.VALUES("unit_yield", "#{unitYield,jdbcType=DECIMAL}");
        }
        
        if (record.getYeildDescript() != null) {
            sql.VALUES("yeild_descript", "#{yeildDescript,jdbcType=VARCHAR}");
        }
        
        if (record.getGermStage() != null) {
            sql.VALUES("germ_stage", "#{germStage,jdbcType=VARCHAR}");
        }
        
        if (record.getFlowerStage() != null) {
            sql.VALUES("flower_stage", "#{flowerStage,jdbcType=VARCHAR}");
        }
        
        if (record.getHarvestStage() != null) {
            sql.VALUES("harvest_stage", "#{harvestStage,jdbcType=VARCHAR}");
        }
        
        if (record.getLeaffallStage() != null) {
            sql.VALUES("leaffall_stage", "#{leaffallStage,jdbcType=VARCHAR}");
        }
        
        if (record.getStorage() != null) {
            sql.VALUES("storage", "#{storage,jdbcType=INTEGER}");
        }
        
        if (record.getDiseases() != null) {
            sql.VALUES("diseases", "#{diseases,jdbcType=VARCHAR}");
        }
        
        if (record.getPest() != null) {
            sql.VALUES("pest", "#{pest,jdbcType=VARCHAR}");
        }
        
        if (record.getColdResistance() != null) {
            sql.VALUES("cold_resistance", "#{coldResistance,jdbcType=CHAR}");
        }
        
        if (record.getDrougthResistance() != null) {
            sql.VALUES("drougth_resistance", "#{drougthResistance,jdbcType=CHAR}");
        }
        
        if (record.getWindResistance() != null) {
            sql.VALUES("wind_resistance", "#{windResistance,jdbcType=CHAR}");
        }
        
        if (record.getWaterResistance() != null) {
            sql.VALUES("water_resistance", "#{waterResistance,jdbcType=CHAR}");
        }
        
        if (record.getSoilAdaptive() != null) {
            sql.VALUES("soil_adaptive", "#{soilAdaptive,jdbcType=VARCHAR}");
        }
        
        if (record.getClimateAdaptive() != null) {
            sql.VALUES("climate_adaptive", "#{climateAdaptive,jdbcType=VARCHAR}");
        }
        
        if (record.getPlantingCondition() != null) {
            sql.VALUES("planting_condition", "#{plantingCondition,jdbcType=VARCHAR}");
        }
        
        if (record.getFruitLongDiameter() != null) {
            sql.VALUES("fruit_long_diameter", "#{fruitLongDiameter,jdbcType=DECIMAL}");
        }
        
        if (record.getFruitLatDiameter() != null) {
            sql.VALUES("fruit_lat_diameter", "#{fruitLatDiameter,jdbcType=DECIMAL}");
        }
        
        if (record.getSingleFruitWeight() != null) {
            sql.VALUES("single_fruit_weight", "#{singleFruitWeight,jdbcType=DECIMAL}");
        }
        
        if (record.getFruitShape() != null) {
            sql.VALUES("fruit_shape", "#{fruitShape,jdbcType=VARCHAR}");
        }
        
        if (record.getFruitColor() != null) {
            sql.VALUES("fruit_color", "#{fruitColor,jdbcType=VARCHAR}");
        }
        
        if (record.getFruitSkin() != null) {
            sql.VALUES("fruit_skin", "#{fruitSkin,jdbcType=VARCHAR}");
        }
        
        if (record.getFruitWax() != null) {
            sql.VALUES("fruit_wax", "#{fruitWax,jdbcType=CHAR}");
        }
        
        if (record.getFruitDots() != null) {
            sql.VALUES("fruit_dots", "#{fruitDots,jdbcType=VARCHAR}");
        }
        
        if (record.getFruitStem() != null) {
            sql.VALUES("fruit_stem", "#{fruitStem,jdbcType=VARCHAR}");
        }
        
        if (record.getFruitHollow() != null) {
            sql.VALUES("fruit_hollow", "#{fruitHollow,jdbcType=VARCHAR}");
        }
        
        if (record.getFruitSepal() != null) {
            sql.VALUES("fruit_sepal", "#{fruitSepal,jdbcType=VARCHAR}");
        }
        
        if (record.getFruitDepression() != null) {
            sql.VALUES("fruit_depression", "#{fruitDepression,jdbcType=VARCHAR}");
        }
        
        if (record.getFleshColor() != null) {
            sql.VALUES("flesh_color", "#{fleshColor,jdbcType=VARCHAR}");
        }
        
        if (record.getFleshTexture() != null) {
            sql.VALUES("flesh_texture", "#{fleshTexture,jdbcType=CHAR}");
        }
        
        if (record.getFleshType() != null) {
            sql.VALUES("flesh_type", "#{fleshType,jdbcType=VARCHAR}");
        }
        
        if (record.getFleshStoneCell() != null) {
            sql.VALUES("flesh_stone_cell", "#{fleshStoneCell,jdbcType=CHAR}");
        }
        
        if (record.getFleshJuice() != null) {
            sql.VALUES("flesh_juice", "#{fleshJuice,jdbcType=CHAR}");
        }
        
        if (record.getFleshFlavor() != null) {
            sql.VALUES("flesh_flavor", "#{fleshFlavor,jdbcType=VARCHAR}");
        }
        
        if (record.getFleshScent() != null) {
            sql.VALUES("flesh_scent", "#{fleshScent,jdbcType=VARCHAR}");
        }
        
        if (record.getSolubleSolid() != null) {
            sql.VALUES("soluble_solid", "#{solubleSolid,jdbcType=DECIMAL}");
        }
        
        if (record.getFleshHardness() != null) {
            sql.VALUES("flesh_hardness", "#{fleshHardness,jdbcType=DECIMAL}");
        }
        
        if (record.getFruitHeart() != null) {
            sql.VALUES("fruit_heart", "#{fruitHeart,jdbcType=CHAR}");
        }
        
        if (record.getFruitHeartShape() != null) {
            sql.VALUES("fruit_heart_shape", "#{fruitHeartShape,jdbcType=VARCHAR}");
        }
        
        if (record.getFruitHeartNum() != null) {
            sql.VALUES("fruit_heart_num", "#{fruitHeartNum,jdbcType=INTEGER}");
        }
        
        if (record.getSeedSize() != null) {
            sql.VALUES("seed_size", "#{seedSize,jdbcType=VARCHAR}");
        }
        
        if (record.getSeedShape() != null) {
            sql.VALUES("seed_shape", "#{seedShape,jdbcType=VARCHAR}");
        }
        
        if (record.getSeedNum() != null) {
            sql.VALUES("seed_num", "#{seedNum,jdbcType=INTEGER}");
        }
        
        if (record.getSeedColor() != null) {
            sql.VALUES("seed_color", "#{seedColor,jdbcType=VARCHAR}");
        }
        
        if (record.getFruitQuality() != null) {
            sql.VALUES("fruit_quality", "#{fruitQuality,jdbcType=CHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(BiologyInfo record) {
        SQL sql = new SQL();
        sql.UPDATE("biology_info");
        
        if (record.getGermId() != null) {
            sql.SET("germ_id = #{germId,jdbcType=CHAR}");
        }
        
        if (record.getSproutAbility() != null) {
            sql.SET("sprout_ability = #{sproutAbility,jdbcType=CHAR}");
        }
        
        if (record.getBranchAbility() != null) {
            sql.SET("branch_ability = #{branchAbility,jdbcType=CHAR}");
        }
        
        if (record.getBranchAverLength() != null) {
            sql.SET("branch_aver_length = #{branchAverLength,jdbcType=DECIMAL}");
        }
        
        if (record.getGrowtch() != null) {
            sql.SET("growtch = #{growtch,jdbcType=CHAR}");
        }
        
        if (record.getFirstFruitAge() != null) {
            sql.SET("first_fruit_age = #{firstFruitAge,jdbcType=INTEGER}");
        }
        
        if (record.getAcmeFruitAge() != null) {
            sql.SET("acme_fruit_age = #{acmeFruitAge,jdbcType=INTEGER}");
        }
        
        if (record.getLongBranchRatio() != null) {
            sql.SET("long_branch_ratio = #{longBranchRatio,jdbcType=DECIMAL}");
        }
        
        if (record.getMidBranchRatio() != null) {
            sql.SET("mid_branch_ratio = #{midBranchRatio,jdbcType=DECIMAL}");
        }
        
        if (record.getShortBranchRatio() != null) {
            sql.SET("short_branch_ratio = #{shortBranchRatio,jdbcType=DECIMAL}");
        }
        
        if (record.getAxiBudRatio() != null) {
            sql.SET("axi_bud_ratio = #{axiBudRatio,jdbcType=DECIMAL}");
        }
        
        if (record.getPhyFruitDrop() != null) {
            sql.SET("phy_fruit_drop = #{phyFruitDrop,jdbcType=CHAR}");
        }
        
        if (record.getBeforeFruitDrop() != null) {
            sql.SET("before_fruit_drop = #{beforeFruitDrop,jdbcType=CHAR}");
        }
        
        if (record.getSingleAverYield() != null) {
            sql.SET("single_aver_yield = #{singleAverYield,jdbcType=DECIMAL}");
        }
        
        if (record.getSingleMaxYield() != null) {
            sql.SET("single_max_yield = #{singleMaxYield,jdbcType=DECIMAL}");
        }
        
        if (record.getUnitYield() != null) {
            sql.SET("unit_yield = #{unitYield,jdbcType=DECIMAL}");
        }
        
        if (record.getYeildDescript() != null) {
            sql.SET("yeild_descript = #{yeildDescript,jdbcType=VARCHAR}");
        }
        
        if (record.getGermStage() != null) {
            sql.SET("germ_stage = #{germStage,jdbcType=VARCHAR}");
        }
        
        if (record.getFlowerStage() != null) {
            sql.SET("flower_stage = #{flowerStage,jdbcType=VARCHAR}");
        }
        
        if (record.getHarvestStage() != null) {
            sql.SET("harvest_stage = #{harvestStage,jdbcType=VARCHAR}");
        }
        
        if (record.getLeaffallStage() != null) {
            sql.SET("leaffall_stage = #{leaffallStage,jdbcType=VARCHAR}");
        }
        
        if (record.getStorage() != null) {
            sql.SET("storage = #{storage,jdbcType=INTEGER}");
        }
        
        if (record.getDiseases() != null) {
            sql.SET("diseases = #{diseases,jdbcType=VARCHAR}");
        }
        
        if (record.getPest() != null) {
            sql.SET("pest = #{pest,jdbcType=VARCHAR}");
        }
        
        if (record.getColdResistance() != null) {
            sql.SET("cold_resistance = #{coldResistance,jdbcType=CHAR}");
        }
        
        if (record.getDrougthResistance() != null) {
            sql.SET("drougth_resistance = #{drougthResistance,jdbcType=CHAR}");
        }
        
        if (record.getWindResistance() != null) {
            sql.SET("wind_resistance = #{windResistance,jdbcType=CHAR}");
        }
        
        if (record.getWaterResistance() != null) {
            sql.SET("water_resistance = #{waterResistance,jdbcType=CHAR}");
        }
        
        if (record.getSoilAdaptive() != null) {
            sql.SET("soil_adaptive = #{soilAdaptive,jdbcType=VARCHAR}");
        }
        
        if (record.getClimateAdaptive() != null) {
            sql.SET("climate_adaptive = #{climateAdaptive,jdbcType=VARCHAR}");
        }
        
        if (record.getPlantingCondition() != null) {
            sql.SET("planting_condition = #{plantingCondition,jdbcType=VARCHAR}");
        }
        
        if (record.getFruitLongDiameter() != null) {
            sql.SET("fruit_long_diameter = #{fruitLongDiameter,jdbcType=DECIMAL}");
        }
        
        if (record.getFruitLatDiameter() != null) {
            sql.SET("fruit_lat_diameter = #{fruitLatDiameter,jdbcType=DECIMAL}");
        }
        
        if (record.getSingleFruitWeight() != null) {
            sql.SET("single_fruit_weight = #{singleFruitWeight,jdbcType=DECIMAL}");
        }
        
        if (record.getFruitShape() != null) {
            sql.SET("fruit_shape = #{fruitShape,jdbcType=VARCHAR}");
        }
        
        if (record.getFruitColor() != null) {
            sql.SET("fruit_color = #{fruitColor,jdbcType=VARCHAR}");
        }
        
        if (record.getFruitSkin() != null) {
            sql.SET("fruit_skin = #{fruitSkin,jdbcType=VARCHAR}");
        }
        
        if (record.getFruitWax() != null) {
            sql.SET("fruit_wax = #{fruitWax,jdbcType=CHAR}");
        }
        
        if (record.getFruitDots() != null) {
            sql.SET("fruit_dots = #{fruitDots,jdbcType=VARCHAR}");
        }
        
        if (record.getFruitStem() != null) {
            sql.SET("fruit_stem = #{fruitStem,jdbcType=VARCHAR}");
        }
        
        if (record.getFruitHollow() != null) {
            sql.SET("fruit_hollow = #{fruitHollow,jdbcType=VARCHAR}");
        }
        
        if (record.getFruitSepal() != null) {
            sql.SET("fruit_sepal = #{fruitSepal,jdbcType=VARCHAR}");
        }
        
        if (record.getFruitDepression() != null) {
            sql.SET("fruit_depression = #{fruitDepression,jdbcType=VARCHAR}");
        }
        
        if (record.getFleshColor() != null) {
            sql.SET("flesh_color = #{fleshColor,jdbcType=VARCHAR}");
        }
        
        if (record.getFleshTexture() != null) {
            sql.SET("flesh_texture = #{fleshTexture,jdbcType=CHAR}");
        }
        
        if (record.getFleshType() != null) {
            sql.SET("flesh_type = #{fleshType,jdbcType=VARCHAR}");
        }
        
        if (record.getFleshStoneCell() != null) {
            sql.SET("flesh_stone_cell = #{fleshStoneCell,jdbcType=CHAR}");
        }
        
        if (record.getFleshJuice() != null) {
            sql.SET("flesh_juice = #{fleshJuice,jdbcType=CHAR}");
        }
        
        if (record.getFleshFlavor() != null) {
            sql.SET("flesh_flavor = #{fleshFlavor,jdbcType=VARCHAR}");
        }
        
        if (record.getFleshScent() != null) {
            sql.SET("flesh_scent = #{fleshScent,jdbcType=VARCHAR}");
        }
        
        if (record.getSolubleSolid() != null) {
            sql.SET("soluble_solid = #{solubleSolid,jdbcType=DECIMAL}");
        }
        
        if (record.getFleshHardness() != null) {
            sql.SET("flesh_hardness = #{fleshHardness,jdbcType=DECIMAL}");
        }
        
        if (record.getFruitHeart() != null) {
            sql.SET("fruit_heart = #{fruitHeart,jdbcType=CHAR}");
        }
        
        if (record.getFruitHeartShape() != null) {
            sql.SET("fruit_heart_shape = #{fruitHeartShape,jdbcType=VARCHAR}");
        }
        
        if (record.getFruitHeartNum() != null) {
            sql.SET("fruit_heart_num = #{fruitHeartNum,jdbcType=INTEGER}");
        }
        
        if (record.getSeedSize() != null) {
            sql.SET("seed_size = #{seedSize,jdbcType=VARCHAR}");
        }
        
        if (record.getSeedShape() != null) {
            sql.SET("seed_shape = #{seedShape,jdbcType=VARCHAR}");
        }
        
        if (record.getSeedNum() != null) {
            sql.SET("seed_num = #{seedNum,jdbcType=INTEGER}");
        }
        
        if (record.getSeedColor() != null) {
            sql.SET("seed_color = #{seedColor,jdbcType=VARCHAR}");
        }
        
        if (record.getFruitQuality() != null) {
            sql.SET("fruit_quality = #{fruitQuality,jdbcType=CHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}