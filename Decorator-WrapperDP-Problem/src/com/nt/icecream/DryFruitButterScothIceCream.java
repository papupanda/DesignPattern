package com.nt.icecream;

public class DryFruitButterScothIceCream extends ButterScotchIceCream {

	@Override
	public void prepare() {
	  super.prepare();
	  addDryFruits();
	}
	
	public void addDryFruits() {
		System.out.println("adding dryfruits.....");
	}
	

}
