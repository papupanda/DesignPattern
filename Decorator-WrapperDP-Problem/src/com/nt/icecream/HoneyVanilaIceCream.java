package com.nt.icecream;

public class HoneyVanilaIceCream extends VanilaIceCream {

	@Override
	public void prepare() {
	   super.prepare();
	  addHoney();
	}
	
	public void addHoney() {
		System.out.println("adding Honey....");
	}

}
