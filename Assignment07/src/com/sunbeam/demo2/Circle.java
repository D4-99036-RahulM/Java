package com.sunbeam.demo2;

public class Circle {

	 private double myX;
	    private double myY;
	    private double myDiameter;

	   
	    Circle() {
	        myX = 0;
	        myY = 0;
	        myDiameter = 100;
	    }

	   
	    Circle(double x, double y, double diameter)
	            throws NegativeDiameterException {
	        if (diameter < 0) {
	            throw new NegativeDiameterException();
	        }

	        myX = x;
	        myY = y;
	        myDiameter = diameter;
	    }

	   
	    public double getX() {
	        return myX;
	    }

	    
	    public double getY() {
	        return myY;
	    }

	    
	    public double getDiameter() {
	        return myDiameter;
	    }
}
