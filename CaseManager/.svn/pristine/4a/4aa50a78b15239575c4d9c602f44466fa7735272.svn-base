package com.cloud.cases;

import com.cloud.cases.util.SerialGenerator;
/**
 * 
 * @author tang01
 *
 */
public abstract class BaseService {
	//产生仪表参数信息表的参数ID
		public String getMeterprodId(String prefix,int length,int serial){
			SerialGenerator sg =SerialGenerator.getInstance();
			return sg.generatorNextSerial(prefix, length, serial);
		}
		
		
}
