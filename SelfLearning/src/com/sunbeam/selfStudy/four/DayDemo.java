package com.sunbeam.selfStudy.four;

import java.util.Scanner;


enum Day {
 MONDAY,
 TUESDAY,
 WEDNESDAY,
 THURSDAY,
 FRIDAY,
 SATURDAY,
 SUNDAY;

 
 boolean isWeekend() {
     return this == SATURDAY || this == SUNDAY;
 }

 
 boolean weekday() {
     return !isWeekend();
 }
}
public class DayDemo {

	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	       
	        System.out.print("Enter a day of the week: ");
	        String input = sc.nextLine();

	        try {
	           
	            Day day = Day.valueOf(input.trim().toUpperCase());

	           
	            System.out.println("Day: " + day);
	            System.out.println("Is weekend? " + day.isWeekend());
	            System.out.println("Is weekday? " + day.weekday());

	        } catch (IllegalArgumentException e) {
	           
	            System.out.println("Invalid day entered!");
	        }

	        sc.close();
	    }
}





