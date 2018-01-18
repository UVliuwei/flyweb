package com.fly.mapper;

import com.fly.pojo.FlySign;
import com.fly.pojo.FlySignExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FlySignMapper {
    int countByExample(FlySignExample example);

    int deleteByExample(FlySignExample example);

    int deleteByPrimaryKey(String id);

    int insert(FlySign record);

    int insertSelective(FlySign record);

    List<FlySign> selectByExample(FlySignExample example);

    FlySign selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") FlySign record, @Param("example") FlySignExample example);

    int updateByExample(@Param("record") FlySign record, @Param("example") FlySignExample example);

    int updateByPrimaryKeySelective(FlySign record);

    int updateByPrimaryKey(FlySign record);
}