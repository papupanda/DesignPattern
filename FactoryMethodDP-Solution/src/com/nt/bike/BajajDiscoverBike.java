package com.nt.bike;

public class BajajDiscoverBike extends BajajBike {

	@Override
	public void paint() {
		System.out.println("BajajDiscoverBike.paint()");
	}

	@Override
	public void assemble() {
		System.out.println("BajajDiscoverBike.assemble()");

	}

	@Override
	public void oiling() {
		System.out.println("BajajDiscoverBike.oiling()");
	}

	@Override
	public void roadTest() {
           System.out.println("BajajDiscoverBike.roadTest()");
	}

}
