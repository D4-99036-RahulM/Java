package com.sunbeam.two;

import java.util.Scanner;

public class CreditLimitCalculator{

	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        // 1. Input all the required facts as integers
	        System.out.print("Enter account number: ");
	        int accountNumber = input.nextInt();

	        System.out.print("Enter beginning balance: ");
	        int beginningBalance = input.nextInt();

	        System.out.print("Enter total charges this month: ");
	        int totalCharges = input.nextInt();

	        System.out.print("Enter total credits applied this month: ");
	        int totalCredits = input.nextInt();

	        System.out.print("Enter allowed credit limit: ");
	        int creditLimit = input.nextInt();

	        // 2. Calculate the new balance
	        int newBalance = beginningBalance + totalCharges - totalCredits;

	        // 3. Display the new balance
	        System.out.println("\nAccount Number: " + accountNumber);
	        System.out.println("New Balance: " + newBalance);

	        // 4. Determine if the new balance exceeds the credit limit
	        if (newBalance > creditLimit) {
	            System.out.println("Credit limit exceeded");
	        } else {
	            System.out.println("Credit limit is within bounds.");
	        }

	        input.close();
}

}