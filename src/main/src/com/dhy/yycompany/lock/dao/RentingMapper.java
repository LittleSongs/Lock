package com.dhy.yycompany.lock.dao;

import com.dhy.yycompany.lock.bean.Renting;
import com.dhy.yycompany.lock.bean.RentingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RentingMapper {
    long countByExample(RentingExample example);

    int deleteByExample(RentingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Renting record);

    int insertSelective(Renting record);

    List<Renting> selectByExample(RentingExample example);

    Renting selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Renting record, @Param("example") RentingExample example);

    int updateByExample(@Param("record") Renting record, @Param("example") RentingExample example);

    int updateByPrimaryKeySelective(Renting record);

    int updateByPrimaryKey(Renting record);
}