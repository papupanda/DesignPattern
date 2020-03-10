package com.nt.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

import com.nt.singleton.Printer;

public class SingletonTest5 {

	public static void main(String[] args) {
		Class c=null;
		Field fields[]=null;
		Constructor cons[]=null;
		Printer p1=null,p2=null;
		try {
			
			 //create Singleton JAva class obj
			 p1=Printer.INSTANCE;
			
			//Load the singleton java class
			 c=Class.forName("com.nt.singleton.Printer");
			 //get Access to private constructor
			 cons=c.getDeclaredConstructors();
			 cons[0].setAccessible(true);
			 p2=(Printer)cons[0].newInstance();
			 
			 System.out.println("p1==p2?"+(p1==p2));
			 System.out.println(p1.hashCode()+"  "+p2.hashCode());
		}//try
		catch(ClassNotFoundException cnf) {
			cnf.printStackTrace();
		}
		catch(InstantiationException ie) {
			ie.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}//method
}//class
