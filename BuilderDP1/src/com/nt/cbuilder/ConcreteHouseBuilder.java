package com.nt.cbuilder;

import com.nt.builder.HouseBuilder;
import com.nt.product.ConcreateRoof;
import com.nt.product.ConcreteBasement;
import com.nt.product.ConcreteStructure;
import com.nt.product.House;
import com.nt.product.MarbleInterior;

public class ConcreteHouseBuilder implements HouseBuilder {
	private House house;
	
	public ConcreteHouseBuilder(House house) {
		this.house=house;
	}

	@Override
	public void buildBasement() {
	    house.setBasement(new ConcreteBasement());
	}

	@Override
	public void buildStructure() {
		house.setStructure(new ConcreteStructure());
	}

	@Override
	public void buildRoof() {
		house.setRoof(new ConcreateRoof());
	}

	@Override
	public void buildInterior() {
		house.setInterior(new MarbleInterior());
	}

	@Override
	public House createHouse() {
		return house;
	}

}
