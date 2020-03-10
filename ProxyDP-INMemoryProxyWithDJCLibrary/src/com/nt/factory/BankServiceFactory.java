package com.nt.factory;

import com.javax0.djcproxy.ProxyFactory;
import com.nt.command.BankServiceImpl;
import com.nt.helper.ProxyHelper;

public class BankServiceFactory {
	
	public static   BankServiceImpl   getInstance(boolean RBIMonitoring) throws Exception {
		BankServiceImpl service=null;
		if(RBIMonitoring)
			service= new ProxyFactory<BankServiceImpl>().create(new BankServiceImpl(), new ProxyHelper());
		else
			service=new BankServiceImpl();
			return service;
	}

}
