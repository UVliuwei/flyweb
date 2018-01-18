package com.fly.mapper;

import com.fly.pojo.FlyReply;
import com.fly.pojo.FlyReplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FlyReplyMapper {
    int countByExample(FlyReplyExample example);

    int deleteByExample(FlyReplyExample example);

    int deleteByPrimaryKey(String id);

    int insert(FlyReply record);

    int insertSelective(FlyReply record);

    List<FlyReply> selectByExample(FlyReplyExample example);

    FlyReply selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") FlyReply record, @Param("example") FlyReplyExample example);

    int updateByExample(@Param("record") FlyReply record, @Param("example") FlyReplyExample example);

    int updateByPrimaryKeySelective(FlyReply record);

    int updateByPrimaryKey(FlyReply record);
}