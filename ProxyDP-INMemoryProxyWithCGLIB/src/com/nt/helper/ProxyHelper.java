package com.nt.helper;

import java.lang.reflect.Method;

import com.nt.command.BankService;
import com.nt.command.BankServiceImpl;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class ProxyHelper implements  MethodInterceptor{

	@Override
	public Object intercept(Object target, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		  String result=null;
		if(method.getName().equalsIgnoreCase("transferMoney")) {
			  if(((Float)args[2])>=100000)
				  throw new IllegalArgumentException("Get Approval from RBI to transfer more than 1,00,000 amount");
			  else {
				  result=(String) proxy.invokeSuper(target, args);
			  }
		}//if
		return result;
	}//method
}//class
	
