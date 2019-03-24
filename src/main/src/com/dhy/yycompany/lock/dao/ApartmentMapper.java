package com.dhy.yycompany.lock.dao;

import com.dhy.yycompany.lock.bean.Apartment;
import com.dhy.yycompany.lock.bean.ApartmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApartmentMapper {
    long countByExample(ApartmentExample example);

    int deleteByExample(ApartmentExample example);

    int deleteByPrimaryKey(Integer aId);

    int insert(Apartment record);

    int insertSelective(Apartment record);

    List<Apartment> selectByExample(ApartmentExample example);

    Apartment selectByPrimaryKey(Integer aId);

    int updateByExampleSelective(@Param("record") Apartment record, @Param("example") ApartmentExample example);

    int updateByExample(@Param("record") Apartment record, @Param("example") ApartmentExample example);

    int updateByPrimaryKeySelective(Apartment record);

    int updateByPrimaryKey(Apartment record);
}