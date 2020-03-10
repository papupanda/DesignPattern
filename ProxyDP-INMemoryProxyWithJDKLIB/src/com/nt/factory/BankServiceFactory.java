package com.nt.factory;

import java.lang.reflect.Proxy;

import com.nt.command.BankService;
import com.nt.command.BankServiceImpl;
import com.nt.helper.ProxyHelper;

public class BankServiceFactory {
	
	public static   BankService   getInstance(boolean RBIMonitoring) {
		BankService service=null;
		if(RBIMonitoring)
			service=(BankService) Proxy.newProxyInstance(BankServiceImpl.class.getClassLoader(), new Class[] {BankService.class}, new ProxyHelper());
		else
			service=new BankServiceImpl();
			return service;
	}

}
