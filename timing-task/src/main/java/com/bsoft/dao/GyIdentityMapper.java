package com.bsoft.dao;

import com.bsoft.domain.GyIdentity;
import com.bsoft.domain.GyIdentityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GyIdentityMapper {
    int countByExample(GyIdentityExample example);

    int deleteByExample(GyIdentityExample example);

    int deleteByPrimaryKey(String bmc);

    int insert(GyIdentity record);

    int insertSelective(GyIdentity record);

    List<GyIdentity> selectByExample(GyIdentityExample example);

    //创建主键
    GyIdentity selectByPrimaryKey(String bmc);

    int updateByExampleSelective(@Param("record") GyIdentity record, @Param("example") GyIdentityExample example);

    int updateByExample(@Param("record") GyIdentity record, @Param("example") GyIdentityExample example);

    int updateByPrimaryKeySelective(GyIdentity record);

    int updateByPrimaryKey(GyIdentity record);
}