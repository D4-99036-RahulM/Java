package com.sunbeam.selfStudy.three;

import java.util.ArrayList;
import java.util.List;


abstract class Animal {
    private String name;
    private int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    // Each animal must define its sound.
    abstract void makeSound();

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}


abstract class Mammal extends Animal {

    Mammal(String name, int age) {
        super(name, age);
    }
}


abstract class Bird extends Animal {

    Bird(String name, int age) {
        super(name, age);
    }
}

// IS-A: Lion is a Mammal and an Animal.
class Lion extends Mammal {

    Lion(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("Sound: Roar");
    }
}


class Parrot extends Bird {

    Parrot(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("Sound: Squawk");
    }
}


class Enclosure {
    private String enclosureName;
    private List<Animal> animals;

    Enclosure(String enclosureName) {
        this.enclosureName = enclosureName;
        this.animals = new ArrayList<>();
    }

    void addAnimal(Animal animal) {
        animals.add(animal);
        System.out.println(
            animal.getName() + " added to " + enclosureName
        );
    }

    void displayAnimals() {
        System.out.println("\nEnclosure: " + enclosureName);

        for (Animal animal : animals) {
            animal.displayInfo();
            animal.makeSound();
            System.out.println("----------------");
        }
    }
}


class Zoo {
    private String zooName;
    private List<Enclosure> enclosures;

    Zoo(String zooName) {
        this.zooName = zooName;
        this.enclosures = new ArrayList<>();
    }

    void addEnclosure(Enclosure enclosure) {
        enclosures.add(enclosure);
    }

    void displayZoo() {
        System.out.println("\nWelcome to " + zooName);

        for (Enclosure enclosure : enclosures) {
            enclosure.displayAnimals();
        }
    }
}
public class ZooManagementSystem {

	 public static void main(String[] args) {

	       
	        Zoo zoo = new Zoo("Wildlife Park");

	     
	        Enclosure lionEnclosure = new Enclosure("Lion Enclosure");
	        Enclosure birdEnclosure = new Enclosure("Bird Enclosure");

	        
	        Animal lion = new Lion("Simba", 5);
	        Animal parrot = new Parrot("Mithu", 2);

	        
	        lionEnclosure.addAnimal(lion);
	        birdEnclosure.addAnimal(parrot);

	       
	        zoo.addEnclosure(lionEnclosure);
	        zoo.addEnclosure(birdEnclosure);

	        
	        zoo.displayZoo();
	    }
}

