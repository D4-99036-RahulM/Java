package com.sunbeam.selfStudy.five;

import java.util.Scanner;

public class TextAnylyzer {

	
    static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);

        return ch == 'a' || ch == 'e' ||
               ch == 'i' || ch == 'o' ||
               ch == 'u';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a line of text: ");
        String text = sc.nextLine();

        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int spaces = 0;
        int specialCharacters = 0;
        int uppercase = 0;
        int lowercase = 0;

        
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (Character.isLetter(ch)) {
               
                if (Character.isUpperCase(ch)) {
                    uppercase++;
                } else if (Character.isLowerCase(ch)) {
                    lowercase++;
                }

               
                if (isVowel(ch)) {
                    vowels++;
                } else {
                    consonants++;
                }

            } else if (Character.isDigit(ch)) {
                digits++;

            } else if (Character.isWhitespace(ch)) {
                spaces++;

            } else {
                specialCharacters++;
            }
        }

       
        String trimmedText = text.trim();
        int words = trimmedText.isEmpty()
                ? 0
                : trimmedText.split("\\s+").length;

       
        int letters = vowels + consonants;

        double vowelPercentage = letters == 0
                ? 0.0
                : (vowels * 100.0) / letters;

        double consonantPercentage = letters == 0
                ? 0.0
                : (consonants * 100.0) / letters;

       
        System.out.println("\n===== TEXT STATISTICS =====");
        System.out.println("Original text: " + text);
        System.out.println("Total characters: " + text.length());
        System.out.println("Total words: " + words);
        System.out.println("Total letters: " + letters);
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Whitespace characters: " + spaces);
        System.out.println("Special characters: " + specialCharacters);
        System.out.println("Uppercase letters: " + uppercase);
        System.out.println("Lowercase letters: " + lowercase);
        System.out.printf("Vowel percentage: %.2f%%%n",
                vowelPercentage);
        System.out.printf("Consonant percentage: %.2f%%%n",
                consonantPercentage);

        sc.close();
    }
}



