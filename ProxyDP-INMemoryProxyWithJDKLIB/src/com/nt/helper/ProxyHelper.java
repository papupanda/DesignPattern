package com.nt.helper;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import com.nt.command.BankServiceImpl;


public class ProxyHelper implements  InvocationHandler{

	@Override
	public Object invoke(Object target, Method method, Object[] args) throws Throwable {
		
		String result=null;
		
		if(method.getName().equalsIgnoreCase("transferMoney")) {
			  if(((Float)args[2])>=100000) throw new		  IllegalArgumentException("Get Approval from RBI to transfer more than 1,00,000 amount" );
			  else {
			     result= new BankServiceImpl().transferMoney(((Integer)args[0]),((Integer)args[1]),((Float)args[2]));
			  }
			  
		}//if
		return result;
		}//method
	
}//class
	
