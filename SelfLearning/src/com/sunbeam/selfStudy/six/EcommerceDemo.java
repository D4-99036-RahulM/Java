package com.sunbeam.selfStudy.six;

import java.util.Scanner;


class ECommerceException extends Exception {
    ECommerceException(String message) {
        super(message);
    }
}


class PaymentException extends ECommerceException {
    PaymentException(String message) {
        super(message);
    }
}

class PaymentFailedException extends PaymentException {
    PaymentFailedException(String message) {
        super(message);
    }
}


class InventoryException extends ECommerceException {
    InventoryException(String message) {
        super(message);
    }
}

class OutOfStockException extends InventoryException {
    OutOfStockException(String message) {
        super(message);
    }
}


class ShippingException extends ECommerceException {
    ShippingException(String message) {
        super(message);
    }
}

class ShippingUnavailableException extends ShippingException {
    ShippingUnavailableException(String message) {
        super(message);
    }
}


class OrderService {

    
    void checkInventory(int stock, int quantity)
            throws OutOfStockException {

        if (quantity <= 0) {
            throw new IllegalArgumentException(
                "Quantity must be greater than zero."
            );
        }

        if (quantity > stock) {
            throw new OutOfStockException(
                "Requested quantity exceeds available stock."
            );
        }

        System.out.println("Inventory check successful.");
    }

   
    void processPayment(double amount, boolean paymentSuccessful)
            throws PaymentFailedException {

        if (amount <= 0) {
            throw new IllegalArgumentException(
                "Payment amount must be positive."
            );
        }

        if (!paymentSuccessful) {
            throw new PaymentFailedException(
                "Payment was declined."
            );
        }

        System.out.println("Payment successful: Rs. " + amount);
    }

  
    void arrangeShipping(boolean serviceAvailable)
            throws ShippingUnavailableException {

        if (!serviceAvailable) {
            throw new ShippingUnavailableException(
                "Shipping is unavailable for this location."
            );
        }

        System.out.println("Shipping arranged successfully.");
    }

   
    void placeOrder(int stock, int quantity,
                    double amount, boolean paymentSuccessful,
                    boolean shippingAvailable)
            throws ECommerceException {

        checkInventory(stock, quantity);
        processPayment(amount, paymentSuccessful);
        arrangeShipping(shippingAvailable);

        System.out.println("Order placed successfully!");
    }
}

public class EcommerceDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OrderService service = new OrderService();

        System.out.print("Enter available stock: ");
        int stock = sc.nextInt();

        System.out.print("Enter requested quantity: ");
        int quantity = sc.nextInt();

        System.out.print("Enter payment amount: ");
        double amount = sc.nextDouble();

        System.out.print("Is payment successful? (true/false): ");
        boolean paymentSuccessful = sc.nextBoolean();

        System.out.print("Is shipping available? (true/false): ");
        boolean shippingAvailable = sc.nextBoolean();

        try {
            service.placeOrder(
                stock,
                quantity,
                amount,
                paymentSuccessful,
                shippingAvailable
            );

        } catch (OutOfStockException e) {
            System.out.println("Inventory Error: " + e.getMessage());

        } catch (PaymentFailedException e) {
            System.out.println("Payment Error: " + e.getMessage());

        } catch (ShippingUnavailableException e) {
            System.out.println("Shipping Error: " + e.getMessage());

        } catch (ECommerceException e) {
           
            System.out.println("Order Error: " + e.getMessage());

        } catch (IllegalArgumentException e) {
           
            System.out.println("Input Error: " + e.getMessage());
        }

        sc.close();
    }
}



