package com.nt.cd;

import com.nt.ad.IceCreamDecorator;
import com.nt.component.IceCream;

public class DryFruitDecorator extends IceCreamDecorator {
	public DryFruitDecorator(IceCream iceCream) {
		super(iceCream);
	}
	public void addDryFruits() {
		System.out.println("adding dryfruits.....");
	}
	@Override
	public void prepare() {
		super.prepare();
		addDryFruits();
		
	}


	

}
