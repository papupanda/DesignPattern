package com.nt.icecream;

public class HoneyStrawberryIceCream extends StrawberryIceCream {

	@Override
	public void prepare() {
	   super.prepare();
	  addHoney();
	}
	
	public void addHoney() {
		System.out.println("adding Honey....");
	}

}
