package com.nt.helper;

import java.lang.reflect.Method;

import com.javax0.djcproxy.MethodInterceptor;
import com.javax0.djcproxy.MethodProxy;



public class ProxyHelper implements MethodInterceptor{

	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy mproxy) throws Throwable {
		String result=null;
		  if(method.getName().equalsIgnoreCase("transferMoney")) {
		  if(((Float)args[2])>=100000) 
			    throw new		  IllegalArgumentException("Get Approval from RBI to transfer more than 1,00,000 amount"); 
		  else {
		  result=args[2]+" amount is transfered from"+args[0]+" account  to"+args[1]
		  +" account"; }
		  
		  }//if
		  return result;
		  }//method
	}//class
	
	
