package com.nt.test;

import com.nt.bean.BankService;
import com.nt.bean.BankServiceImpl;
import com.nt.factory.BankServiceFactory;

public class ProxyTest {
	
	public static void main(String[] args) throws Exception {
		BankService acc1=BankServiceFactory.getBankService(false);
		System.out.println(acc1.transferMoney(101, 102, 1000));
		BankService	 acc2=BankServiceFactory.getBankService(true);
		System.out.println(acc2.transferMoney(102, 103, 20000));
	}

}
