package com.nt.shape;

public class Square implements Shape {
	private  String label;
	private  int side;
	private  String  fillColor;
	private String lineStyle;
	
	public Square() {
		System.out.println("Circle:: 0-param constructor");
		label="square";
	}

	
	
	

	public void setArg(int side) {
		this.side = side;
	}

	
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	
	public void setLineStyle(String lineStyle) {
		this.lineStyle = lineStyle;
	}

	@Override
	public void draw() {
		System.out.println("drawing Square  with  side "+side+" ,label= "+label+" fillColor="+fillColor+" line Style="+lineStyle );
	}

}
