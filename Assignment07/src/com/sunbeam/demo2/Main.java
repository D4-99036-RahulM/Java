package com.sunbeam.demo2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            
            System.out.print("Enter center X: ");
            double x = sc.nextDouble();

            System.out.print("Enter center Y: ");
            double y = sc.nextDouble();

            System.out.print("Enter diameter: ");
            double diameter = sc.nextDouble();

           
            Circle c = new Circle(x, y, diameter);

           
            System.out.println("Center X: " + c.getX());
            System.out.println("Center Y: " + c.getY());
            System.out.println("Diameter: " + c.getDiameter());
        }
        catch (NegativeDiameterException e) {
            
            System.out.println(e.getMessage());
        }

        sc.close(); 
    }
}
