package com.dhy.yycompany.lock.dao;

import com.dhy.yycompany.lock.bean.VDailyUserInfo;
import com.dhy.yycompany.lock.bean.VDailyUserInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VDailyUserInfoMapper {
    long countByExample(VDailyUserInfoExample example);

    int deleteByExample(VDailyUserInfoExample example);

    int insert(VDailyUserInfo record);

    int insertSelective(VDailyUserInfo record);

    List<VDailyUserInfo> selectByExample(VDailyUserInfoExample example);

    int updateByExampleSelective(@Param("record") VDailyUserInfo record, @Param("example") VDailyUserInfoExample example);

    int updateByExample(@Param("record") VDailyUserInfo record, @Param("example") VDailyUserInfoExample example);
}