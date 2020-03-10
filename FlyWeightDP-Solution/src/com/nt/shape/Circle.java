package com.nt.shape;

public class Circle implements Shape {
	private  String label;
	public Circle() {
		System.out.println("Circle:: 0-param constructor");
		label="circle";
	}

	
	@Override
	public void draw(int radius,String fillColor,String lineStyle) {
		System.out.println("drawing circle  with  radius "+radius+" ,label= "+label+" fillColor="+fillColor+" line Style="+lineStyle );
	}

}
