package com.fly.mapper;

import com.fly.pojo.FlyPost;
import com.fly.pojo.FlyPostExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FlyPostMapper {
    int countByExample(FlyPostExample example);

    int deleteByExample(FlyPostExample example);

    int deleteByPrimaryKey(String id);

    int insert(FlyPost record);

    int insertSelective(FlyPost record);

    List<FlyPost> selectByExampleWithBLOBs(FlyPostExample example);

    List<FlyPost> selectByExample(FlyPostExample example);

    FlyPost selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") FlyPost record, @Param("example") FlyPostExample example);

    int updateByExampleWithBLOBs(@Param("record") FlyPost record, @Param("example") FlyPostExample example);

    int updateByExample(@Param("record") FlyPost record, @Param("example") FlyPostExample example);

    int updateByPrimaryKeySelective(FlyPost record);

    int updateByPrimaryKeyWithBLOBs(FlyPost record);

    int updateByPrimaryKey(FlyPost record);
}