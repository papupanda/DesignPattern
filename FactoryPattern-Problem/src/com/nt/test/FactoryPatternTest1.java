package com.nt.test;

import com.nt.factory.Car;
import com.nt.factory.SimpleCar;

public class FactoryPatternTest1 {

	public static void main(String[] args) {
		Car  car=null;
		car=new SimpleCar();
		car.assemble();
		car.roadTest();
		car.transportation();
		System.out.println("Simple car ready.......");

	}

}
