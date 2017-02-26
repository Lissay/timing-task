package com.bsoft.dao;

import com.bsoft.domain.EhospitaliiRsglZgda;
import com.bsoft.domain.EhospitaliiRsglZgdaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EhospitaliiRsglZgdaMapper {
    int countByExample(EhospitaliiRsglZgdaExample example);

    int deleteByExample(EhospitaliiRsglZgdaExample example);

    int deleteByPrimaryKey(String zgid);

    int insert(EhospitaliiRsglZgda record);

    int insertSelective(EhospitaliiRsglZgda record);

    //取GXBZ为0的记录
    List<EhospitaliiRsglZgda> selectByExample(EhospitaliiRsglZgdaExample example);

    EhospitaliiRsglZgda selectByPrimaryKey(String zgid);

    int updateByExampleSelective(@Param("record") EhospitaliiRsglZgda record, @Param("example") EhospitaliiRsglZgdaExample example);

    int updateByExample(@Param("record") EhospitaliiRsglZgda record, @Param("example") EhospitaliiRsglZgdaExample example);

    //更改GXBZ为1表示已经同步到HIS库
    int updateByPrimaryKeySelective(EhospitaliiRsglZgda record);

    int updateByPrimaryKey(EhospitaliiRsglZgda record);
}