package com.nt.test;

import com.nt.command.BankService;
import com.nt.factory.BankServiceFactory;

public class ProxyDPTest {

	public static void main(String[] args) {
		 BankService service=null;
		 
		 service=BankServiceFactory.getInstance(true);
		 try {
		 System.out.println(service.getClass());
		 System.out.println(service.transferMoney(1001,1002,4000));
		 System.out.println("...................");
		 System.out.println(service.transferMoney(1001,1002,400000));
		 }
		 catch(Exception e) {
			 e.printStackTrace();
		 }
		 System.out.println("================================");
		 service=BankServiceFactory.getInstance(false);
		 System.out.println(service.getClass());
		 System.out.println(service.transferMoney(1001,1002,4000));
		 System.out.println("...................");
		 System.out.println(service.transferMoney(1001,1002,400000));
		 
		 
		 
		
	}

}
