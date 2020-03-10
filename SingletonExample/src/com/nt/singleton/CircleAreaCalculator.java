package com.nt.singleton;

public enum CircleAreaCalculator {
	INSTANCE;
	 private final float PI=3.14f;
	 
	 public float calcArea(int r) {
		 return PI*r*r;
	 }
	 
	 public  static CircleAreaCalculator getInstance() {
		 return INSTANCE;
	 }
	

}
