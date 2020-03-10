package com.nt.factory;

import com.nt.beans.BankService;
import com.nt.beans.Interceptor;

import net.sf.cglib.proxy.Enhancer;

public class BankServiceFactory {
	
	public static BankService getBankService(boolean isRBImoniteringEnabled) throws Exception {
		if(isRBImoniteringEnabled)
			return (BankService) Enhancer.create(BankService.class, new Interceptor());
		else
			return new BankService();
	}

}
