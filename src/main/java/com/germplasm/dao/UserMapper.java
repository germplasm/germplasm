package com.germplasm.dao;

import com.germplasm.model.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component(value = "userMapper")
public interface UserMapper {
    @Delete({
        "delete from user",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into user (id, loginName, ",
        "passwd, unite, role_id, ",
        "unite_id)",
        "values (#{id,jdbcType=INTEGER}, #{loginname,jdbcType=VARCHAR}, ",
        "#{passwd,jdbcType=VARCHAR}, #{unite,jdbcType=VARCHAR}, #{roleId,jdbcType=INTEGER}, ",
        "#{uniteId,jdbcType=CHAR})"
    })
    int insert(User record);

    @InsertProvider(type=UserSqlProvider.class, method="insertSelective")
    int insertSelective(User record);

    @Select({
        "select",
        "id, loginName, passwd, unite, role_id, unite_id",
        "from user",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="loginName", property="loginname", jdbcType=JdbcType.VARCHAR),
        @Result(column="passwd", property="passwd", jdbcType=JdbcType.VARCHAR),
        @Result(column="unite", property="unite", jdbcType=JdbcType.VARCHAR),
        @Result(column="role_id", property="roleId", jdbcType=JdbcType.INTEGER),
        @Result(column="unite_id", property="uniteId", jdbcType=JdbcType.CHAR)
    })
    User selectByPrimaryKey(Integer id);

    @UpdateProvider(type=UserSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(User record);

    @Update({
        "update user",
        "set loginName = #{loginname,jdbcType=VARCHAR},",
          "passwd = #{passwd,jdbcType=VARCHAR},",
          "unite = #{unite,jdbcType=VARCHAR},",
          "role_id = #{roleId,jdbcType=INTEGER},",
          "unite_id = #{uniteId,jdbcType=CHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(User record);

    @Select("select * from user")
    @Results({
            @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="loginName", property="loginname", jdbcType=JdbcType.VARCHAR),
            @Result(column="passwd", property="passwd", jdbcType=JdbcType.VARCHAR),
            @Result(column="unite", property="unite", jdbcType=JdbcType.VARCHAR),
            @Result(column="role_id", property="roleId", jdbcType=JdbcType.INTEGER),
            @Result(column="unite_id", property="uniteId", jdbcType=JdbcType.CHAR)
    })
    List<User> getAllUsers();

}