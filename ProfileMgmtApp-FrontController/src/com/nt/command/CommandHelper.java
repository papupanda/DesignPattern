package com.nt.command;

import java.util.ResourceBundle;

public class CommandHelper {
	private static ResourceBundle bundle=null;
	static {
		//get bundle.....
		bundle=ResourceBundle.getBundle("com/nt/commons/AppConfig");
	}
	
    public static   Command  getCommand(String uri) throws Exception{
    	String cmdClass=null;
    	Command cmd=null;
    	//get Command class for given url
    	cmdClass=bundle.getString(uri);
    	//load and Command class object
    		cmd=(Command)Class.forName(cmdClass).newInstance();
    	return cmd;
    }
}
