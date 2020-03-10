package com.nt.test;

import com.nt.bike.BajajBike;
import com.nt.factory.BajajChennaiFactory;
import com.nt.factory.BajajFactory;
import com.nt.factory.BajajNagpurFactory;

public class SoouthBajajCustomer {

	public static void main(String[] args) {
		BajajFactory   factory=null;
		BajajBike bike=null;
		factory=new BajajChennaiFactory();
		bike=factory.orderBike("pulsor");
		System.out.println("Pulsor bike is ready for South Customer");

	}

}
