package com.nt.test;

import com.nt.factory.Car;
import com.nt.factory.LuxoryCar;
import com.nt.factory.SimpleCar;

public class FactoryPatternTest2 {

	public static void main(String[] args) {
		Car  car=null;
		car=new LuxoryCar();
		car.assemble();
		car.roadTest();
		car.transportation();
		System.out.println("Luxory Car Ready ......");

	}

}
