package com.sunbeam.selfStudy.one;

import java.util.Scanner;


class Address {
 String city;
 String state;


 Address(String city, String state) {
     this.city = city;
     this.state = state;
 }

 
 void displayAddress() {
     System.out.println("City: " + city);
     System.out.println("State: " + state);
 }
}


class Student {
 int id;
 String name;
 double marks;
 Address address;


 Student() {
     this.id = 0;
     this.name = "Unknown";
     this.marks = 0.0;
     this.address = new Address("Unknown", "Unknown");
 }


 Student(int id, String name) {
     this.id = id;
     this.name = name;
     this.marks = 0.0;
     this.address = new Address("Unknown", "Unknown");
 }

 
 Student(int id, String name, double marks, Address address) {
     this.id = id;
     this.name = name;
     this.marks = marks;
     this.address = address;
 }

 Student(Student other) {
     this.id = other.id;
     this.name = other.name;
     this.marks = other.marks;
     this.address = other.address;
 }


 Student(Student other, boolean deepCopy) {
     this.id = other.id;
     this.name = other.name;
     this.marks = other.marks;

     if (deepCopy) {
         this.address = new Address(
             other.address.city,
             other.address.state
         );
     } else {
         this.address = other.address;
     }
 }

 
 void display() {
     System.out.println("ID: " + id);
     System.out.println("Name: " + name);
     System.out.println("Marks: " + marks);
     address.displayAddress();
     System.out.println("--------------------");
 }
}
public class StudentManagement {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        
	        System.out.print("Enter student ID: ");
	        int id = sc.nextInt();
	        sc.nextLine();

	        System.out.print("Enter student name: ");
	        String name = sc.nextLine();

	        System.out.print("Enter marks: ");
	        double marks = sc.nextDouble();
	        sc.nextLine();

	        System.out.print("Enter city: ");
	        String city = sc.nextLine();

	        System.out.print("Enter state: ");
	        String state = sc.nextLine();

	        
	        Address address = new Address(city, state);
	        Student original = new Student(id, name, marks, address);

	        
	        Student shallow = new Student(original);

	        
	        Student deep = new Student(original, true);

	        System.out.println("\n--- Original Student ---");
	        original.display();

	        System.out.println("--- Shallow Copy ---");
	        shallow.display();

	        System.out.println("--- Deep Copy ---");
	        deep.display();

	       
	        original.address.city = "Pune";

	        System.out.println("\nAfter changing original city to Pune:");

	        System.out.println("--- Original ---");
	        original.display();

	        System.out.println("--- Shallow Copy ---");
	        shallow.display();

	        System.out.println("--- Deep Copy ---");
	        deep.display();

	        sc.close();
	    }
}



