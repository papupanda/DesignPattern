package com.nt.factory;

import com.nt.builder.HouseBuilder;
import com.nt.cbuilder.ConcreteHouseBuilder;
import com.nt.cbuilder.IceHouseBuilder;
import com.nt.cbuilder.WoodenHouseBuilder;
import com.nt.product.House;

public class HouseBuilderFactory {
	
	public  static HouseBuilder  getInstance(String houseType) {
		   House house=null;
		   HouseBuilder builder=null;
		   house=new House();
		   if(houseType.equalsIgnoreCase("brick"))
			   builder=new ConcreteHouseBuilder(house);
		   else if(houseType.equalsIgnoreCase("wooden"))
			   builder=new WoodenHouseBuilder(house);
		   else if(houseType.equalsIgnoreCase("ice"))
			   builder=new IceHouseBuilder(house);
		   else
			   throw new IllegalArgumentException("invalid inputs");
		   
		   return builder;
	}//main
}//class
