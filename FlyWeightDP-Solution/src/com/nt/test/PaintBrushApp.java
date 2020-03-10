package com.nt.test;

import com.nt.factory.ShapeFactory;
import com.nt.shape.Shape;

public class PaintBrushApp {

	public static void main(String[] args) {
		Shape shape=null;
		//draw  10000 circcles
		for(int i=1;i<=100;++i) {
			shape=ShapeFactory.getShape("circle");
			shape.draw(i+10,"white"+i,"dashed"+i);
		}
		System.out.println("..........................................");
		
		//draw  10000 circcles
				for(int i=1;i<=100;++i) {
					shape=ShapeFactory.getShape("square");
					shape.draw(i+10,"red"+i,"thick line"+i);
				}
				System.out.println("..........................................");
	}//main
}//class
