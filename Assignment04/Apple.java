package com.sunbeam.fruits;

public class Apple extends Fruit {

    public Apple(String color, double weight, String name) {
        super(name, color, weight);
    }

    @Override
    public String taste() {
        return "sweet and sour";
    }
}
