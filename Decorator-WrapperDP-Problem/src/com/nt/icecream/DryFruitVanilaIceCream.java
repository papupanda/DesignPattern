package com.nt.icecream;

public class DryFruitVanilaIceCream extends VanilaIceCream {

	@Override
	public void prepare() {
	   super.prepare();
	   addDryFuits();
	}
	
	public void addDryFuits() {
		System.out.println("adding dry fruits....");
	}

}
