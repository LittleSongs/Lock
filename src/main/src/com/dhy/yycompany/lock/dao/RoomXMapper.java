package com.dhy.yycompany.lock.dao;

import com.dhy.yycompany.lock.bean.RoomX;
import com.dhy.yycompany.lock.bean.RoomXExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoomXMapper {
    long countByExample(RoomXExample example);

    int deleteByExample(RoomXExample example);

    int insert(RoomX record);

    int insertSelective(RoomX record);

    List<RoomX> selectByExample(RoomXExample example);

    int updateByExampleSelective(@Param("record") RoomX record, @Param("example") RoomXExample example);

    int updateByExample(@Param("record") RoomX record, @Param("example") RoomXExample example);
}