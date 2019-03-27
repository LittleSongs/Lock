package com.dhy.yycompany.lock.dao;

import com.dhy.yycompany.lock.bean.KeyInfo;
import com.dhy.yycompany.lock.bean.KeyInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KeyInfoMapper {
    long countByExample(KeyInfoExample example);

    int deleteByExample(KeyInfoExample example);

    int deleteByPrimaryKey(Integer kId);

    int insert(KeyInfo record);

    int insertSelective(KeyInfo record);

    List<KeyInfo> selectByExample(KeyInfoExample example);

    KeyInfo selectByPrimaryKey(Integer kId);

    int updateByExampleSelective(@Param("record") KeyInfo record, @Param("example") KeyInfoExample example);

    int updateByExample(@Param("record") KeyInfo record, @Param("example") KeyInfoExample example);

    int updateByPrimaryKeySelective(KeyInfo record);

    int updateByPrimaryKey(KeyInfo record);
}