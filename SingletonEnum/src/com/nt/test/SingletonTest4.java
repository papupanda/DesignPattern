package com.nt.test;

import com.nt.singleton.Printer;

public class SingletonTest4 {

	public static void main(String[] args)throws InstantiationException {
		Printer p1=null,p2=null;
		//get Instance
		p1=Printer.INSTANCE;
		try {
		p2=(Printer) p1.myClone();
		}
		catch(CloneNotSupportedException cnsf) {
			cnsf.printStackTrace();
		}
		System.out.println(p1.hashCode()+" "+p2.hashCode());
		System.out.println("p==p2?"+(p1==p2));
	}//method
}//class
