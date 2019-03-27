package com.dhy.yycompany.lock.dao;

import com.dhy.yycompany.lock.bean.LockInfo;
import com.dhy.yycompany.lock.bean.LockInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LockInfoMapper {
    long countByExample(LockInfoExample example);

    int deleteByExample(LockInfoExample example);

    int deleteByPrimaryKey(Integer lId);

    int insert(LockInfo record);

    int insertSelective(LockInfo record);

    List<LockInfo> selectByExample(LockInfoExample example);

    LockInfo selectByPrimaryKey(Integer lId);

    int updateByExampleSelective(@Param("record") LockInfo record, @Param("example") LockInfoExample example);

    int updateByExample(@Param("record") LockInfo record, @Param("example") LockInfoExample example);

    int updateByPrimaryKeySelective(LockInfo record);

    int updateByPrimaryKey(LockInfo record);
}