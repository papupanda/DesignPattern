package com.nt.test;

import com.nt.factory.ShapeFactory;
import com.nt.shape.Shape;

public class PaintBrushApp {

	public static void main(String[] args) {
		Shape shape=null;
		//draw  10000 circcles
		for(int i=1;i<=10000;++i) {
			shape=ShapeFactory.createShape("circle");
			shape.setArg(i+10);
			shape.setFillColor("white"+i);
			shape.setLineStyle("dashed"+i);
			shape.draw();
		}
		System.out.println("..........................................");
		
		//draw  10000 circcles
				for(int i=1;i<=10000;++i) {
					shape=ShapeFactory.createShape("square");
					shape.setArg(i+10);
					shape.setFillColor("white"+i);
					shape.setLineStyle("dashed"+i);
					shape.draw();
				}
				System.out.println("..........................................");
		
		

	}//main
}//class
