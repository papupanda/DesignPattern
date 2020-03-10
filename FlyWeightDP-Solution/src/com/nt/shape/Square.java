package com.nt.shape;

public class Square implements Shape {
	private  String label;
	
	public Square() {
		System.out.println("Square:: 0-param constructor");
		label="square";
	}

	

	@Override
	public void draw(int side,String fillColor,String lineStyle) {
		System.out.println("drawing Square  with  side "+side+" ,label= "+label+" fillColor="+fillColor+" line Style="+lineStyle );
	}

}
