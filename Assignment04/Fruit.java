package com.sunbeam.fruits;

public abstract class Fruit {
    // Instance variables
    private String name;
    private String color;
    private double weight;
    private boolean isFresh;

    // Constructor
    public Fruit(String name, String color, double weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.isFresh = true; 
    }

   
    public abstract String taste();

    // Getters and Setters
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isFresh() {
        return isFresh;
    }

    public void setFresh(boolean fresh) {
        isFresh = fresh;
    }


    @Override
    public String toString() {
        return "Name: " + name + ", Color: " + color + ", Weight: " + weight + "kg";
    }
}
