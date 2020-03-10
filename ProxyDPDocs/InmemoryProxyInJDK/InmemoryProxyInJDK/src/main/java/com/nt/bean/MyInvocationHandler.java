package com.nt.bean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
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
