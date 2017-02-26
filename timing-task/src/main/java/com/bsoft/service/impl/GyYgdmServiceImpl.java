package com.bsoft.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bsoft.dao.EhospitaliiRsglZgdaMapper;
import com.bsoft.dao.GyIdentityMapper;
import com.bsoft.dao.GyYgdmMapper;
import com.bsoft.dao.GyZgxxMapper;
import com.bsoft.domain.EhospitaliiRsglZgda;
import com.bsoft.domain.GyIdentity;
import com.bsoft.domain.GyYgdm;
import com.bsoft.domain.GyZgxx;
import com.bsoft.service.GyYgdmService;

@Service("gyYgdmService")
public class GyYgdmServiceImpl extends BaseService implements GyYgdmService {

	@Autowired
	private GyYgdmMapper gyYgdmMapper;
	
	@Autowired
	private GyIdentityMapper gyIdentityMapper;
	
	@Autowired
	private EhospitaliiRsglZgdaMapper ehospitaliiRsglZgdaMapper;
	
	@Autowired
	private GyZgxxMapper gyZgxxMapper;
	
	@Override
	public int doExecute(List<EhospitaliiRsglZgda> records) {
//		logger.info("GyYgdmServiceImpl接受的需要更新的记录：" + records);
		System.out.println("业务内 doExecute");
		int count = 0;
		List<GyYgdm> gyYgdmList = doCreateGyYgdm(records);
//		logger.info("GyYgdmServiceImpl返回预备存储信息：" + gyYgdmList);
    	for(GyYgdm record : gyYgdmList) {
    		int a = doSingleSaveGyYgdm(record);
    		count += a;
    	}
    	return count;//返回有效保存几条
	}
	
	@Override
	public List<GyYgdm> doCreateGyYgdm(List<EhospitaliiRsglZgda> records) {
System.out.println("doCreateGyYgdm");
		List<GyYgdm> results = new ArrayList<GyYgdm>();
		GyYgdm gyYgdm = new GyYgdm();
		for(EhospitaliiRsglZgda erz : records) {
			String zgid = erz.getZgid();
			gyYgdm.setZgid(zgid);	//作回写更新标志 主键查询用
System.out.println("准备查询GyZgxx：zgid="+zgid);
			GyZgxx gyZgxx = selectGyZgxxByPrimaryKey(zgid);
			if(gyZgxx != null) {
	System.out.println("查询到GyZgxx："+gyZgxx);
				gyYgdm.setYgdm(erz.getZggh());
				gyYgdm.setYgxm(erz.getXm());
				gyYgdm.setYgxb(Short.parseShort(erz.getXb()==null?null:erz.getXb()));
				gyYgdm.setYgzw(Short.parseShort(erz.getZw()==null?null:erz.getZw()));
				gyYgdm.setPydm(erz.getSrm1());
				gyYgdm.setZfpb(erz.getZxpb());
				gyYgdm.setYgbh(erz.getZggh());
				gyYgdm.setYgmm("像下匣蠂");
				gyYgdm.setBzxx(erz.getGw());
				gyYgdm.setKsdm(Long.parseLong(gyZgxx.getKsdm()==null?null:gyZgxx.getKsdm()));
				gyYgdm.setKcfq(gyZgxx.getCfq());
				gyYgdm.setMzyq(gyZgxx.getMzyq());
				gyYgdm.setJsyq(gyZgxx.getJsyq());
				results.add(gyYgdm);
	System.out.println("已创建一个gyYgdm："+gyYgdm);
				gyYgdm = new GyYgdm();
			} else {
				logger.error("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    			logger.error("查询GyZgxx无相应记录：zgid="+zgid);
    System.out.println("查询GyZgxx无相应记录：zgid="+zgid);
			}
		}
//		logger.error("已create gyYgdm个数："+results.size());
System.out.println("已create gyYgdm个数："+results.size());
		return results;
	}
	
	@Override
	public int doSingleSaveGyYgdm(GyYgdm record) {
System.out.println("doSingleSaveGyYgdm");
		int result;
//		logger.info("GyYgdmServiceImpl收到参数" + record);
		String ygdm = record.getYgdm();
		String zgid = record.getZgid();
		GyYgdm selected = selectByPrimaryKey(ygdm);
//		logger.info("GyYgdmServiceImpl查询主键ygdm：" + ygdm 
//				+ ",结果为" + selected);
		if(selected == null) {
			logger.info("GyYgdmServiceImpl调用insertGyYgdm方法，插入记录为："+record);
			result = insertGyYgdm(record);
		} else {
			logger.info("GyYgdmServiceImpl调用updateGyYgdm方法，更新记录为："+record);
			result = updateGyYgdm(record);
		}
		//更改更新标志为1，表示该员工信息已更新到HIS库
		GyZgxx gz = new GyZgxx();
		gz.setZgid(zgid);
		gz.setGxbz((short) 1);
		updateGyZgxxByPrimaryKeySelective(gz);
		
		EhospitaliiRsglZgda erz = new EhospitaliiRsglZgda();
		erz.setZgid(zgid);
		erz.setGxbz((short) 1);
		updateByPrimaryKeySelective(erz);
		return result;
	}
	
	@Override
	public GyIdentity createPrimaryKey(String bmc) {
		return gyIdentityMapper.selectByPrimaryKey(bmc);
	}
	
	@Override
	public int insertGyYgdm(GyYgdm record) {
		return gyYgdmMapper.insertSelective(record);
	}

	@Override
	public int updateGyYgdm(GyYgdm record) {
		return gyYgdmMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public GyYgdm selectByPrimaryKey(String ygdm) {
		return gyYgdmMapper.selectByPrimaryKey(ygdm);
	}

	@Override
	public GyZgxx selectGyZgxxByPrimaryKey(String zgid) {
		return gyZgxxMapper.selectByPrimaryKey(zgid);
	}

	@Override
	public int updateByPrimaryKeySelective(EhospitaliiRsglZgda record) {
		System.out.println("更新GXBZ为1");
		return ehospitaliiRsglZgdaMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateGyZgxxByPrimaryKeySelective(GyZgxx record) {
		return gyZgxxMapper.updateByPrimaryKeySelective(record);
	}

}
