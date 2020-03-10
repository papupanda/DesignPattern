package com.nt.command;

public class BankServiceImpl {

	
	public String transferMoney(int srcAcno, int destAcno, float amt) {
		return "transfering  amount::"+amt+"  from source Account:: "+srcAcno+"  to  Dest Account:: "+destAcno;
	}

}
