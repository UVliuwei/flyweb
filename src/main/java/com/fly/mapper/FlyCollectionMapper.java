package com.fly.mapper;

import com.fly.pojo.FlyCollection;
import com.fly.pojo.FlyCollectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FlyCollectionMapper {
    int countByExample(FlyCollectionExample example);

    int deleteByExample(FlyCollectionExample example);

    int deleteByPrimaryKey(String id);

    int insert(FlyCollection record);

    int insertSelective(FlyCollection record);

    List<FlyCollection> selectByExample(FlyCollectionExample example);

    FlyCollection selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") FlyCollection record, @Param("example") FlyCollectionExample example);

    int updateByExample(@Param("record") FlyCollection record, @Param("example") FlyCollectionExample example);

    int updateByPrimaryKeySelective(FlyCollection record);

    int updateByPrimaryKey(FlyCollection record);
}