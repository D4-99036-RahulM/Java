package com.sunbeam.selfStudy.ten;

import java.util.stream.IntStream;
import java.util.IntSummaryStatistics;

public class IntStreamDemo {

	  public static void main(String[] args) {

	        
	        IntStream stream = IntStream.rangeClosed(1, 10);

	       
	        int sum = IntStream.rangeClosed(1, 10).sum();
	        System.out.println("Sum: " + sum);

	      
	        IntSummaryStatistics stats =
	                IntStream.rangeClosed(1, 10).summaryStatistics();

	        System.out.println("Count: " + stats.getCount());
	        System.out.println("Sum: " + stats.getSum());
	        System.out.println("Minimum: " + stats.getMin());
	        System.out.println("Maximum: " + stats.getMax());
	        System.out.println("Average: " + stats.getAverage());

	    }
}

