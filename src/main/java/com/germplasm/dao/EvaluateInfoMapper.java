package com.germplasm.dao;

import com.germplasm.model.EvaluateInfo;
import com.germplasm.model.EvaluateInfoWithBLOBs;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface EvaluateInfoMapper {
    @Delete({
        "delete from evaluate_info",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into evaluate_info (id, germ_id, ",
        "advantage, disadvantage, ",
        "utility)",
        "values (#{id,jdbcType=INTEGER}, #{germId,jdbcType=CHAR}, ",
        "#{advantage,jdbcType=LONGVARCHAR}, #{disadvantage,jdbcType=LONGVARCHAR}, ",
        "#{utility,jdbcType=LONGVARCHAR})"
    })
    int insert(EvaluateInfoWithBLOBs record);

    @InsertProvider(type=EvaluateInfoSqlProvider.class, method="insertSelective")
    int insertSelective(EvaluateInfoWithBLOBs record);

    @Select({
        "select",
        "id, germ_id, advantage, disadvantage, utility",
        "from evaluate_info",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="germ_id", property="germId", jdbcType=JdbcType.CHAR),
        @Result(column="advantage", property="advantage", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="disadvantage", property="disadvantage", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="utility", property="utility", jdbcType=JdbcType.LONGVARCHAR)
    })
    EvaluateInfoWithBLOBs selectByPrimaryKey(Integer id);

    @UpdateProvider(type=EvaluateInfoSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(EvaluateInfoWithBLOBs record);

    @Update({
        "update evaluate_info",
        "set germ_id = #{germId,jdbcType=CHAR},",
          "advantage = #{advantage,jdbcType=LONGVARCHAR},",
          "disadvantage = #{disadvantage,jdbcType=LONGVARCHAR},",
          "utility = #{utility,jdbcType=LONGVARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKeyWithBLOBs(EvaluateInfoWithBLOBs record);

    @Update({
        "update evaluate_info",
        "set germ_id = #{germId,jdbcType=CHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(EvaluateInfo record);
}