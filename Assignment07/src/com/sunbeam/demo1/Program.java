package com.sunbeam.demo1;

import java.util.Scanner;

class ExceptionLineTooLong extends Exception {
    ExceptionLineTooLong() {
        super("The strings is too long");
    }
}



public class Program {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
         
            System.out.println("Enter a string:");
            String str = sc.nextLine();

           
            int length = str.length();
            System.out.println("Length of string: " + length);

            
            if (length > 80) {
                throw new ExceptionLineTooLong();
            }

            System.out.println("String length is valid.");
        } 
        catch (ExceptionLineTooLong e) {
            
            System.out.println(e.getMessage());
        }

        sc.close(); 
    }
}
