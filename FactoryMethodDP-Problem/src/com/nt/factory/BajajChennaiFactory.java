package com.nt.factory;

import com.nt.bike.BajajBike;
import com.nt.bike.BajajDiscoverBike;
import com.nt.bike.BajajPulsorBike;

public class BajajChennaiFactory {
	
	public  static BajajBike  createBike(String type) {
		BajajBike bike=null;
		if(type.equalsIgnoreCase("pulsor"))
		   bike=new BajajPulsorBike();
		else if(type.equalsIgnoreCase("discover"))
			bike=new BajajDiscoverBike();
		bike.assemble();
		bike.paint();
		bike.oiling();
		return bike;
	}

}
