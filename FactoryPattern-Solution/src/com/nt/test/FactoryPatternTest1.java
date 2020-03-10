package com.nt.test;

import com.nt.car.Car;
import com.nt.car.SimpleCar;
import com.nt.factory.CarFactory;

public class FactoryPatternTest1 {

	public static void main(String[] args) {
		Car  car=null;
		car=CarFactory.getInstance("simple");
		System.out.println("Simple car ready.......");

	}

}
