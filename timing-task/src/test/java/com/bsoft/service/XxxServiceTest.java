package com.bsoft.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bsoft.baseTest.SpringTestCase;
import com.bsoft.dao.EhospitaliiRsglZgdaMapper;
import com.bsoft.domain.EhospitaliiRsglZgda;
import com.bsoft.domain.EhospitaliiRsglZgdaExample;
  
/** 
 * 功能概要：UserService单元测试 
 *  
 * @author yzk 
 * @since  2017年2月21日  
 */  
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类  
@ContextConfiguration(locations = {"classpath:application.xml"})  

public class XxxServiceTest extends SpringTestCase  {
	@Autowired  
    private CheckService checkService;  
    Logger logger = Logger.getLogger(XxxServiceTest.class);  
    
    @Autowired
    GyYgdmService gyYgdmService;
    
    @Autowired
	private EhospitaliiRsglZgdaMapper ehospitaliiRsglZgdaMapper;
    
    @Test
    public void execute() {  
    	System.out.println("----------------------------------");
    	System.out.println("测试类启动！");
        List<EhospitaliiRsglZgda> records = checkService.doCheck();
        if(records.size() > 0 ) {
        	if(records.size()>500) {
        		records = records.subList(0, 500);//防止系统崩溃，一次最多更新500条
        	}
        	System.out.println("doExecute准备，需要更新条数："+records.size());
        	int success = gyYgdmService.doExecute(records);
        	System.out.println("已调用浙二医生同步：同步条数为："+success);
        } else {
        	System.out.println("未进行doExecute==================");
        }
        System.out.println("==================================");
    }  
    
//    @Test
    public void selectUserByIdTest(){  
    	EhospitaliiRsglZgdaExample example = new EhospitaliiRsglZgdaExample();
		example.createCriteria().andGxbzEqualTo((short) 0);
		List<EhospitaliiRsglZgda> erz = ehospitaliiRsglZgdaMapper.selectByExample(example); 
        System.out.println("查找结果"+erz);
//        logger.debug("查找结果" + erz); 
    }  
}

