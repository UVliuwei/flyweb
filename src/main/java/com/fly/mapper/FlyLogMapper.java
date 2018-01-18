package com.fly.mapper;

import com.fly.pojo.FlyLog;
import com.fly.pojo.FlyLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FlyLogMapper {
    int countByExample(FlyLogExample example);

    int deleteByExample(FlyLogExample example);

    int deleteByPrimaryKey(String id);

    int insert(FlyLog record);

    int insertSelective(FlyLog record);

    List<FlyLog> selectByExample(FlyLogExample example);

    FlyLog selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") FlyLog record, @Param("example") FlyLogExample example);

    int updateByExample(@Param("record") FlyLog record, @Param("example") FlyLogExample example);

    int updateByPrimaryKeySelective(FlyLog record);

    int updateByPrimaryKey(FlyLog record);
}