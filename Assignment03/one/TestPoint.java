package com.sunbeam.one;

import java.util.Scanner;

public class TestPoint {

	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);

	     // 1. Accept inputs for Point 1
	     System.out.println("Enter x and y coordinates for Point 1: ");
	     double x1 = sc.nextDouble();
	     double y1 = sc.nextDouble();
	     Point2D p1 = new Point2D(x1, y1);

	     // 2. Accept inputs for Point 2
	     System.out.println("Enter x and y coordinates for Point 2: ");
	     double x2 = sc.nextDouble();
	     double y2 = sc.nextDouble();
	     Point2D p2 = new Point2D(x2, y2);

	     // 3. Display point details
	     System.out.println(p1.getDetails());
	     System.out.println(p2.getDetails());

	     // 4. Check if they are equal or calculate distance
	     if (p1.isEqual(p2)) {
	         System.out.println("p1 and p2 are located at the same position.");
	     } else {
	         System.out.println("Points are different.");
	         double distance = p1.calculateDistance(p2);
	         System.out.println("Distance between p1 and p2: " + distance);
	     }

	     sc.close();
	 }
}


