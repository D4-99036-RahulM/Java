package com.sunbeam.demo4;

public enum TrafficLight {

	 RED(60),
	 GREEN(45),
	 YELLOW(5);

	    private int duration; 
	  
	    TrafficLight(int duration) {
	        this.duration = duration;
	    }

	    
	    public int getDuration() {
	        return duration;
	    }
}
