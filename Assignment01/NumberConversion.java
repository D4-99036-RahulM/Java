import java.util.Scanner;

public class NumberConversion {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number");
		 int num =scanner.nextInt();
		 
		 System.out.println("Given Number: " + num);
		 System.out.println("Given Number to Binary: " + Integer.toBinaryString(num));
		 System.out.println("Given Number to Octal: " + Integer.toOctalString(num));
		 System.out.println("Given Number to Hexadecimal: " + Integer.toHexString(num));
		 
		 scanner.close();
	}
}
