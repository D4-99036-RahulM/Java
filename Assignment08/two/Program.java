package com.sunbeam.two;

import java.util.ArrayList;
import java.util.Collections;

public class Program {

	public static void main(String[] args) {
		
		ArrayList<String> colors = new ArrayList<String>();

        
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("White");
        colors.add("Black");


        System.out.println("Original list: " + colors);

        
        Collections.sort(colors);

        
        System.out.println("Sorted list:   " + colors);
    }
	
}

