package com.nt.beans;

public class BankService {
	
	public String transferMoney(int srcAcc, int destAcc,int amount) {
		return "Rs:"+amount+" is transfered from "+srcAcc+" to "+destAcc;
	}
	
	

}
