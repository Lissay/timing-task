package com.bsoft.dao;

import com.bsoft.domain.GyZgxx;
import com.bsoft.domain.GyZgxxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GyZgxxMapper {
    int countByExample(GyZgxxExample example);

    int deleteByExample(GyZgxxExample example);

    int deleteByPrimaryKey(String zgid);

    int insert(GyZgxx record);

    int insertSelective(GyZgxx record);

    List<GyZgxx> selectByExample(GyZgxxExample example);

    //联立查询
    GyZgxx selectByPrimaryKey(String zgid);

    int updateByExampleSelective(@Param("record") GyZgxx record, @Param("example") GyZgxxExample example);

    int updateByExample(@Param("record") GyZgxx record, @Param("example") GyZgxxExample example);

    int updateByPrimaryKeySelective(GyZgxx record);

    int updateByPrimaryKey(GyZgxx record);
}