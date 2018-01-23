package com.germplasm.dao;

import com.germplasm.model.Role;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Component;

import java.util.List;
@Mapper
@Component(value = "roleMapper")
public interface RoleMapper {
    @Delete({
        "delete from role",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into role (id, role_name, ",
        "level, descript)",
        "values (#{id,jdbcType=INTEGER}, #{roleName,jdbcType=CHAR}, ",
        "#{level,jdbcType=CHAR}, #{descript,jdbcType=VARCHAR})"
    })
    int insert(Role record);

    @InsertProvider(type=RoleSqlProvider.class, method="insertSelective")
    int insertSelective(Role record);

    @Select({
        "select",
        "id, role_name, level, descript",
        "from role",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="role_name", property="roleName", jdbcType=JdbcType.CHAR),
        @Result(column="level", property="level", jdbcType=JdbcType.CHAR),
    @Result(column="descript", property="descript", jdbcType=JdbcType.VARCHAR)
})
    Role selectByPrimaryKey(Integer id);

    @UpdateProvider(type=RoleSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Role record);

    @Update({
        "update role",
        "set role_name = #{roleName,jdbcType=CHAR},",
          "level = #{level,jdbcType=CHAR},",
          "descript = #{descript,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Role record);

    /**
     * 查询所有角色
     */
    @Select("select * from role")
    @Results({
            @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="role_name", property="roleName", jdbcType=JdbcType.CHAR),
            @Result(column="level", property="level", jdbcType=JdbcType.CHAR),
            @Result(column="descript", property="descript", jdbcType=JdbcType.VARCHAR)
    })
    List<Role> getAllRoles();

    /**
     * 查找角色描述
     * @param roleId
     * @return
     */
    @Select("select descript from role where id = #{roleId}")
    String getRoleDesc(Integer roleId);










}