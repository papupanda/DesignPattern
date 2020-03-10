package com.nt.icecream;

public class DryFruitStrawberryIceCream extends StrawberryIceCream {

	@Override
	public void prepare() {
	  super.prepare();
	  addDryFruits();
	}
	
	public void addDryFruits() {
		System.out.println("adding dryfruits.....");
	}
	

}
