package com.nt.car;

public class SimpleCar extends Car{
	@Override
	public void assemble() {
		System.out.println("SimpleCar:: assembling");
	}
	
	@Override
	public void roadTest() {
		System.out.println("SimpleCar::roadTest()");
	}
	
	@Override
	public void transportation() {
	 System.out.println("SimpleCar::transportation()");	
	}

}
