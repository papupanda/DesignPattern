package com.nt.singleton;

import com.nt.utils.CommonsUtil;

public class Printer  extends CommonsUtil {
	private static final long serialVersionUID = 1L;
	private static boolean isInstantiated=false;
	
	private static Printer instance;
	 //private static Printer instance=new Printer(); //eager instantiation
	/*
	 * private static Printer instance; static { instance=new Printer(); //eager
	 * instantiation }
	 */

	private Printer() throws InstantiationException{
		if(isInstantiated) {
			throw new InstantiationException();
		}
		isInstantiated=true;
		System.out.println("Printer:: 0-param constructor");
	}

	/*
	 * public static synchronized Printer getInstance() { if(instance==null)
	 * instance=new Printer();
	 * 
	 * return instance; }
	 */

	public static Printer getInstance()throws InstantiationException {
		if (instance == null) {   //1st null check
			synchronized (Printer.class) {
				System.out.println(Thread.currentThread().getName());
				if (instance == null)  //2nd null check
					instance = new Printer();
			} // synchronized
		} // if
		return instance;
	}
	
	
	
	
	/*public Object readResolve() {
		return instance;
	}
	*/
	@Override
	public Object clone() throws CloneNotSupportedException {
	   throw new CloneNotSupportedException();
	}

	
	/* public static Printer getInstance() { 
		    return instance; 
		 }
	 */

	public void write(String str) {
		System.out.println(str);
	}
	

}
