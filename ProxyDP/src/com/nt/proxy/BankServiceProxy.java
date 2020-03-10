package com.nt.proxy;

import com.nt.command.BankService;
import com.nt.command.BankServiceImpl;

public class BankServiceProxy implements BankService {

	@Override
	public String transferMoney(int srcAcno, int destAcno, float amt) {
		BankService service=null;
		String result=null;
		if(amt>=100000)
			throw new IllegalArgumentException("Get Approval from RBI to transfer more than Rs.1,00,000  amount");
		else {
			service=new BankServiceImpl();
			result=service.transferMoney(srcAcno, destAcno, amt);
		}
		return result;
	}

}
