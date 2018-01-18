package com.fly.mapper;

import com.fly.pojo.FlyRole;
import com.fly.pojo.FlyRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FlyRoleMapper {
    int countByExample(FlyRoleExample example);

    int deleteByExample(FlyRoleExample example);

    int deleteByPrimaryKey(String id);

    int insert(FlyRole record);

    int insertSelective(FlyRole record);

    List<FlyRole> selectByExample(FlyRoleExample example);

    FlyRole selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") FlyRole record, @Param("example") FlyRoleExample example);

    int updateByExample(@Param("record") FlyRole record, @Param("example") FlyRoleExample example);

    int updateByPrimaryKeySelective(FlyRole record);

    int updateByPrimaryKey(FlyRole record);
}