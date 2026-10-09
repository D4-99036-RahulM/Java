package com.sunbeam.demo2;

import java.util.Scanner;

public class Palindrome {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String str = sc.nextLine();

	        String rev = "";

	        // Reverse the string
	        for (int i = str.length() - 1; i >= 0; i--) {
	            rev = rev + str.charAt(i);
	        }

	        // Compare original and reversed strings
	        if (str.equalsIgnoreCase(rev)) {
	            System.out.println("String is a palindrome.");
	        } else {
	            System.out.println("String is not a palindrome.");
	        }

	        sc.close();
	    }
}
