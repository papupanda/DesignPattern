package com.nt.factory;

import com.nt.bike.BajajBike;
import com.nt.bike.BajajDiscoverBike;
import com.nt.bike.BajajPulsorBike;

public class BajajNagpurFactory {
	
	public  static BajajBike  createBike(String type) {
		BajajBike bike=null;
		if(type.equalsIgnoreCase("pulsor"))
		   bike=new BajajPulsorBike();
		else if(type.equalsIgnoreCase("discover"))
			bike=new BajajDiscoverBike();
		bike.paint();
		bike.assemble();
		bike.oiling();
		bike.roadTest();
		return bike;
	}

}
