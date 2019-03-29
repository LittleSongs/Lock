package com.dhy.yycompany.lock.dao;

import com.dhy.yycompany.lock.bean.KeyAndAdmin;
import com.dhy.yycompany.lock.bean.KeyAndAdminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KeyAndAdminMapper {
    long countByExample(KeyAndAdminExample example);

    int deleteByExample(KeyAndAdminExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(KeyAndAdmin record);

    int insertSelective(KeyAndAdmin record);

    List<KeyAndAdmin> selectByExample(KeyAndAdminExample example);

    KeyAndAdmin selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") KeyAndAdmin record, @Param("example") KeyAndAdminExample example);

    int updateByExample(@Param("record") KeyAndAdmin record, @Param("example") KeyAndAdminExample example);

    int updateByPrimaryKeySelective(KeyAndAdmin record);

    int updateByPrimaryKey(KeyAndAdmin record);
}