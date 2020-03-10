package com.nt.ad;

import com.nt.component.IceCream;

public abstract class IceCreamDecorator implements IceCream {
	private IceCream iceCream;
	
	
	public IceCreamDecorator(IceCream iceCream) {
		this.iceCream = iceCream;
	}


	@Override
	public   void prepare() {
		iceCream.prepare();
	}
	

}
