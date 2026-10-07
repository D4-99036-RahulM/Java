package com.sunbeam.fruits;

public class Mango extends Fruit {
    
    public Mango(String color, double weight, String name) {
        super(name, color, weight);
    }

    @Override
    public String taste() {
        return "sweet";
    }
}
