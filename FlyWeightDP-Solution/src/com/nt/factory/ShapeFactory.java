package com.nt.factory;

import java.util.HashMap;
import java.util.Map;

import com.nt.shape.Circle;
import com.nt.shape.Shape;
import com.nt.shape.Square;

public class ShapeFactory {
	private  static  Map<String ,Shape>  cache=new HashMap(); 
	
	public synchronized static    Shape  getShape(String shapeType) {
		    Shape shape=null;
		    if(!cache.containsKey(shapeType)) {
		    if(shapeType.equalsIgnoreCase("circle"))
		    	shape=new Circle();
		    else if(shapeType.equalsIgnoreCase("square"))
		    	shape=new Square();
		    else
		    	throw new IllegalArgumentException("Invalid Shape");
		      cache.put(shapeType, shape);
		    }
		    return cache.get(shapeType);
	}

}
