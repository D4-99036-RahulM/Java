package com.sunbeam.one;

public class InvoiceTest {
    public static void main(String[] args) {
        // 1. Create a valid invoice object
        // (Part Number, Description, Quantity, Price)
        Invoice inv1 = new Invoice("A100", "Wireless Mouse", 5, 499.00);

        // 2. Display the initial details
        System.out.println("--- Invoice 1 Details ---");
        System.out.println("Part Number: " + inv1.getPartNumber());
        System.out.println("Description: " + inv1.getPartDescription());
        System.out.println("Quantity: " + inv1.getQuantity());
        System.out.println("Price per Item: ₹" + inv1.getPricePerItem());
        System.out.println("Total Amount: ₹" + inv1.getInvoiceAmount());
        System.out.println(); // Prints a blank line

        // 3. Test negative values to see if the validation works
        Invoice inv2 = new Invoice("B200", "Keyboard", -3, -899.00);

        System.out.println("--- Invoice 2 Details (Negative Inputs Test) ---");
        System.out.println("Quantity (should be 0): " + inv2.getQuantity());
        System.out.println("Price (should be 0.0): ₹" + inv2.getPricePerItem());
        System.out.println("Total Amount (should be 0.0): ₹" + inv2.getInvoiceAmount());
    }
}
