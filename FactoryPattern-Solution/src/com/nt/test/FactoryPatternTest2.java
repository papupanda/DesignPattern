package com.nt.test;

import com.nt.car.Car;
import com.nt.car.LuxoryCar;
import com.nt.car.SimpleCar;
import com.nt.factory.CarFactory;

public class FactoryPatternTest2 {

	public static void main(String[] args) {
		Car  car=null;
		car=CarFactory.getInstance("luxory");
		
		System.out.println("Luxory car is ready.......");
		
	}

}
