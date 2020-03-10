package com.nt.beans;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class Interceptor implements MethodInterceptor{

	public Object intercept(Object obj, Method method, Object[] args, MethodProxy mproxy) throws Throwable {
		if(method.getName().equals("transferMoney")) {
			if((Integer)args[2]>=10000) {
				return "Get approval from RBI to transfer more than 10000";
			}
			else
				return args[2]+" is trasfered from "+args[0]+" to "+args[1]+" -->proxy";
		}
		return null;
	}
	
	
	

}
