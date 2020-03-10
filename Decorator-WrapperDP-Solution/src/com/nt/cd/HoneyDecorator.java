package com.nt.cd;

import com.nt.ad.IceCreamDecorator;
import com.nt.component.IceCream;

public class HoneyDecorator extends IceCreamDecorator {
	public HoneyDecorator(IceCream iceCream) {
		super(iceCream);
	}
	public void addHoney() {
		System.out.println("adding Honey.....");
	}
	@Override
	public void prepare() {
		super.prepare();
		addHoney();
		
	}


	

}
