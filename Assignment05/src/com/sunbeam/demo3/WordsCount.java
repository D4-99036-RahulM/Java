package com.sunbeam.demo3;

import java.util.Scanner;

public class WordsCount {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String str = sc.nextLine();

	        
	        str = str.trim();

	        int count;

	        
	        if (str.length() == 0) {
	            count = 0;
	        } else {
	          
	            String words[] = str.split("\\s+");
	            count = words.length; 

	        System.out.println("Number of words: " + count);

	        sc.close();
	    }
	}
}
