package com.dhy.yycompany.lock.dao;

import com.dhy.yycompany.lock.bean.FingerPrint;
import com.dhy.yycompany.lock.bean.FingerPrintExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FingerPrintMapper {
    long countByExample(FingerPrintExample example);

    int deleteByExample(FingerPrintExample example);

    int deleteByPrimaryKey(Integer fId);

    int insert(FingerPrint record);

    int insertSelective(FingerPrint record);

    List<FingerPrint> selectByExample(FingerPrintExample example);

    FingerPrint selectByPrimaryKey(Integer fId);

    int updateByExampleSelective(@Param("record") FingerPrint record, @Param("example") FingerPrintExample example);

    int updateByExample(@Param("record") FingerPrint record, @Param("example") FingerPrintExample example);

    int updateByPrimaryKeySelective(FingerPrint record);

    int updateByPrimaryKey(FingerPrint record);
}