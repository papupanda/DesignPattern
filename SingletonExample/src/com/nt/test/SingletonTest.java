package com.nt.test;

import com.nt.singleton.CircleAreaCalculator;

public class SingletonTest {

	public static void main(String[] args) {
		  CircleAreaCalculator calc=null;
		  calc=CircleAreaCalculator.getInstance();
		  //invoke method
		  System.out.println("area:"+calc.calcArea(10));
		  System.out.println("....");
		  System.out.println("area:"+calc.calcArea(20));
	}

}
