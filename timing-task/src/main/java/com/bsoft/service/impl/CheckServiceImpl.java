package com.bsoft.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bsoft.dao.EhospitaliiRsglZgdaMapper;
import com.bsoft.domain.EhospitaliiRsglZgda;
import com.bsoft.domain.EhospitaliiRsglZgdaExample;
import com.bsoft.service.CheckService;

@Service("checkService")
public class CheckServiceImpl extends BaseService implements CheckService {

	@Autowired
	private EhospitaliiRsglZgdaMapper ehospitaliiRsglZgdaMapper;

	@Override
	public List<EhospitaliiRsglZgda> doCheck() {
		System.out.println("doCheck");
		EhospitaliiRsglZgdaExample example = new EhospitaliiRsglZgdaExample();
		example.createCriteria().andGxbzEqualTo((short) 0);
		return ehospitaliiRsglZgdaMapper.selectByExample(example);
	}

}
