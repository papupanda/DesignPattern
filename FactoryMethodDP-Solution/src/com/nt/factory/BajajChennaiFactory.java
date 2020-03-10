package com.nt.factory;

import com.nt.bike.BajajBike;
import com.nt.bike.BajajDiscoverBike;
import com.nt.bike.BajajPulsorBike;

public class BajajChennaiFactory extends  BajajFactory{
	
	public   BajajBike  createBike(String type) {
		BajajBike bike=null;
		if(type.equalsIgnoreCase("pulsor"))
		   bike=new BajajPulsorBike();
		else if(type.equalsIgnoreCase("discover"))
			bike=new BajajDiscoverBike();
		return bike;
	}

}
