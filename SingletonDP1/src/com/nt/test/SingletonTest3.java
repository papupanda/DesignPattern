package com.nt.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.nt.singleton.Printer;

public class SingletonTest3 {
	public  void PerformSerialization(Object obj) {
		ObjectOutputStream oos=null;
		try {
			oos=new ObjectOutputStream(new FileOutputStream("abc.txt"));
			oos.writeObject(obj);
			oos.flush();
			oos.close();
			System.out.println("Serialzation is done");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}//method
	
	public Object PerformDeSerialization() {
		ObjectInputStream ois=null;
		Object  obj=null;
		try {
			ois=new ObjectInputStream(new FileInputStream("abc.txt"));
			obj=ois.readObject();
			ois.close();
			System.out.println("DeSerialzation is done");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return obj;
	}//method
	
	
	public static void main(String[] args) throws InstantiationException{
	       SingletonTest3 test3=null;
	       Printer p1=null,p2=null;;
	        p1=Printer.getInstance();
	        
	       test3=new SingletonTest3();
	      //test3.PerformSerialization(p1);
	       p2=(Printer) test3.PerformDeSerialization();
	       System.out.println("p1==p2?"+(p1==p2));
	       System.out.println(p1.hashCode()+"    "+p2.hashCode());
	       
	}//main
}//class
