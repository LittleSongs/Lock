package com.dhy.yycompany.lock.dao;

import com.dhy.yycompany.lock.bean.PhoneUserInfo;
import com.dhy.yycompany.lock.bean.PhoneUserInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PhoneUserInfoMapper {
    long countByExample(PhoneUserInfoExample example);

    int deleteByExample(PhoneUserInfoExample example);

    int deleteByPrimaryKey(Integer pId);

    int insert(PhoneUserInfo record);

    int insertSelective(PhoneUserInfo record);

    List<PhoneUserInfo> selectByExample(PhoneUserInfoExample example);

    PhoneUserInfo selectByPrimaryKey(Integer pId);

    int updateByExampleSelective(@Param("record") PhoneUserInfo record, @Param("example") PhoneUserInfoExample example);

    int updateByExample(@Param("record") PhoneUserInfo record, @Param("example") PhoneUserInfoExample example);

    int updateByPrimaryKeySelective(PhoneUserInfo record);

    int updateByPrimaryKey(PhoneUserInfo record);
}