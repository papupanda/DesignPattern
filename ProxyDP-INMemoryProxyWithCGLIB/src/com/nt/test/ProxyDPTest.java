package com.nt.test;

import java.util.Arrays;

import com.nt.command.BankService;
import com.nt.factory.BankServiceFactory;

public class ProxyDPTest {

	public static void main(String[] args) {
		 BankService service=null;
		 
		 service=BankServiceFactory.getInstance(true);
		 try {
		 System.out.println(service.getClass()+"  "+service.getClass().getSuperclass()+" "+Arrays.toString(service.getClass().getDeclaredMethods()));
		 System.out.println(service.transferMoney(1001,1002,400000));
		 }
		 catch(Exception e){
			 e.printStackTrace();
		 }
		
	}

}
