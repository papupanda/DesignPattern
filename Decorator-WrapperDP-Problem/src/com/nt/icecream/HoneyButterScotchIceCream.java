package com.nt.icecream;

public class HoneyButterScotchIceCream extends ButterScotchIceCream {

	@Override
	public void prepare() {
	   super.prepare();
	  addHoney();
	}
	
	public void addHoney() {
		System.out.println("adding Honey....");
	}

}
