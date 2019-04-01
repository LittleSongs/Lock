package com.dhy.yycompany.lock.dao;

import com.dhy.yycompany.lock.bean.Instruction;
import com.dhy.yycompany.lock.bean.InstructionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InstructionMapper {
    long countByExample(InstructionExample example);

    int deleteByExample(InstructionExample example);

    int deleteByPrimaryKey(Integer iId);

    int insert(Instruction record);

    int insertSelective(Instruction record);

    List<Instruction> selectByExample(InstructionExample example);

    Instruction selectByPrimaryKey(Integer iId);

    int updateByExampleSelective(@Param("record") Instruction record, @Param("example") InstructionExample example);

    int updateByExample(@Param("record") Instruction record, @Param("example") InstructionExample example);

    int updateByPrimaryKeySelective(Instruction record);

    int updateByPrimaryKey(Instruction record);
}