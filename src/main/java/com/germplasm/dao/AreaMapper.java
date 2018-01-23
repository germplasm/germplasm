package com.germplasm.dao;

import com.germplasm.model.Area;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Component;

@Mapper
@Component(value = "areaMapper")
public interface AreaMapper {
    @Delete({
        "delete from area",
        "where id = #{id,jdbcType=CHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into area (id, name, parent_id, ",
        "level)",
        "values (#{id,jdbcType=CHAR}, #{name,jdbcType=VARCHAR}, #{parentId,jdbcType=CHAR}, ",
        "#{level,jdbcType=CHAR})"
    })
    int insert(Area record);

    @InsertProvider(type=AreaSqlProvider.class, method="insertSelective")
    int insertSelective(Area record);

    @Select({
        "select",
        "id, name, parent_id, level",
        "from area",
        "where id = #{id,jdbcType=CHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="parent_id", property="parentId", jdbcType=JdbcType.CHAR),
        @Result(column="level", property="level", jdbcType=JdbcType.CHAR)
    })
    Area selectByPrimaryKey(String id);

    @UpdateProvider(type=AreaSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Area record);

    @Update({
        "update area",
        "set name = #{name,jdbcType=VARCHAR},",
          "parent_id = #{parentId,jdbcType=CHAR},",
          "level = #{level,jdbcType=CHAR}",
        "where id = #{id,jdbcType=CHAR}"
    })
    int updateByPrimaryKey(Area record);

    /**
     * 查找所属地
     * @param uniteId
     * @return
     */
    @Select("select name from area where id = #{uniteId}")
    String getAreaName(String uniteId);

}