package com.germplasm.dao;

import com.germplasm.model.BotanyInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface BotanyInfoMapper {
    @Delete({
        "delete from botany_info",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into botany_info (id, germ_id, ",
        "slightly_color, slightly_internode_len, ",
        "slightly_fuzz, slightly_lenticel_num, ",
        "slightly_lenticel_size, slightly_lenticel_shape, ",
        "branch_color, branch_lenticel_num, ",
        "branch_lenticel_size, branch_lenticel_shape, ",
        "bud_shape, bud_size, ",
        "bud_color, bud_insertion_type, ",
        "flower_bud_shape, flower_bud_size, ",
        "flower_bud_color, flower_bud_insertion_type, ",
        "leaf_shape, leaf_length, ",
        "leaf_width, leaf_opex, ",
        "leaf_base, leaf_color, ",
        "leaf_flat_degree, leaf_sawtooth_size, ",
        "leaf_sawtooth_shape, leaf_sawtooth_needle, ",
        "leaf_sawtooth_flatness, leaf_fuzz, ",
        "leafstalk_length, leafstalk_thickness, ",
        "leafstalk_fuzz, stipule, ",
        "inflorescence, bloom_per_inflore, ",
        "alabastrum_color, petal_num, ",
        "petal_color, petal_shape, ",
        "corolla_diameter, pedicel_length, ",
        "pedicel_fuzz, stamen_num, ",
        "pistil_num, anther_color, ",
        "pistil_height)",
        "values (#{id,jdbcType=INTEGER}, #{germId,jdbcType=CHAR}, ",
        "#{slightlyColor,jdbcType=VARCHAR}, #{slightlyInternodeLen,jdbcType=DECIMAL}, ",
        "#{slightlyFuzz,jdbcType=VARCHAR}, #{slightlyLenticelNum,jdbcType=VARCHAR}, ",
        "#{slightlyLenticelSize,jdbcType=VARCHAR}, #{slightlyLenticelShape,jdbcType=VARCHAR}, ",
        "#{branchColor,jdbcType=VARCHAR}, #{branchLenticelNum,jdbcType=VARCHAR}, ",
        "#{branchLenticelSize,jdbcType=VARCHAR}, #{branchLenticelShape,jdbcType=VARCHAR}, ",
        "#{budShape,jdbcType=VARCHAR}, #{budSize,jdbcType=VARCHAR}, ",
        "#{budColor,jdbcType=VARCHAR}, #{budInsertionType,jdbcType=VARCHAR}, ",
        "#{flowerBudShape,jdbcType=VARCHAR}, #{flowerBudSize,jdbcType=VARCHAR}, ",
        "#{flowerBudColor,jdbcType=VARCHAR}, #{flowerBudInsertionType,jdbcType=VARCHAR}, ",
        "#{leafShape,jdbcType=VARCHAR}, #{leafLength,jdbcType=DECIMAL}, ",
        "#{leafWidth,jdbcType=DECIMAL}, #{leafOpex,jdbcType=VARCHAR}, ",
        "#{leafBase,jdbcType=VARCHAR}, #{leafColor,jdbcType=VARCHAR}, ",
        "#{leafFlatDegree,jdbcType=VARCHAR}, #{leafSawtoothSize,jdbcType=VARCHAR}, ",
        "#{leafSawtoothShape,jdbcType=VARCHAR}, #{leafSawtoothNeedle,jdbcType=VARCHAR}, ",
        "#{leafSawtoothFlatness,jdbcType=VARCHAR}, #{leafFuzz,jdbcType=VARCHAR}, ",
        "#{leafstalkLength,jdbcType=DECIMAL}, #{leafstalkThickness,jdbcType=DECIMAL}, ",
        "#{leafstalkFuzz,jdbcType=VARCHAR}, #{stipule,jdbcType=VARCHAR}, ",
        "#{inflorescence,jdbcType=VARCHAR}, #{bloomPerInflore,jdbcType=INTEGER}, ",
        "#{alabastrumColor,jdbcType=VARCHAR}, #{petalNum,jdbcType=INTEGER}, ",
        "#{petalColor,jdbcType=VARCHAR}, #{petalShape,jdbcType=VARCHAR}, ",
        "#{corollaDiameter,jdbcType=DECIMAL}, #{pedicelLength,jdbcType=DECIMAL}, ",
        "#{pedicelFuzz,jdbcType=VARCHAR}, #{stamenNum,jdbcType=VARCHAR}, ",
        "#{pistilNum,jdbcType=INTEGER}, #{antherColor,jdbcType=VARCHAR}, ",
        "#{pistilHeight,jdbcType=VARCHAR})"
    })
    int insert(BotanyInfo record);

    @InsertProvider(type=BotanyInfoSqlProvider.class, method="insertSelective")
    int insertSelective(BotanyInfo record);

    @Select({
        "select",
        "id, germ_id, slightly_color, slightly_internode_len, slightly_fuzz, slightly_lenticel_num, ",
        "slightly_lenticel_size, slightly_lenticel_shape, branch_color, branch_lenticel_num, ",
        "branch_lenticel_size, branch_lenticel_shape, bud_shape, bud_size, bud_color, ",
        "bud_insertion_type, flower_bud_shape, flower_bud_size, flower_bud_color, flower_bud_insertion_type, ",
        "leaf_shape, leaf_length, leaf_width, leaf_opex, leaf_base, leaf_color, leaf_flat_degree, ",
        "leaf_sawtooth_size, leaf_sawtooth_shape, leaf_sawtooth_needle, leaf_sawtooth_flatness, ",
        "leaf_fuzz, leafstalk_length, leafstalk_thickness, leafstalk_fuzz, stipule, inflorescence, ",
        "bloom_per_inflore, alabastrum_color, petal_num, petal_color, petal_shape, corolla_diameter, ",
        "pedicel_length, pedicel_fuzz, stamen_num, pistil_num, anther_color, pistil_height",
        "from botany_info",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="germ_id", property="germId", jdbcType=JdbcType.CHAR),
        @Result(column="slightly_color", property="slightlyColor", jdbcType=JdbcType.VARCHAR),
        @Result(column="slightly_internode_len", property="slightlyInternodeLen", jdbcType=JdbcType.DECIMAL),
        @Result(column="slightly_fuzz", property="slightlyFuzz", jdbcType=JdbcType.VARCHAR),
        @Result(column="slightly_lenticel_num", property="slightlyLenticelNum", jdbcType=JdbcType.VARCHAR),
        @Result(column="slightly_lenticel_size", property="slightlyLenticelSize", jdbcType=JdbcType.VARCHAR),
        @Result(column="slightly_lenticel_shape", property="slightlyLenticelShape", jdbcType=JdbcType.VARCHAR),
        @Result(column="branch_color", property="branchColor", jdbcType=JdbcType.VARCHAR),
        @Result(column="branch_lenticel_num", property="branchLenticelNum", jdbcType=JdbcType.VARCHAR),
        @Result(column="branch_lenticel_size", property="branchLenticelSize", jdbcType=JdbcType.VARCHAR),
        @Result(column="branch_lenticel_shape", property="branchLenticelShape", jdbcType=JdbcType.VARCHAR),
        @Result(column="bud_shape", property="budShape", jdbcType=JdbcType.VARCHAR),
        @Result(column="bud_size", property="budSize", jdbcType=JdbcType.VARCHAR),
        @Result(column="bud_color", property="budColor", jdbcType=JdbcType.VARCHAR),
        @Result(column="bud_insertion_type", property="budInsertionType", jdbcType=JdbcType.VARCHAR),
        @Result(column="flower_bud_shape", property="flowerBudShape", jdbcType=JdbcType.VARCHAR),
        @Result(column="flower_bud_size", property="flowerBudSize", jdbcType=JdbcType.VARCHAR),
        @Result(column="flower_bud_color", property="flowerBudColor", jdbcType=JdbcType.VARCHAR),
        @Result(column="flower_bud_insertion_type", property="flowerBudInsertionType", jdbcType=JdbcType.VARCHAR),
        @Result(column="leaf_shape", property="leafShape", jdbcType=JdbcType.VARCHAR),
        @Result(column="leaf_length", property="leafLength", jdbcType=JdbcType.DECIMAL),
        @Result(column="leaf_width", property="leafWidth", jdbcType=JdbcType.DECIMAL),
        @Result(column="leaf_opex", property="leafOpex", jdbcType=JdbcType.VARCHAR),
        @Result(column="leaf_base", property="leafBase", jdbcType=JdbcType.VARCHAR),
        @Result(column="leaf_color", property="leafColor", jdbcType=JdbcType.VARCHAR),
        @Result(column="leaf_flat_degree", property="leafFlatDegree", jdbcType=JdbcType.VARCHAR),
        @Result(column="leaf_sawtooth_size", property="leafSawtoothSize", jdbcType=JdbcType.VARCHAR),
        @Result(column="leaf_sawtooth_shape", property="leafSawtoothShape", jdbcType=JdbcType.VARCHAR),
        @Result(column="leaf_sawtooth_needle", property="leafSawtoothNeedle", jdbcType=JdbcType.VARCHAR),
        @Result(column="leaf_sawtooth_flatness", property="leafSawtoothFlatness", jdbcType=JdbcType.VARCHAR),
        @Result(column="leaf_fuzz", property="leafFuzz", jdbcType=JdbcType.VARCHAR),
        @Result(column="leafstalk_length", property="leafstalkLength", jdbcType=JdbcType.DECIMAL),
        @Result(column="leafstalk_thickness", property="leafstalkThickness", jdbcType=JdbcType.DECIMAL),
        @Result(column="leafstalk_fuzz", property="leafstalkFuzz", jdbcType=JdbcType.VARCHAR),
        @Result(column="stipule", property="stipule", jdbcType=JdbcType.VARCHAR),
        @Result(column="inflorescence", property="inflorescence", jdbcType=JdbcType.VARCHAR),
        @Result(column="bloom_per_inflore", property="bloomPerInflore", jdbcType=JdbcType.INTEGER),
        @Result(column="alabastrum_color", property="alabastrumColor", jdbcType=JdbcType.VARCHAR),
        @Result(column="petal_num", property="petalNum", jdbcType=JdbcType.INTEGER),
        @Result(column="petal_color", property="petalColor", jdbcType=JdbcType.VARCHAR),
        @Result(column="petal_shape", property="petalShape", jdbcType=JdbcType.VARCHAR),
        @Result(column="corolla_diameter", property="corollaDiameter", jdbcType=JdbcType.DECIMAL),
        @Result(column="pedicel_length", property="pedicelLength", jdbcType=JdbcType.DECIMAL),
        @Result(column="pedicel_fuzz", property="pedicelFuzz", jdbcType=JdbcType.VARCHAR),
        @Result(column="stamen_num", property="stamenNum", jdbcType=JdbcType.VARCHAR),
        @Result(column="pistil_num", property="pistilNum", jdbcType=JdbcType.INTEGER),
        @Result(column="anther_color", property="antherColor", jdbcType=JdbcType.VARCHAR),
        @Result(column="pistil_height", property="pistilHeight", jdbcType=JdbcType.VARCHAR)
    })
    BotanyInfo selectByPrimaryKey(Integer id);

    @UpdateProvider(type=BotanyInfoSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(BotanyInfo record);

    @Update({
        "update botany_info",
        "set germ_id = #{germId,jdbcType=CHAR},",
          "slightly_color = #{slightlyColor,jdbcType=VARCHAR},",
          "slightly_internode_len = #{slightlyInternodeLen,jdbcType=DECIMAL},",
          "slightly_fuzz = #{slightlyFuzz,jdbcType=VARCHAR},",
          "slightly_lenticel_num = #{slightlyLenticelNum,jdbcType=VARCHAR},",
          "slightly_lenticel_size = #{slightlyLenticelSize,jdbcType=VARCHAR},",
          "slightly_lenticel_shape = #{slightlyLenticelShape,jdbcType=VARCHAR},",
          "branch_color = #{branchColor,jdbcType=VARCHAR},",
          "branch_lenticel_num = #{branchLenticelNum,jdbcType=VARCHAR},",
          "branch_lenticel_size = #{branchLenticelSize,jdbcType=VARCHAR},",
          "branch_lenticel_shape = #{branchLenticelShape,jdbcType=VARCHAR},",
          "bud_shape = #{budShape,jdbcType=VARCHAR},",
          "bud_size = #{budSize,jdbcType=VARCHAR},",
          "bud_color = #{budColor,jdbcType=VARCHAR},",
          "bud_insertion_type = #{budInsertionType,jdbcType=VARCHAR},",
          "flower_bud_shape = #{flowerBudShape,jdbcType=VARCHAR},",
          "flower_bud_size = #{flowerBudSize,jdbcType=VARCHAR},",
          "flower_bud_color = #{flowerBudColor,jdbcType=VARCHAR},",
          "flower_bud_insertion_type = #{flowerBudInsertionType,jdbcType=VARCHAR},",
          "leaf_shape = #{leafShape,jdbcType=VARCHAR},",
          "leaf_length = #{leafLength,jdbcType=DECIMAL},",
          "leaf_width = #{leafWidth,jdbcType=DECIMAL},",
          "leaf_opex = #{leafOpex,jdbcType=VARCHAR},",
          "leaf_base = #{leafBase,jdbcType=VARCHAR},",
          "leaf_color = #{leafColor,jdbcType=VARCHAR},",
          "leaf_flat_degree = #{leafFlatDegree,jdbcType=VARCHAR},",
          "leaf_sawtooth_size = #{leafSawtoothSize,jdbcType=VARCHAR},",
          "leaf_sawtooth_shape = #{leafSawtoothShape,jdbcType=VARCHAR},",
          "leaf_sawtooth_needle = #{leafSawtoothNeedle,jdbcType=VARCHAR},",
          "leaf_sawtooth_flatness = #{leafSawtoothFlatness,jdbcType=VARCHAR},",
          "leaf_fuzz = #{leafFuzz,jdbcType=VARCHAR},",
          "leafstalk_length = #{leafstalkLength,jdbcType=DECIMAL},",
          "leafstalk_thickness = #{leafstalkThickness,jdbcType=DECIMAL},",
          "leafstalk_fuzz = #{leafstalkFuzz,jdbcType=VARCHAR},",
          "stipule = #{stipule,jdbcType=VARCHAR},",
          "inflorescence = #{inflorescence,jdbcType=VARCHAR},",
          "bloom_per_inflore = #{bloomPerInflore,jdbcType=INTEGER},",
          "alabastrum_color = #{alabastrumColor,jdbcType=VARCHAR},",
          "petal_num = #{petalNum,jdbcType=INTEGER},",
          "petal_color = #{petalColor,jdbcType=VARCHAR},",
          "petal_shape = #{petalShape,jdbcType=VARCHAR},",
          "corolla_diameter = #{corollaDiameter,jdbcType=DECIMAL},",
          "pedicel_length = #{pedicelLength,jdbcType=DECIMAL},",
          "pedicel_fuzz = #{pedicelFuzz,jdbcType=VARCHAR},",
          "stamen_num = #{stamenNum,jdbcType=VARCHAR},",
          "pistil_num = #{pistilNum,jdbcType=INTEGER},",
          "anther_color = #{antherColor,jdbcType=VARCHAR},",
          "pistil_height = #{pistilHeight,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(BotanyInfo record);
}