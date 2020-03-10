package com.nt.factory;

public class LuxoryCar extends Car {

	@Override
	public void assemble() {
		System.out.println("LuxoryCar::assemble()");
	}

	@Override
	public void roadTest() {
		System.out.println("LuxoryCar::roadTest()");
	}

	@Override
	public void transportation() {
		System.out.println("LuxoryCar::transportation()");
	}

}
