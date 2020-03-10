package com.nt.factory;

import com.nt.shape.Circle;
import com.nt.shape.Shape;
import com.nt.shape.Square;

public class ShapeFactory {
	
	public static    Shape  createShape(String shapeType) {
		    Shape shape=null;
		    if(shapeType.equalsIgnoreCase("circle"))
		    	shape=new Circle();
		    else if(shapeType.equalsIgnoreCase("square"))
		    	shape=new Square();
		    else 
		    	throw new IllegalArgumentException("Invalid Shape");
		    return shape;
		
	}

}
