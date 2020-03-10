package com.nt.dispatcher;

import java.util.ResourceBundle;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Dispatcher {
	private static ResourceBundle bundle=null;
	static {
		bundle=ResourceBundle.getBundle("com/nt/commons/AppConfig");
	}
	
	
	
	  public static  void  dispatch(HttpServletRequest req,HttpServletResponse res,String lvn) throws Exception{
		  String viewName=null;
		  RequestDispatcher rd=null;
		  //get Physicalview comp name..
		  viewName=bundle.getString(lvn);
		  //dispatch request to Physical View
		  rd=req.getRequestDispatcher(viewName);
		  //forward the request
		  rd.forward(req,res);
	  }

}
