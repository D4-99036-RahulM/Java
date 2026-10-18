package com.sunbeam.selfStudy.twelve;

import java.util.Arrays;
import java.util.Comparator;

public class SelectionSortDemo {

	static <T> void selectionSort(T[] arr, Comparator<T> c) {

       
        for (int i = 0; i < arr.length - 1; i++) {

            
            for (int j = i + 1; j < arr.length; j++) {

                
                if (c.compare(arr[i], arr[j]) > 0) {
                    T temp = arr[i];  
                    arr[i] = arr[j];  
                    arr[j] = temp;   
                }
            }
        }
    }

    public static void main(String[] args) {

       
        Integer[] numbers = {50, 20, 40, 10, 30};

        
        selectionSort(numbers, Comparator.naturalOrder());

        System.out.println("Sorted integers: " + Arrays.toString(numbers));

       
        String[] names = {"Rahul", "Amit", "Chetan", "Bhavesh"};

        
        selectionSort(names, Comparator.naturalOrder());

        System.out.println("Sorted names: " + Arrays.toString(names));
    }
}

