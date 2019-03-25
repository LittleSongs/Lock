package com.dhy.yycompany.lock.dao;

import com.dhy.yycompany.lock.bean.VRoomUserLock;
import com.dhy.yycompany.lock.bean.VRoomUserLockExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VRoomUserLockMapper {
    long countByExample(VRoomUserLockExample example);

    int deleteByExample(VRoomUserLockExample example);

    int insert(VRoomUserLock record);

    int insertSelective(VRoomUserLock record);

    List<VRoomUserLock> selectByExample(VRoomUserLockExample example);

    int updateByExampleSelective(@Param("record") VRoomUserLock record, @Param("example") VRoomUserLockExample example);

    int updateByExample(@Param("record") VRoomUserLock record, @Param("example") VRoomUserLockExample example);
}