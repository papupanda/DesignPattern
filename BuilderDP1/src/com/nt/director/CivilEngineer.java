//CivilEngineer.java (Director)
package com.nt.director;

import com.nt.builder.HouseBuilder;
import com.nt.factory.HouseBuilderFactory;
import com.nt.product.House;

public class CivilEngineer {
  private static HouseBuilder builder;
  
  
    public static    House  constructHouse(String type) {
    	HouseBuilder builder=null;
    	builder=HouseBuilderFactory.getInstance(type);
    	builder.buildBasement();
    	builder.buildStructure();
    	builder.buildRoof();
    	builder.buildInterior();
    	return builder.createHouse();
    }
  
  

}
