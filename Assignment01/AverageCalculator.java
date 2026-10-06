import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter 1st number: ");
        if (scanner.hasNextDouble()) {
            double num1 = scanner.nextDouble();
            
            System.out.print("Enter 2nd number: ");
            if (scanner.hasNextDouble()) {
                double num2 = scanner.nextDouble();
                double average = (num1 + num2) / 2.0;
                System.out.println("Average of two numbers is " + average);
            } else {
                System.out.println("Error: Invalid input. Expected a double value.");
            }
        } else {
            System.out.println("Error: Invalid input. Expected a double value.");
        }
        
        scanner.close();
    }
}