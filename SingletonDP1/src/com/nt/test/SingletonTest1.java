package com.nt.test;

import java.sql.SQLException;

import com.nt.singleton.Printer;

public class SingletonTest1 {

	public static void main(String[] args) throws InstantiationException{
		/*try {
			Class.forName("com.nt.singleton.Printer");
		}
		catch(ClassNotFoundException cnf) {
			cnf.printStackTrace();
		}*/
		try {
			Thread.sleep(40000);
			}
			catch(Exception se) {
				se.printStackTrace();
			}
		Printer p1=null,p2=null;
		p1=Printer.getInstance();
		p2=Printer.getInstance();
		
		System.out.println("p1==p2?"+(p1==p2));
		System.out.println(p1.hashCode()+"   "+p2.hashCode());
	
		//invoke the method
		p1.write("hello");
		p2.write("hai");
		

	}

}
