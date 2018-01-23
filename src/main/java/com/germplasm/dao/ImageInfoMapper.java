package com.germplasm.dao;

import com.germplasm.model.ImageInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface ImageInfoMapper {
    @Delete({
        "delete from image_info",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into image_info (id, germ_id, ",
        "img_date, classify, ordernum, ",
        "filename, desript)",
        "values (#{id,jdbcType=INTEGER}, #{germId,jdbcType=CHAR}, ",
        "#{imgDate,jdbcType=DATE}, #{classify,jdbcType=CHAR}, #{ordernum,jdbcType=CHAR}, ",
        "#{filename,jdbcType=VARCHAR}, #{desript,jdbcType=VARCHAR})"
    })
    int insert(ImageInfo record);

    @InsertProvider(type=ImageInfoSqlProvider.class, method="insertSelective")
    int insertSelective(ImageInfo record);

    @Select({
        "select",
        "id, germ_id, img_date, classify, ordernum, filename, desript",
        "from image_info",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="germ_id", property="germId", jdbcType=JdbcType.CHAR),
        @Result(column="img_date", property="imgDate", jdbcType=JdbcType.DATE),
        @Result(column="classify", property="classify", jdbcType=JdbcType.CHAR),
        @Result(column="ordernum", property="ordernum", jdbcType=JdbcType.CHAR),
        @Result(column="filename", property="filename", jdbcType=JdbcType.VARCHAR),
        @Result(column="desript", property="desript", jdbcType=JdbcType.VARCHAR)
    })
    ImageInfo selectByPrimaryKey(Integer id);

    @UpdateProvider(type=ImageInfoSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(ImageInfo record);

    @Update({
        "update image_info",
        "set germ_id = #{germId,jdbcType=CHAR},",
          "img_date = #{imgDate,jdbcType=DATE},",
          "classify = #{classify,jdbcType=CHAR},",
          "ordernum = #{ordernum,jdbcType=CHAR},",
          "filename = #{filename,jdbcType=VARCHAR},",
          "desript = #{desript,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(ImageInfo record);
}