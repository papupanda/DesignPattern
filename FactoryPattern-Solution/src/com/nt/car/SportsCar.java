package com.nt.car;

public class SportsCar extends Car {

	@Override
	public void assemble() {
	  System.out.println("SportsCar::assemble()");
	}

	@Override
	public void roadTest() {
        System.out.println("SportsCar::roadTest()");	
	}

	@Override
	public void transportation() {
	  System.out.println("SportsCar::transportation()");
	}

}
