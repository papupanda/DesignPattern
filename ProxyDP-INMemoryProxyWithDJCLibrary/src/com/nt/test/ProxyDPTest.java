package com.nt.test;

import com.nt.command.BankServiceImpl;
import com.nt.factory.BankServiceFactory;

public class ProxyDPTest {

	public static void main(String[] args) {
		 BankServiceImpl service=null;
		 
		
		 try {
			 service=BankServiceFactory.getInstance(true);
		 //System.out.println(service.getClass()+"  "+service.getClass().getSuperclass()+" "+Arrays.toString(service.getClass().getInterfaces())+"   --->   "+Arrays.toString(service.getClass().getDeclaredMethods()));
		 System.out.println(service.transferMoney(1001,1002,400000));
		 }
		 catch(Exception e){
			 e.printStackTrace();
		 }
		
	}

}
