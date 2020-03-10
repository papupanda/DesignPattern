package com.nt.test;

import com.nt.icecream.DryFruitButterScothIceCream;
import com.nt.icecream.HoneyDryFruitStrawberryIceCream;
import com.nt.icecream.IceCream;
import com.nt.icecream.StrawberryIceCream;

public class DecoratorProblemTest {

	public static void main(String[] args) {
		IceCream cream=null;
		cream=new StrawberryIceCream();
		cream.prepare();
		System.out.println("...........................");
		cream=new DryFruitButterScothIceCream();
		cream.prepare();
		System.out.println("...................");
		cream=new HoneyDryFruitStrawberryIceCream();
		cream.prepare();
		

	}

}
