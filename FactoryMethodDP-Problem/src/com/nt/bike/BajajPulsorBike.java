package com.nt.bike;

public class BajajPulsorBike extends BajajBike {

	@Override
	public void paint() {
		System.out.println("BajajPulsorBike.paint()");
	}

	@Override
	public void assemble() {
		System.out.println("BajajPulsorBike.assemble()");

	}

	@Override
	public void oiling() {
		System.out.println("BajajPulsorBike.oiling()");
	}

	@Override
	public void roadTest() {
           System.out.println("BajajPulsorBike.roadTest()");
	}

}
