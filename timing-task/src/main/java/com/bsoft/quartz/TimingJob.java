package com.bsoft.quartz;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.bsoft.domain.EhospitaliiRsglZgda;
import com.bsoft.domain.GyYgdm;
import com.bsoft.service.CheckService;
import com.bsoft.service.GyYgdmService;  
  
public class TimingJob {  
    SimpleDateFormat DateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
    Date d = new Date();  
    String returnstr = DateFormat.format(d);    
    
    private Logger logger = LoggerFactory.getLogger(getClass());
    
    @Autowired
    CheckService checkService;
    
    @Autowired
    GyYgdmService gyYgdmService;
    
    public void execute() {  
    	logger.info(returnstr+"★★★★★★★★★★★");
        List<EhospitaliiRsglZgda> records = checkService.doCheck();
        if(records.size() > 0 ) {
        	if(records.size()>500) {
        		records = records.subList(0, 500);//防止系统崩溃，一次最多更新500条
        	}
        	int success = gyYgdmService.doExecute(records);
        	logger.info("已调用浙二医生同步：同步条数为："+success);
        	System.out.println("已调用浙二医生同步：同步条数为："+success);
        }
        logger.info(returnstr+"==================");
    }  
  
}  