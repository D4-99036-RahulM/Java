package com.sunbeam.one;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack stack = null;
        boolean exit = false;

        while (!exit) {
            System.out.println("\n--- MENU ---");
            System.out.println("1 -- Choose Fixed Stack");
            System.out.println("2 -- Choose Growable Stack");
            System.out.println("3 -- Push Employee");
            System.out.println("4 -- Pop Employee");
            System.out.println("5 -- Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    if (stack != null) {
                        System.out.println("Stack already chosen!");
                    } else {
                        stack = new FixedStack();
                        System.out.println("Fixed Stack chosen.");
                    }
                    break;
                case 2:
                    if (stack != null) {
                        System.out.println("Stack already chosen!");
                    } else {
                        stack = new GrowableStack();
                        System.out.println("Growable Stack chosen.");
                    }
                    break;
                case 3:
                    if (stack != null) {
                        System.out.print("Enter employee ID: ");
                        int id = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        System.out.print("Enter employee name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter employee salary: ");
                        double salary = scanner.nextDouble();
                        stack.push(new Employee(id, name, salary));
                    } else {
                        System.out.println("NO stack chosen!!!");
                    }
                    break;
                case 4:
                    if (stack != null) {
                        Employee emp = stack.pop();
                        if (emp != null) {
                            System.out.println("Popped: " + emp);
                        } else {
                            System.out.println("Stack is empty!");
                        }
                    } else {
                        System.out.println("NO stack chosen!!!");
                    }
                    break;
                case 5:
                    exit = true;
                    System.out.println("Exiting application. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }
        }
        scanner.close();
    }
}
