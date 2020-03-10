package com.nt.commons;

import java.util.Enumeration;
import java.util.Properties;
import java.util.ResourceBundle;

import org.apache.log4j.PropertyConfigurator;

public class Log4jConfigurations {
	
	public static  void  enableLog4j() {
		ResourceBundle bundle=null;
		Properties props=null;
		Enumeration<String> keys=null;
		String key=null;
		
		// Write log4j.properties file info into  java.util.Properties class object
		bundle=ResourceBundle.getBundle("com/nt/commons/log4j");
		keys=bundle.getKeys();
		props=new Properties();
		while(keys.hasMoreElements()) {
			key=keys.nextElement();
			props.put(key,bundle.getString(key));
		}
		//Enable log4j
		PropertyConfigurator.configure(props);
		
	}

}
