package com.nt.test;

import com.nt.bike.BajajBike;
import com.nt.factory.BajajChennaiFactory;
import com.nt.factory.BajajNagpurFactory;

public class NorthBajajCustomer {

	public static void main(String[] args) {
		BajajBike bike=null;
		bike=BajajNagpurFactory.createBike("pulsor");
		System.out.println("Bike ready.....for North Customer");
	}

}
