package com.sunbeam.fruits;

public class Chiku extends Fruit {

    public Chiku(String color, double weight, String name) {
        super(name, color, weight);
    }

    @Override
    public String taste() {
        return "sour";
    }
}
