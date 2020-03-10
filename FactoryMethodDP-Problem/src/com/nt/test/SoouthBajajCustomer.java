package com.nt.test;

import com.nt.bike.BajajBike;
import com.nt.factory.BajajChennaiFactory;

public class SoouthBajajCustomer {

	public static void main(String[] args) {
		BajajBike bike=null;
		bike=BajajChennaiFactory.createBike("pulsor");
		System.out.println("Bike ready.....for South Customer");
	}

}
