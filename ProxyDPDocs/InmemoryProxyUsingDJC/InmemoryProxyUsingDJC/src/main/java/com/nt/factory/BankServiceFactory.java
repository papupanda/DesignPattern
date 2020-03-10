package com.nt.factory;

import com.javax0.djcproxy.ProxyFactory;
import com.nt.bean.BankService;
import com.nt.bean.Interceptor;

public class BankServiceFactory {
	
	public static BankService getBankService(boolean isRBImoniteringEnabled) throws Exception {
		if(isRBImoniteringEnabled)
			return new ProxyFactory<BankService>().create(new BankService(), new Interceptor());
		else
			return new BankService();
	}

}
