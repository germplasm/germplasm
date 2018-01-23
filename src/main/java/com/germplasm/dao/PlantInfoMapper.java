package com.germplasm.dao;

import com.germplasm.model.PlantInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface PlantInfoMapper {
    @Delete({
        "delete from plant_info",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into plant_info (id, germ_id, ",
        "breed_way, tree_vigor, ",
        "root_stock, tree_pose, ",
        "tree_height, tree_shape, ",
        "crown_diameter, pole_height, ",
        "branch_num, pole_perimeter)",
        "values (#{id,jdbcType=INTEGER}, #{germId,jdbcType=CHAR}, ",
        "#{breedWay,jdbcType=VARCHAR}, #{treeVigor,jdbcType=VARCHAR}, ",
        "#{rootStock,jdbcType=VARCHAR}, #{treePose,jdbcType=VARCHAR}, ",
        "#{treeHeight,jdbcType=DECIMAL}, #{treeShape,jdbcType=VARCHAR}, ",
        "#{crownDiameter,jdbcType=DECIMAL}, #{poleHeight,jdbcType=DECIMAL}, ",
        "#{branchNum,jdbcType=INTEGER}, #{polePerimeter,jdbcType=DECIMAL})"
    })
    int insert(PlantInfo record);

    @InsertProvider(type=PlantInfoSqlProvider.class, method="insertSelective")
    int insertSelective(PlantInfo record);

    @Select({
        "select",
        "id, germ_id, breed_way, tree_vigor, root_stock, tree_pose, tree_height, tree_shape, ",
        "crown_diameter, pole_height, branch_num, pole_perimeter",
        "from plant_info",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="germ_id", property="germId", jdbcType=JdbcType.CHAR),
        @Result(column="breed_way", property="breedWay", jdbcType=JdbcType.VARCHAR),
        @Result(column="tree_vigor", property="treeVigor", jdbcType=JdbcType.VARCHAR),
        @Result(column="root_stock", property="rootStock", jdbcType=JdbcType.VARCHAR),
        @Result(column="tree_pose", property="treePose", jdbcType=JdbcType.VARCHAR),
        @Result(column="tree_height", property="treeHeight", jdbcType=JdbcType.DECIMAL),
        @Result(column="tree_shape", property="treeShape", jdbcType=JdbcType.VARCHAR),
        @Result(column="crown_diameter", property="crownDiameter", jdbcType=JdbcType.DECIMAL),
        @Result(column="pole_height", property="poleHeight", jdbcType=JdbcType.DECIMAL),
        @Result(column="branch_num", property="branchNum", jdbcType=JdbcType.INTEGER),
        @Result(column="pole_perimeter", property="polePerimeter", jdbcType=JdbcType.DECIMAL)
    })
    PlantInfo selectByPrimaryKey(Integer id);

    @UpdateProvider(type=PlantInfoSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(PlantInfo record);

    @Update({
        "update plant_info",
        "set germ_id = #{germId,jdbcType=CHAR},",
          "breed_way = #{breedWay,jdbcType=VARCHAR},",
          "tree_vigor = #{treeVigor,jdbcType=VARCHAR},",
          "root_stock = #{rootStock,jdbcType=VARCHAR},",
          "tree_pose = #{treePose,jdbcType=VARCHAR},",
          "tree_height = #{treeHeight,jdbcType=DECIMAL},",
          "tree_shape = #{treeShape,jdbcType=VARCHAR},",
          "crown_diameter = #{crownDiameter,jdbcType=DECIMAL},",
          "pole_height = #{poleHeight,jdbcType=DECIMAL},",
          "branch_num = #{branchNum,jdbcType=INTEGER},",
          "pole_perimeter = #{polePerimeter,jdbcType=DECIMAL}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(PlantInfo record);
}