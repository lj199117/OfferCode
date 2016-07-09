package com.hnu.io.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadProperties {
	static Properties property = null;
	private ReadProperties(){}
	public static Properties getInstance(){
		//����ʽ
		if(property == null){
			property = new Properties();
			try {
				InputStream is = ReadProperties.class.getClassLoader().getResourceAsStream("config.properties");
				property.load(is);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
		return property;
	}
	
	/*
	static{
		//����ʽ
		if(property == null){
			property = new Properties();
			try {
				InputStream is = ReadProperties.class.getClassLoader().getResourceAsStream("config.properties");
				property.load(is);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	*/
	
	public static  String getProperty(String key){
		return property.getProperty(key);
	}
	
	public static void main(String[] args) {
		//����ʽ �������getInstance
		System.out.println(ReadProperties.getInstance().getProperty("fileDir"));
		//����ʽ 
		System.out.println(ReadProperties.getProperty("fileDir"));
	}
}
