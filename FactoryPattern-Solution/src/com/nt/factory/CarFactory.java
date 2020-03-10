package com.nt.factory;

import com.nt.car.Car;
import com.nt.car.LuxoryCar;
import com.nt.car.SimpleCar;
import com.nt.car.SportsCar;

public class CarFactory {
	
	public  static Car  getInstance(String type) {
		  Car car=null;
		  if(type.equalsIgnoreCase("simple"))
			   car=new SimpleCar();
		 else if(type.equalsIgnoreCase("luxory"))
			 car=new LuxoryCar();
		 else if(type.equalsIgnoreCase("sports"))
			 car=new SportsCar();
		    
		   car.assemble();
		   car.roadTest();
		   car.transportation();
		return car;
	}

}
