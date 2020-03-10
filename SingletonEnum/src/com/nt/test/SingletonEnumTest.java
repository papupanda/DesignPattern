package com.nt.test;

import com.nt.singleton.Printer;

public class SingletonEnumTest {
	public static void main(String[] args) {
		Printer p1=null,p2=null;
		p1=Printer.INSTANCE;
		p2=Printer.INSTANCE;
		
		System.out.println("p1==p2?"+(p1==p2));
		System.out.println(p1.hashCode()+"  "+p2.hashCode());
		try {
		Thread.sleep(40000);
		}
		catch(InterruptedException ie) {
			ie.printStackTrace();
		}
	}

}
