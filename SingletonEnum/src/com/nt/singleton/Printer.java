package com.nt.singleton;

public enum Printer {
	INSTANCE;  //by default it is public static final constant
	//b.method
	public  void write(String msg) {
		System.out.println("printing ..."+msg);
	}
	
	public  Object  myClone() throws CloneNotSupportedException {
		return super.clone();
	}
}
