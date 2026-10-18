package com.sunbeam.selfStudy.eight;

import java.util.Scanner;
import java.util.stream.LongStream;


public class FactorialStream {

	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	       
	        System.out.print("Enter a non-negative number: ");
	        int n = sc.nextInt();

	        
	        if (n < 0) {
	            System.out.println("Factorial is not defined for negative integers.");
	        } else if (n > 20) {
	            System.out.println("Please enter a number between 0 and 20.");
	        } else {
	            
	            long factorial = LongStream.rangeClosed(1, n)
	                    .reduce(1L, (a, b) -> a * b);

	           
	            System.out.println("Factorial of " + n + " = " + factorial);
	        }

	        sc.close();
	    }
}

