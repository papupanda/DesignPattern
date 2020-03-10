package com.nt.test;

import com.nt.ccomponent.ButterScotchIceCream;
import com.nt.ccomponent.StrawberryIceCream;
import com.nt.ccomponent.VanilaIceCream;
import com.nt.cd.ChocolateDecorator;
import com.nt.cd.DryFruitDecorator;
import com.nt.cd.HoneyDecorator;
import com.nt.component.IceCream;

public class DecoratorSolutionTest {

	public static void main(String[] args) {
		IceCream cream=null;
		cream=new StrawberryIceCream();
		cream.prepare();
		System.out.println("...........................");
		cream=new DryFruitDecorator(new VanilaIceCream());
		cream.prepare();
		System.out.println("...................");
		cream=new  DryFruitDecorator(new ChocolateDecorator(new HoneyDecorator(new ButterScotchIceCream())));
		cream.prepare();
		

	}

}
