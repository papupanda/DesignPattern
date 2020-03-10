package com.nt.test;

import com.nt.car.Car;
import com.nt.car.LuxoryCar;
import com.nt.car.SimpleCar;
import com.nt.car.SportsCar;
import com.nt.factory.CarFactory;

public class FactoryPatternTest3 {

	public static void main(String[] args) {
		Car  car=null;
		car=CarFactory.getInstance("sports");
		System.out.println("Sports Car Ready.....");
	}

}
