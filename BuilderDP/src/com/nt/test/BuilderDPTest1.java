package com.nt.test;

import com.nt.builder.HouseBuilder;
import com.nt.director.CivilEngineer;
import com.nt.factory.HouseBuilderFactory;

public class BuilderDPTest1 {

	public static void main(String[] args) {
		HouseBuilder builder=null;
		CivilEngineer engg=null;
		//Get HouseBuilder object
		builder=HouseBuilderFactory.getInstance("ice");
		//create Decoarator classobject
		engg=new CivilEngineer(builder);
		//consttruct house
		engg.constructHouse();
		
		

	}

}
