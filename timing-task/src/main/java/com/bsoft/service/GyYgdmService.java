package com.bsoft.service;

import java.util.List;

import com.bsoft.domain.EhospitaliiRsglZgda;
import com.bsoft.domain.GyIdentity;
import com.bsoft.domain.GyYgdm;
import com.bsoft.domain.GyZgxx;

public interface GyYgdmService {
	
	public int doExecute(List<EhospitaliiRsglZgda> records);
	
	public List<GyYgdm> doCreateGyYgdm(List<EhospitaliiRsglZgda> records);
	
	public int doSingleSaveGyYgdm(GyYgdm record);
	
	public int insertGyYgdm(GyYgdm record);
	
	public int updateGyYgdm(GyYgdm record);
	
	public GyYgdm selectByPrimaryKey(String ygdm);

	/**暂未使用，数据表中已提供主键*/
	GyIdentity createPrimaryKey(String bmc);
	
	public GyZgxx selectGyZgxxByPrimaryKey(String zgid);
	
    public int updateByPrimaryKeySelective(EhospitaliiRsglZgda record);
    
    public int updateGyZgxxByPrimaryKeySelective(GyZgxx record);
}
