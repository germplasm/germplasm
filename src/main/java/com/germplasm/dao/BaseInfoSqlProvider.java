package com.germplasm.dao;

import com.germplasm.model.BaseInfo;
import org.apache.ibatis.jdbc.SQL;

public class BaseInfoSqlProvider {

    public String insertSelective(BaseInfo record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("base_info");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=CHAR}");
        }
        
        if (record.getGermName() != null) {
            sql.VALUES("germ_name", "#{germName,jdbcType=VARCHAR}");
        }
        
        if (record.getFamilyName() != null) {
            sql.VALUES("family_name", "#{familyName,jdbcType=VARCHAR}");
        }
        
        if (record.getGenusName() != null) {
            sql.VALUES("genus_name", "#{genusName,jdbcType=VARCHAR}");
        }
        
        if (record.getSciName() != null) {
            sql.VALUES("sci_name", "#{sciName,jdbcType=VARCHAR}");
        }
        
        if (record.getCityId() != null) {
            sql.VALUES("city_id", "#{cityId,jdbcType=CHAR}");
        }
        
        if (record.getCountyId() != null) {
            sql.VALUES("county_id", "#{countyId,jdbcType=CHAR}");
        }
        
        if (record.getTownId() != null) {
            sql.VALUES("town_id", "#{townId,jdbcType=CHAR}");
        }
        
        if (record.getAddress() != null) {
            sql.VALUES("address", "#{address,jdbcType=VARCHAR}");
        }
        
        if (record.getSurveyDate() != null) {
            sql.VALUES("survey_date", "#{surveyDate,jdbcType=DATE}");
        }
        
        if (record.getSurveyer() != null) {
            sql.VALUES("surveyer", "#{surveyer,jdbcType=VARCHAR}");
        }
        
        if (record.getSurveyerPhone() != null) {
            sql.VALUES("surveyer_phone", "#{surveyerPhone,jdbcType=VARCHAR}");
        }
        
        if (record.getGuider() != null) {
            sql.VALUES("guider", "#{guider,jdbcType=VARCHAR}");
        }
        
        if (record.getGuiderPhone() != null) {
            sql.VALUES("guider_phone", "#{guiderPhone,jdbcType=VARCHAR}");
        }
        
        if (record.getAltitude() != null) {
            sql.VALUES("altitude", "#{altitude,jdbcType=DECIMAL}");
        }
        
        if (record.getTerrain() != null) {
            sql.VALUES("terrain", "#{terrain,jdbcType=VARCHAR}");
        }
        
        if (record.getLng() != null) {
            sql.VALUES("lng", "#{lng,jdbcType=DECIMAL}");
        }
        
        if (record.getLat() != null) {
            sql.VALUES("lat", "#{lat,jdbcType=DECIMAL}");
        }
        
        if (record.getSlope() != null) {
            sql.VALUES("slope", "#{slope,jdbcType=DECIMAL}");
        }
        
        if (record.getAspect() != null) {
            sql.VALUES("aspect", "#{aspect,jdbcType=VARCHAR}");
        }
        
        if (record.getWaterTable() != null) {
            sql.VALUES("water_table", "#{waterTable,jdbcType=DECIMAL}");
        }
        
        if (record.getSoilType() != null) {
            sql.VALUES("soil_type", "#{soilType,jdbcType=VARCHAR}");
        }
        
        if (record.getPlantSpace() != null) {
            sql.VALUES("plant_space", "#{plantSpace,jdbcType=VARCHAR}");
        }
        
        if (record.getSpieceConfig() != null) {
            sql.VALUES("spiece_config", "#{spieceConfig,jdbcType=VARCHAR}");
        }
        
        if (record.getSpieceWeight() != null) {
            sql.VALUES("spiece_weight", "#{spieceWeight,jdbcType=VARCHAR}");
        }
        
        if (record.getSource() != null) {
            sql.VALUES("source", "#{source,jdbcType=VARCHAR}");
        }
        
        if (record.getGermType() != null) {
            sql.VALUES("germ_type", "#{germType,jdbcType=VARCHAR}");
        }
        
        if (record.getTreeAge() != null) {
            sql.VALUES("tree_age", "#{treeAge,jdbcType=INTEGER}");
        }
        
        if (record.getTreeMaxAge() != null) {
            sql.VALUES("tree_max_age", "#{treeMaxAge,jdbcType=INTEGER}");
        }
        
        if (record.getDistributeRange() != null) {
            sql.VALUES("distribute_range", "#{distributeRange,jdbcType=VARCHAR}");
        }
        
        if (record.getUserId() != null) {
            sql.VALUES("user_id", "#{userId,jdbcType=CHAR}");
        }
        
        if (record.getCountyChecked() != null) {
            sql.VALUES("county_checked", "#{countyChecked,jdbcType=INTEGER}");
        }
        
        if (record.getCityChecked() != null) {
            sql.VALUES("city_checked", "#{cityChecked,jdbcType=INTEGER}");
        }
        
        if (record.getProvChecked() != null) {
            sql.VALUES("prov_checked", "#{provChecked,jdbcType=INTEGER}");
        }
        
        if (record.getSubmited() != null) {
            sql.VALUES("submited", "#{submited,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(BaseInfo record) {
        SQL sql = new SQL();
        sql.UPDATE("base_info");
        
        if (record.getGermName() != null) {
            sql.SET("germ_name = #{germName,jdbcType=VARCHAR}");
        }
        
        if (record.getFamilyName() != null) {
            sql.SET("family_name = #{familyName,jdbcType=VARCHAR}");
        }
        
        if (record.getGenusName() != null) {
            sql.SET("genus_name = #{genusName,jdbcType=VARCHAR}");
        }
        
        if (record.getSciName() != null) {
            sql.SET("sci_name = #{sciName,jdbcType=VARCHAR}");
        }
        
        if (record.getCityId() != null) {
            sql.SET("city_id = #{cityId,jdbcType=CHAR}");
        }
        
        if (record.getCountyId() != null) {
            sql.SET("county_id = #{countyId,jdbcType=CHAR}");
        }
        
        if (record.getTownId() != null) {
            sql.SET("town_id = #{townId,jdbcType=CHAR}");
        }
        
        if (record.getAddress() != null) {
            sql.SET("address = #{address,jdbcType=VARCHAR}");
        }
        
        if (record.getSurveyDate() != null) {
            sql.SET("survey_date = #{surveyDate,jdbcType=DATE}");
        }
        
        if (record.getSurveyer() != null) {
            sql.SET("surveyer = #{surveyer,jdbcType=VARCHAR}");
        }
        
        if (record.getSurveyerPhone() != null) {
            sql.SET("surveyer_phone = #{surveyerPhone,jdbcType=VARCHAR}");
        }
        
        if (record.getGuider() != null) {
            sql.SET("guider = #{guider,jdbcType=VARCHAR}");
        }
        
        if (record.getGuiderPhone() != null) {
            sql.SET("guider_phone = #{guiderPhone,jdbcType=VARCHAR}");
        }
        
        if (record.getAltitude() != null) {
            sql.SET("altitude = #{altitude,jdbcType=DECIMAL}");
        }
        
        if (record.getTerrain() != null) {
            sql.SET("terrain = #{terrain,jdbcType=VARCHAR}");
        }
        
        if (record.getLng() != null) {
            sql.SET("lng = #{lng,jdbcType=DECIMAL}");
        }
        
        if (record.getLat() != null) {
            sql.SET("lat = #{lat,jdbcType=DECIMAL}");
        }
        
        if (record.getSlope() != null) {
            sql.SET("slope = #{slope,jdbcType=DECIMAL}");
        }
        
        if (record.getAspect() != null) {
            sql.SET("aspect = #{aspect,jdbcType=VARCHAR}");
        }
        
        if (record.getWaterTable() != null) {
            sql.SET("water_table = #{waterTable,jdbcType=DECIMAL}");
        }
        
        if (record.getSoilType() != null) {
            sql.SET("soil_type = #{soilType,jdbcType=VARCHAR}");
        }
        
        if (record.getPlantSpace() != null) {
            sql.SET("plant_space = #{plantSpace,jdbcType=VARCHAR}");
        }
        
        if (record.getSpieceConfig() != null) {
            sql.SET("spiece_config = #{spieceConfig,jdbcType=VARCHAR}");
        }
        
        if (record.getSpieceWeight() != null) {
            sql.SET("spiece_weight = #{spieceWeight,jdbcType=VARCHAR}");
        }
        
        if (record.getSource() != null) {
            sql.SET("source = #{source,jdbcType=VARCHAR}");
        }
        
        if (record.getGermType() != null) {
            sql.SET("germ_type = #{germType,jdbcType=VARCHAR}");
        }
        
        if (record.getTreeAge() != null) {
            sql.SET("tree_age = #{treeAge,jdbcType=INTEGER}");
        }
        
        if (record.getTreeMaxAge() != null) {
            sql.SET("tree_max_age = #{treeMaxAge,jdbcType=INTEGER}");
        }
        
        if (record.getDistributeRange() != null) {
            sql.SET("distribute_range = #{distributeRange,jdbcType=VARCHAR}");
        }
        
        if (record.getUserId() != null) {
            sql.SET("user_id = #{userId,jdbcType=CHAR}");
        }
        
        if (record.getCountyChecked() != null) {
            sql.SET("county_checked = #{countyChecked,jdbcType=INTEGER}");
        }
        
        if (record.getCityChecked() != null) {
            sql.SET("city_checked = #{cityChecked,jdbcType=INTEGER}");
        }
        
        if (record.getProvChecked() != null) {
            sql.SET("prov_checked = #{provChecked,jdbcType=INTEGER}");
        }
        
        if (record.getSubmited() != null) {
            sql.SET("submited = #{submited,jdbcType=INTEGER}");
        }
        
        sql.WHERE("id = #{id,jdbcType=CHAR}");
        
        return sql.toString();
    }
}