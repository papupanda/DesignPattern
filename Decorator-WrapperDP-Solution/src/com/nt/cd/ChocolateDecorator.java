package com.nt.cd;

import com.nt.ad.IceCreamDecorator;
import com.nt.component.IceCream;

public class ChocolateDecorator extends IceCreamDecorator {
	public ChocolateDecorator(IceCream iceCream) {
		super(iceCream);
	}
	public void addChocolate() {
		System.out.println("adding Chocolate.....");
	}
	@Override
	public void prepare() {
		super.prepare();
		addChocolate();
		
	}


	

}
