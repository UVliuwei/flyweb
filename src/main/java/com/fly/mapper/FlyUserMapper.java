package com.fly.mapper;

import com.fly.pojo.FlyUser;
import com.fly.pojo.FlyUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FlyUserMapper {
    int countByExample(FlyUserExample example);

    int deleteByExample(FlyUserExample example);

    int deleteByPrimaryKey(String id);

    int insert(FlyUser record);

    int insertSelective(FlyUser record);

    List<FlyUser> selectByExampleWithBLOBs(FlyUserExample example);

    List<FlyUser> selectByExample(FlyUserExample example);

    FlyUser selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") FlyUser record, @Param("example") FlyUserExample example);

    int updateByExampleWithBLOBs(@Param("record") FlyUser record, @Param("example") FlyUserExample example);

    int updateByExample(@Param("record") FlyUser record, @Param("example") FlyUserExample example);

    int updateByPrimaryKeySelective(FlyUser record);

    int updateByPrimaryKeyWithBLOBs(FlyUser record);

    int updateByPrimaryKey(FlyUser record);
}