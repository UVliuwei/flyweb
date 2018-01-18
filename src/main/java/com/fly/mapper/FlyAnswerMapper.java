package com.fly.mapper;

import com.fly.pojo.FlyAnswer;
import com.fly.pojo.FlyAnswerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FlyAnswerMapper {
    int countByExample(FlyAnswerExample example);

    int deleteByExample(FlyAnswerExample example);

    int deleteByPrimaryKey(String id);

    int insert(FlyAnswer record);

    int insertSelective(FlyAnswer record);

    List<FlyAnswer> selectByExampleWithBLOBs(FlyAnswerExample example);

    List<FlyAnswer> selectByExample(FlyAnswerExample example);

    FlyAnswer selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") FlyAnswer record, @Param("example") FlyAnswerExample example);

    int updateByExampleWithBLOBs(@Param("record") FlyAnswer record, @Param("example") FlyAnswerExample example);

    int updateByExample(@Param("record") FlyAnswer record, @Param("example") FlyAnswerExample example);

    int updateByPrimaryKeySelective(FlyAnswer record);

    int updateByPrimaryKeyWithBLOBs(FlyAnswer record);

    int updateByPrimaryKey(FlyAnswer record);
}