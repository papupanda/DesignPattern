package com.nt.test;

import com.nt.director.CivilEngineer;
import com.nt.product.House;

public class BuilderDPTest1 {

	public static void main(String[] args) {
		House house=null;
		//use Decorator
		house=CivilEngineer.constructHouse("ice");
		System.out.println(house);
	}

}
