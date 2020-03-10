package com.nt.cbuilder;

import com.nt.builder.HouseBuilder;
import com.nt.product.ConcreateRoof;
import com.nt.product.ConcreteBasement;
import com.nt.product.ConcreteStructure;
import com.nt.product.House;
import com.nt.product.MarbleInterior;
import com.nt.product.WoodenBasement;
import com.nt.product.WoodenInterior;
import com.nt.product.WoodenRoof;
import com.nt.product.WoodenStructure;

public class WoodenHouseBuilder implements HouseBuilder {
	private House house;
	
	public WoodenHouseBuilder(House house) {
		this.house=house;
	}

	@Override
	public void buildBasement() {
	    house.setBasement(new WoodenBasement());
	}

	@Override
	public void buildStructure() {
		house.setStructure(new WoodenStructure());
	}

	@Override
	public void buildRoof() {
		house.setRoof(new WoodenRoof());
	}

	@Override
	public void buildInterior() {
		house.setInterior(new WoodenInterior());
	}

	@Override
	public House createHouse() {
		return house;
	}

}
