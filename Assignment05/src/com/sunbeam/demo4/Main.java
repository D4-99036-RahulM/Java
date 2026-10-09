package com.sunbeam.demo4;

public class Main {

	 public static void main(String[] args) {

	        
	        for (TrafficLight light : TrafficLight.values()) {
	            System.out.println(
	                light + " : " + light.getDuration() + " seconds"
	            );
	        }
	 }
	 }
