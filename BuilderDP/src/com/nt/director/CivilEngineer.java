//CivilEngineer.java (Director)
package com.nt.director;

import com.nt.builder.HouseBuilder;
import com.nt.product.House;

public class CivilEngineer {
  private  HouseBuilder builder;
  
  public CivilEngineer(HouseBuilder builder) {
	   this.builder=builder;
  }
  
    public    House  constructHouse() {
    	builder.buildBasement();
    	builder.buildStructure();
    	builder.buildRoof();
    	builder.buildInterior();
    	return builder.createHouse();
    }
  
  

}
