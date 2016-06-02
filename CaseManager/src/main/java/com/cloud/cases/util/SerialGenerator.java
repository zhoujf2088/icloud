package com.cloud.cases.util;

import java.text.DecimalFormat;
/*
 * 序列号生产程序
 */
public class SerialGenerator {
	
	//定义静态实例
	private static SerialGenerator serialGenerator=null;
	
	//构造函数
	public SerialGenerator(){}
	
	//获取SerialGenerator单实例
	public static SerialGenerator getInstance(){
		if(serialGenerator==null){
			synchronized(SerialGenerator.class){
				if(serialGenerator==null){
					serialGenerator=new SerialGenerator();
				}
			}
		}
		return serialGenerator;
	}
	
	/*
	 * 计算下一个序列号
	 * prefix : 前缀
	 * length : 后缀的长度
	 * serial ：最大流水号
	 */
	
	public synchronized String generatorNextSerial(String prefix,int length,Integer serial){
		String id=null;
		StringBuilder sb = new StringBuilder();
	
		for(int i=0;i<length;i++){
			sb.append("0");
		}
		
		DecimalFormat df = new DecimalFormat(sb.toString());
		if(serial==null){
			id=df.format(0);
		}else{
			id=df.format(serial);
		}
		return prefix+id;
	}
}
