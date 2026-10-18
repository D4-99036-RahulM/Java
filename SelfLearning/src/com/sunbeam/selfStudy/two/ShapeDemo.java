package com.sunbeam.selfStudy.two;

abstract class Shape {

   
    abstract double area();

    
    double volume() {
        return 0.0;
    }
}

abstract class TwoDShape extends Shape {

    @Override
    abstract double area();
}

abstract class ThreeDShape extends Shape {

   
    @Override
    abstract double area();

    @Override
    abstract double volume();
}

class Circle extends TwoDShape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends TwoDShape {
    private double length;
    private double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}

class Sphere extends ThreeDShape {
    private double radius;

    Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    double volume() {
        return (4.0 / 3.0) * Math.PI
                * radius * radius * radius;
    }
}

class Cube extends ThreeDShape {
    private double side;

    Cube(double side) {
        this.side = side;
    }

    @Override
    double area() {
        return 6 * side * side;
    }

    @Override
    double volume() {
        return side * side * side;
    }
}

public class ShapeDemo {

	 public static void main(String[] args) {

	       
	        Shape[] shapes = {
	            new Circle(5),
	            new Rectangle(4, 6),
	            new Sphere(3),
	            new Cube(4)
	        };

	        
	        for (Shape shape : shapes) {
	            System.out.println(
	                shape.getClass().getSimpleName()
	            );

	            System.out.printf(
	                "Area: %.2f%n", shape.area()
	            );

	            System.out.printf(
	                "Volume: %.2f%n", shape.volume()
	            );

	            System.out.println("------------------");
	        }
	    }
	
}


