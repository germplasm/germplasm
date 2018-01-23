package com.germplasm.dao;

import com.germplasm.model.BaseInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface BaseInfoMapper {
    @Delete({
        "delete from base_info",
        "where id = #{id,jdbcType=CHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into base_info (id, germ_name, ",
        "family_name, genus_name, ",
        "sci_name, city_id, county_id, ",
        "town_id, address, survey_date, ",
        "surveyer, surveyer_phone, ",
        "guider, guider_phone, ",
        "altitude, terrain, ",
        "lng, lat, slope, ",
        "aspect, water_table, ",
        "soil_type, plant_space, ",
        "spiece_config, spiece_weight, ",
        "source, germ_type, ",
        "tree_age, tree_max_age, ",
        "distribute_range, user_id, ",
        "county_checked, city_checked, ",
        "prov_checked, submited)",
        "values (#{id,jdbcType=CHAR}, #{germName,jdbcType=VARCHAR}, ",
        "#{familyName,jdbcType=VARCHAR}, #{genusName,jdbcType=VARCHAR}, ",
        "#{sciName,jdbcType=VARCHAR}, #{cityId,jdbcType=CHAR}, #{countyId,jdbcType=CHAR}, ",
        "#{townId,jdbcType=CHAR}, #{address,jdbcType=VARCHAR}, #{surveyDate,jdbcType=DATE}, ",
        "#{surveyer,jdbcType=VARCHAR}, #{surveyerPhone,jdbcType=VARCHAR}, ",
        "#{guider,jdbcType=VARCHAR}, #{guiderPhone,jdbcType=VARCHAR}, ",
        "#{altitude,jdbcType=DECIMAL}, #{terrain,jdbcType=VARCHAR}, ",
        "#{lng,jdbcType=DECIMAL}, #{lat,jdbcType=DECIMAL}, #{slope,jdbcType=DECIMAL}, ",
        "#{aspect,jdbcType=VARCHAR}, #{waterTable,jdbcType=DECIMAL}, ",
        "#{soilType,jdbcType=VARCHAR}, #{plantSpace,jdbcType=VARCHAR}, ",
        "#{spieceConfig,jdbcType=VARCHAR}, #{spieceWeight,jdbcType=VARCHAR}, ",
        "#{source,jdbcType=VARCHAR}, #{germType,jdbcType=VARCHAR}, ",
        "#{treeAge,jdbcType=INTEGER}, #{treeMaxAge,jdbcType=INTEGER}, ",
        "#{distributeRange,jdbcType=VARCHAR}, #{userId,jdbcType=CHAR}, ",
        "#{countyChecked,jdbcType=INTEGER}, #{cityChecked,jdbcType=INTEGER}, ",
        "#{provChecked,jdbcType=INTEGER}, #{submited,jdbcType=INTEGER})"
    })
    int insert(BaseInfo record);

    @InsertProvider(type=BaseInfoSqlProvider.class, method="insertSelective")
    int insertSelective(BaseInfo record);

    @Select({
        "select",
        "id, germ_name, family_name, genus_name, sci_name, city_id, county_id, town_id, ",
        "address, survey_date, surveyer, surveyer_phone, guider, guider_phone, altitude, ",
        "terrain, lng, lat, slope, aspect, water_table, soil_type, plant_space, spiece_config, ",
        "spiece_weight, source, germ_type, tree_age, tree_max_age, distribute_range, ",
        "user_id, county_checked, city_checked, prov_checked, submited",
        "from base_info",
        "where id = #{id,jdbcType=CHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="germ_name", property="germName", jdbcType=JdbcType.VARCHAR),
        @Result(column="family_name", property="familyName", jdbcType=JdbcType.VARCHAR),
        @Result(column="genus_name", property="genusName", jdbcType=JdbcType.VARCHAR),
        @Result(column="sci_name", property="sciName", jdbcType=JdbcType.VARCHAR),
        @Result(column="city_id", property="cityId", jdbcType=JdbcType.CHAR),
        @Result(column="county_id", property="countyId", jdbcType=JdbcType.CHAR),
        @Result(column="town_id", property="townId", jdbcType=JdbcType.CHAR),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="survey_date", property="surveyDate", jdbcType=JdbcType.DATE),
        @Result(column="surveyer", property="surveyer", jdbcType=JdbcType.VARCHAR),
        @Result(column="surveyer_phone", property="surveyerPhone", jdbcType=JdbcType.VARCHAR),
        @Result(column="guider", property="guider", jdbcType=JdbcType.VARCHAR),
        @Result(column="guider_phone", property="guiderPhone", jdbcType=JdbcType.VARCHAR),
        @Result(column="altitude", property="altitude", jdbcType=JdbcType.DECIMAL),
        @Result(column="terrain", property="terrain", jdbcType=JdbcType.VARCHAR),
        @Result(column="lng", property="lng", jdbcType=JdbcType.DECIMAL),
        @Result(column="lat", property="lat", jdbcType=JdbcType.DECIMAL),
        @Result(column="slope", property="slope", jdbcType=JdbcType.DECIMAL),
        @Result(column="aspect", property="aspect", jdbcType=JdbcType.VARCHAR),
        @Result(column="water_table", property="waterTable", jdbcType=JdbcType.DECIMAL),
        @Result(column="soil_type", property="soilType", jdbcType=JdbcType.VARCHAR),
        @Result(column="plant_space", property="plantSpace", jdbcType=JdbcType.VARCHAR),
        @Result(column="spiece_config", property="spieceConfig", jdbcType=JdbcType.VARCHAR),
        @Result(column="spiece_weight", property="spieceWeight", jdbcType=JdbcType.VARCHAR),
        @Result(column="source", property="source", jdbcType=JdbcType.VARCHAR),
        @Result(column="germ_type", property="germType", jdbcType=JdbcType.VARCHAR),
        @Result(column="tree_age", property="treeAge", jdbcType=JdbcType.INTEGER),
        @Result(column="tree_max_age", property="treeMaxAge", jdbcType=JdbcType.INTEGER),
        @Result(column="distribute_range", property="distributeRange", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.CHAR),
        @Result(column="county_checked", property="countyChecked", jdbcType=JdbcType.INTEGER),
        @Result(column="city_checked", property="cityChecked", jdbcType=JdbcType.INTEGER),
        @Result(column="prov_checked", property="provChecked", jdbcType=JdbcType.INTEGER),
        @Result(column="submited", property="submited", jdbcType=JdbcType.INTEGER)
    })
    BaseInfo selectByPrimaryKey(String id);

    @UpdateProvider(type=BaseInfoSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(BaseInfo record);

    @Update({
        "update base_info",
        "set germ_name = #{germName,jdbcType=VARCHAR},",
          "family_name = #{familyName,jdbcType=VARCHAR},",
          "genus_name = #{genusName,jdbcType=VARCHAR},",
          "sci_name = #{sciName,jdbcType=VARCHAR},",
          "city_id = #{cityId,jdbcType=CHAR},",
          "county_id = #{countyId,jdbcType=CHAR},",
          "town_id = #{townId,jdbcType=CHAR},",
          "address = #{address,jdbcType=VARCHAR},",
          "survey_date = #{surveyDate,jdbcType=DATE},",
          "surveyer = #{surveyer,jdbcType=VARCHAR},",
          "surveyer_phone = #{surveyerPhone,jdbcType=VARCHAR},",
          "guider = #{guider,jdbcType=VARCHAR},",
          "guider_phone = #{guiderPhone,jdbcType=VARCHAR},",
          "altitude = #{altitude,jdbcType=DECIMAL},",
          "terrain = #{terrain,jdbcType=VARCHAR},",
          "lng = #{lng,jdbcType=DECIMAL},",
          "lat = #{lat,jdbcType=DECIMAL},",
          "slope = #{slope,jdbcType=DECIMAL},",
          "aspect = #{aspect,jdbcType=VARCHAR},",
          "water_table = #{waterTable,jdbcType=DECIMAL},",
          "soil_type = #{soilType,jdbcType=VARCHAR},",
          "plant_space = #{plantSpace,jdbcType=VARCHAR},",
          "spiece_config = #{spieceConfig,jdbcType=VARCHAR},",
          "spiece_weight = #{spieceWeight,jdbcType=VARCHAR},",
          "source = #{source,jdbcType=VARCHAR},",
          "germ_type = #{germType,jdbcType=VARCHAR},",
          "tree_age = #{treeAge,jdbcType=INTEGER},",
          "tree_max_age = #{treeMaxAge,jdbcType=INTEGER},",
          "distribute_range = #{distributeRange,jdbcType=VARCHAR},",
          "user_id = #{userId,jdbcType=CHAR},",
          "county_checked = #{countyChecked,jdbcType=INTEGER},",
          "city_checked = #{cityChecked,jdbcType=INTEGER},",
          "prov_checked = #{provChecked,jdbcType=INTEGER},",
          "submited = #{submited,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=CHAR}"
    })
    int updateByPrimaryKey(BaseInfo record);
}