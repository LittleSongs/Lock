package com.dhy.yycompany.lock.dao;

import com.dhy.yycompany.lock.bean.VKeyUsername;
import com.dhy.yycompany.lock.bean.VKeyUsernameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VKeyUsernameMapper {
    long countByExample(VKeyUsernameExample example);

    int deleteByExample(VKeyUsernameExample example);

    int insert(VKeyUsername record);

    int insertSelective(VKeyUsername record);

    List<VKeyUsername> selectByExample(VKeyUsernameExample example);

    int updateByExampleSelective(@Param("record") VKeyUsername record, @Param("example") VKeyUsernameExample example);

    int updateByExample(@Param("record") VKeyUsername record, @Param("example") VKeyUsernameExample example);
}