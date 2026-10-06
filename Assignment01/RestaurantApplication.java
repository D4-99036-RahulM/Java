import java.util.Scanner;

public class RestaurantApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String menu[] = {"Dosa", "Samosa", "Idli", "Panipuri", "Paratha", "Vada", "Dosa(spicy)", "Samosa(spicy)", "Bhel", "Momos"};
     // Add one more value at the end of the prices array
        double[] prices = {100.00, 60.00, 75.0, 50.00, 75.00, 65.00, 75.00, 80.00, 110.00, 90.00};

        
        double totalBill = 0.0;
        int choice;
        
        System.out.println("========== Welcome to our Food menu: ==========");
        
        do {
            
            System.out.println("\n--- Menu ---");
            for (int i = 0; i < menu.length; i++) {
                System.out.println((i + 1) + ". " + menu[i] + " - rs " + prices[i]);
            }
            System.out.println("10. Generate Bill");
            System.out.print("Enter your choice from (1-10): ");
            
            choice = scanner.nextInt();
            
            if (choice >= 1 && choice <= 9) {
                System.out.print("Enter quantity for " + menu[choice - 1] + ": ");
                int quantity = scanner.nextInt();
                
                if (quantity > 0) {
                    double itemTotal = prices[choice - 1] * quantity;
                    totalBill += itemTotal;
                    System.out.println("Added " + quantity + " " + menu[choice - 1] + "(s) to your bill. (rs" + itemTotal + ")");
                } else {
                    System.out.println("Invalid quantity. Please enter a value greater than 0.");
                }
            } else if (choice == 10) {
                System.out.println("\n====================");
                System.out.println("Total Bill: rs" + totalBill);
                System.out.println("Thank you for visiting! Exiting...");
                System.out.println("====================");
            } else {
                System.out.println("Invalid choice! Please select a valid option from 1 to 10.");
            }
            
        } while (choice != 10);
        
        scanner.close();
    }
}
