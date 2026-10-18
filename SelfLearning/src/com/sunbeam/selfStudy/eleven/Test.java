package com.sunbeam.selfStudy.eleven;

public class Test {

	
    public static <T extends Number & Comparable<T>> T findMin(T[] arr) {

      
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty or null");
        }

        
        T min = arr[0];

       
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(min) < 0) {
                min = arr[i];
            }
        }

      
        return min;
    }

    public static void main(String[] args) {

        Integer[] integers = {40, 10, 25, 5, 30};
        Double[] decimals = {4.5, 2.1, 8.7, 1.2};

        System.out.println("Minimum Integer: " + findMin(integers));
        System.out.println("Minimum Double: " + findMin(decimals));
    }
}

