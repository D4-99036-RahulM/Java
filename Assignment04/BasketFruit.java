package com.sunbeam.fruits;

import java.util.Scanner;

public class BasketFruit {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the size of the fruit basket");
		int size = scanner.nextInt();
		
		Fruit[] basket = new Fruit[size];
		int counter=0;
		
		int choice;
		do {
			System.out.println("\n ---- Fruit basket menu");
			System.out.println("0. Exit");
			System.out.println("1. Add mango");
			System.out.println("2. Add Chiku");
			System.out.println("3. Add apple");
			System.out.println("4. Display names of all the fruits in basket");
			System.out.println("5. Display details of all the fresh fruits");
			System.out.println("6. Display tastes of all the stale fruits");
			System.out.println("7. Mark a fruit as stale");
			System.out.println("8. Mark all sour fruits stale");
			System.out.println("Enter your choice: ");
			
			choice = scanner.nextInt();
			
			switch(choice) {
				case 0:
					System.out.println("Exiting application");
					break;
					
				case 1:
					if(counter<size) {
						System.out.println("Enter name,weight,color: ");
						String name = scanner.next();
						double weight = scanner.nextDouble();
						String color = scanner.next();
						basket[counter++] = new Mango(color,weight,name);
						System.out.println("Mango added successfully");
					} else {
						System.out.println("Basket is full..");
					}
					break;
				
				case 2:
					if(counter<size) {
						System.out.println("Enter name,weight,color:");
						String name = scanner.next();
						double weight = scanner.nextDouble();
						String color = scanner.next();
						basket[counter++] = new Chiku(color,weight,name);
						System.out.println("Chiku added successfully");
					}else {
						System.out.println("Basket is full");
					}
					break;
				
				case 3 : 
					if(counter<size) {
						System.out.println("Enter name,weight,color:");
						String name = scanner.next();
						double weight =scanner.nextDouble();
						String color = scanner.next();
						basket[counter++] = new Apple(color, weight, name);
					}else {
						System.out.println("Basket is full..");
					}
					break;
					
				case 4:
					System.out.println("Fruits in basket");
					for(Fruit f: basket) {
						if(f != null) {
							System.out.println(" - " +f.getName());
						}
					}
					break;
					
				case 5:
					System.out.println("Fresh fruit details");
					for(Fruit f : basket) {
						if(f != null && f.isFresh()) {
							System.out.println(f.toString() + "| Taste: " + f.taste());
						}
					}
					break;
					
				case 6:
					System.out.println("Taste of stale fruits");
					for(Fruit f: basket) {
						if(f!= null && f.isFresh()) {
							System.out.println("- " + f.getName() + "tastes " + f.taste());
						}
					}
					break;
				
				case 7 :
					System.out.print("Enter index to mark as stale (0 to " + (counter - 1) + "): ");
					int index = scanner.nextInt();
					if(index>=0 && index<counter && basket[index] !=null) {
						basket[index].setFresh(false);
						System.out.println(basket[index].getName() + " at index " + index + " marked stale.");
                    } else {
                        System.out.println("Error: innvalid index");
                    }
                    break;
                    
                case 8: 
                    System.out.println("Marking all sour fruits as stale...");
                    for (Fruit f : basket) {
                        if (f != null && f.taste().equals("sour")) {
                            f.setFresh(false);
                        }
                    }
                    System.out.println("Operation complete.");
                    break;
                    
                default:
                    System.out.println("Invalid Option! please try again.");
            }
        } while (choice != 0);
        
			scanner.close();
			}
	
	
	}
