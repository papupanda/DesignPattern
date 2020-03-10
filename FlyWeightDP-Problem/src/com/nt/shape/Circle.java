package com.nt.shape;

public class Circle implements Shape {
	private  String label;
	private  int radius;
	private  String  fillColor;
	private String lineStyle;
	
	public Circle() {
		System.out.println("Circle:: 0-param constructor");
		label="circle";
	}

	
	
	

	public void setArg(int radius) {
		this.radius = radius;
	}

	
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	
	public void setLineStyle(String lineStyle) {
		this.lineStyle = lineStyle;
	}

	@Override
	public void draw() {
		System.out.println("drawing circle  with  radius "+radius+" ,label= "+label+" fillColor="+fillColor+" line Style="+lineStyle );
	}

}
