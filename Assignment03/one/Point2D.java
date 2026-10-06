package com.sunbeam.one;

public class Point2D {

	
    private double x;
    private double y;

   
    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    
    public String getDetails() {
        return "Point coordinates: (" + this.x + ", " + this.y + ")";
    }

    
    public boolean isEqual(Point2D anotherPoint) {
        return this.x == anotherPoint.x && this.y == anotherPoint.y;
    }

   
    public double calculateDistance(Point2D anotherPoint) {
     
        double xDiff = anotherPoint.x - this.x;
        double yDiff = anotherPoint.y - this.y;
        
        return Math.sqrt(Math.pow(xDiff, 2) + Math.pow(yDiff, 2));
	

    }
}
