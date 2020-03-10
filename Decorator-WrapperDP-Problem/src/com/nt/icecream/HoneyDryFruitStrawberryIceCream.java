package com.nt.icecream;

public class HoneyDryFruitStrawberryIceCream extends HoneyStrawberryIceCream {

	@Override
	public void prepare() {
	   super.prepare();
	 addDryFruit();
	}
	
	public void addDryFruit() {
		System.out.println("adding DryFruit....");
	}

}
