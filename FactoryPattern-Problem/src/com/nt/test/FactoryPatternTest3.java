package com.nt.test;

import com.nt.factory.Car;
import com.nt.factory.LuxoryCar;
import com.nt.factory.SimpleCar;
import com.nt.factory.SportsCar;

public class FactoryPatternTest3 {

	public static void main(String[] args) {
		Car  car=null;
		car=new SportsCar();
		car.assemble();
		car.roadTest();
		car.transportation();
		System.out.println("Sports Car Ready.....");
	}

}
