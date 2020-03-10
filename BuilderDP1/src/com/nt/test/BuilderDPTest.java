package com.nt.test;

import com.nt.director.CivilEngineer;
import com.nt.product.House;

public class BuilderDPTest {

	public static void main(String[] args) {
		House house=null;
		//use Decorator
		house=CivilEngineer.constructHouse("brick");
		System.out.println(house);
	}

}
