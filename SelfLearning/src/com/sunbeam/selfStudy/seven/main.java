package com.sunbeam.selfStudy.seven;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


class Product {
    private int id;
    private String name;
    private double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    int getId() {
        return id;
    }

    String getName() {
        return name;
    }

    double getPrice() {
        return price;
    }

    void display() {
        System.out.printf(
            "ID: %d | Name: %s | Price: Rs. %.2f%n",
            id, name, price
        );
    }
}


class CartItem {
    private Product product;
    private int quantity;

    CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    Product getProduct() {
        return product;
    }

    int getQuantity() {
        return quantity;
    }

    void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    double getSubtotal() {
        return product.getPrice() * quantity;
    }

    void display() {
        System.out.printf(
            "%s | Quantity: %d | Subtotal: Rs. %.2f%n",
            product.getName(), quantity, getSubtotal()
        );
    }
}


class Order {
    private static int nextOrderId = 1001;

    private int orderId;
    private ArrayList<CartItem> items;
    private double total;

    Order(ArrayList<CartItem> cartItems) {
        orderId = nextOrderId++;
        items = new ArrayList<>();

        
        for (CartItem item : cartItems) {
            items.add(
                new CartItem(
                    item.getProduct(),
                    item.getQuantity()
                )
            );
        }

        total = 0;

        for (CartItem item : items) {
            total += item.getSubtotal();
        }
    }

    void display() {
        System.out.println("\nOrder ID: " + orderId);

        for (CartItem item : items) {
            item.display();
        }

        System.out.printf("Order Total: Rs. %.2f%n", total);
    }
}


class ShoppingCart {
    private HashMap<Integer, CartItem> cart;
    private ArrayList<Order> orderHistory;

    ShoppingCart() {
        cart = new HashMap<>();
        orderHistory = new ArrayList<>();
    }

    
    void addProduct(Product product, int quantity) {
        if (quantity <= 0) {
            System.out.println("Quantity must be positive.");
            return;
        }

        int id = product.getId();

        if (cart.containsKey(id)) {
            CartItem item = cart.get(id);
            item.setQuantity(item.getQuantity() + quantity);
        } else {
            cart.put(id, new CartItem(product, quantity));
        }

        System.out.println("Product added to cart.");
    }

   
    void removeProduct(int productId) {
        if (cart.remove(productId) != null) {
            System.out.println("Product removed from cart.");
        } else {
            System.out.println("Product not found in cart.");
        }
    }

    
    void viewCart() {
        if (cart.isEmpty()) {
            System.out.println("Your cart is empty.");
            return;
        }

        double total = 0;

        System.out.println("\n--- Shopping Cart ---");

        for (CartItem item : cart.values()) {
            item.display();
            total += item.getSubtotal();
        }

        System.out.printf("Cart Total: Rs. %.2f%n", total);
    }

    
    void checkout() {
        if (cart.isEmpty()) {
            System.out.println("Cannot checkout an empty cart.");
            return;
        }

        ArrayList<CartItem> items = new ArrayList<>(cart.values());

        Order order = new Order(items);
        orderHistory.add(order);

        System.out.println("Checkout successful!");
        order.display();

        cart.clear();
    }

    
    void viewOrderHistory() {
        if (orderHistory.isEmpty()) {
            System.out.println("No orders placed yet.");
            return;
        }

        System.out.println("\n--- Order History ---");

        for (Order order : orderHistory) {
            order.display();
            System.out.println("---------------------");
        }
    }
}


public class main {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        ShoppingCart cart = new ShoppingCart();

	       
	        HashMap<Integer, Product> products = new HashMap<>();

	        products.put(1, new Product(1, "Laptop", 55000));
	        products.put(2, new Product(2, "Mouse", 700));
	        products.put(3, new Product(3, "Keyboard", 1500));
	        products.put(4, new Product(4, "Headphones", 2000));

	        int choice;

	        do {
	            System.out.println("\n===== SHOPPING CART SYSTEM =====");
	            System.out.println("1. View Products");
	            System.out.println("2. Add Product to Cart");
	            System.out.println("3. Remove Product from Cart");
	            System.out.println("4. View Cart");
	            System.out.println("5. Checkout");
	            System.out.println("6. View Order History");
	            System.out.println("0. Exit");
	            System.out.print("Enter your choice: ");

	           
	            while (!sc.hasNextInt()) {
	                System.out.print("Enter a valid number: ");
	                sc.next();
	            }

	            choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.println("\n--- Available Products ---");

	                    for (Product product : products.values()) {
	                        product.display();
	                    }
	                    break;

	                case 2:
	                    System.out.print("Enter product ID: ");
	                    int addId = sc.nextInt();

	                    System.out.print("Enter quantity: ");
	                    int quantity = sc.nextInt();

	                    Product product = products.get(addId);

	                    if (product == null) {
	                        System.out.println("Invalid product ID.");
	                    } else {
	                        cart.addProduct(product, quantity);
	                    }
	                    break;

	                case 3:
	                    System.out.print("Enter product ID to remove: ");
	                    int removeId = sc.nextInt();

	                    cart.removeProduct(removeId);
	                    break;

	                case 4:
	                    cart.viewCart();
	                    break;

	                case 5:
	                    cart.checkout();
	                    break;

	                case 6:
	                    cart.viewOrderHistory();
	                    break;

	                case 0:
	                    System.out.println("Thank you for shopping!");
	                    break;

	                default:
	                    System.out.println("Invalid menu choice.");
	            }

	        } while (choice != 0);

	        sc.close();
	    }
}



