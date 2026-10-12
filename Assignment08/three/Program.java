package com.sunbeam.three;

import java.util.ArrayList;

public class Program {

	 public static void main(String[] args) {
	      
	        ArrayList<String> colors = new ArrayList<>();
	        colors.add("Red");    
	        colors.add("Green");  
	        colors.add("Blue");   

	        System.out.println("Original ArrayList: " + colors);

	        
	        colors.set(1, "White");

	        System.out.println("Updated ArrayList: " + colors);
	    }
	}



