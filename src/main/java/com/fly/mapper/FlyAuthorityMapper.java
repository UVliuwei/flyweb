package com.fly.mapper;

import com.fly.pojo.FlyAuthority;
import com.fly.pojo.FlyAuthorityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FlyAuthorityMapper {
    int countByExample(FlyAuthorityExample example);

    int deleteByExample(FlyAuthorityExample example);

    int deleteByPrimaryKey(String id);

    int insert(FlyAuthority record);

    int insertSelective(FlyAuthority record);

    List<FlyAuthority> selectByExample(FlyAuthorityExample example);

    FlyAuthority selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") FlyAuthority record, @Param("example") FlyAuthorityExample example);

    int updateByExample(@Param("record") FlyAuthority record, @Param("example") FlyAuthorityExample example);

    int updateByPrimaryKeySelective(FlyAuthority record);

    int updateByPrimaryKey(FlyAuthority record);
}