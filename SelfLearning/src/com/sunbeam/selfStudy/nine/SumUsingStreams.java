package com.sunbeam.selfStudy.nine;
import java.util.Scanner;
import java.util.stream.IntStream;

public class SumUsingStreams {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("How many integers? ");
        int n = sc.nextInt();

       
        if (n < 0) {
            System.out.println("Count cannot be negative.");
            sc.close();
            return;
        }

        
        int[] numbers = new int[n];

       
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        
        int sum = IntStream.of(numbers).sum();

       
        System.out.println("Sum = " + sum);

        sc.close();
    }
}


