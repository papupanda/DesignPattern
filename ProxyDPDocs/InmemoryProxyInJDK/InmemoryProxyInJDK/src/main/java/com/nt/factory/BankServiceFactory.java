package com.nt.factory;


import java.lang.reflect.Proxy;

import com.nt.bean.BankService;
import com.nt.bean.BankServiceImpl;
import com.nt.bean.MyInvocationHandler;


public class BankServiceFactory {
	
	public static BankService getBankService(boolean isRBImoniteringEnabled) throws Exception {
		if(isRBImoniteringEnabled)
			return (BankService) Proxy.newProxyInstance(BankServiceImpl.class.getClassLoader(), new Class[] {BankService.class}, new MyInvocationHandler());
		else
			return new BankServiceImpl();
	}

}
