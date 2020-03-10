package com.nt.factory;

import com.nt.bike.BajajBike;
import com.nt.bike.BajajDiscoverBike;
import com.nt.bike.BajajPulsorBike;

public abstract class BajajFactory {
	
	public  abstract BajajBike createBike(String type) ;

	
	public    BajajBike orderBike(String type) {
		BajajBike bike=null;
		bike=createBike(type);
		bike.paint();
		bike.assemble();
		bike.oiling();
		bike.roadTest();
	  return bike;
	}

}
