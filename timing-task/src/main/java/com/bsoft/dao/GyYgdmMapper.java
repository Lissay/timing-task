package com.bsoft.dao;

import com.bsoft.domain.GyYgdm;
import com.bsoft.domain.GyYgdmExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GyYgdmMapper {
    int countByExample(GyYgdmExample example);

    int deleteByExample(GyYgdmExample example);

    int deleteByPrimaryKey(String ygdm);

    int insert(GyYgdm record);

    //保存GY_YGDM,若pojo属性为空，则跳过该字段的保存
    int insertSelective(GyYgdm record);

    List<GyYgdm> selectByExample(GyYgdmExample example);

    //查看是否已存在该主键（创建主键、判断是insert还是update）
    GyYgdm selectByPrimaryKey(String ygdm);

    int updateByExampleSelective(@Param("record") GyYgdm record, @Param("example") GyYgdmExample example);

    int updateByExample(@Param("record") GyYgdm record, @Param("example") GyYgdmExample example);

    //更新操作
    int updateByPrimaryKeySelective(GyYgdm record);

    int updateByPrimaryKey(GyYgdm record);
}