package storeFront;

import java.util.Arrays;
import java.util.ArrayList;

public class Cart {
    private ArrayList<Product> items;
    private double total = 0;
    private double taxRate = 0.10;

    public Cart() {
        items = new ArrayList<>();
    }

    public void addItem(Product p) {
        items.add(p);
        total += p.getPrice();
        System.out.println(p.getName() + " has been added to your cart.");
    }
    public void showDetails() {
        System.out.println("--Cart--");
        System.out.println("Item Count: " + items.size());
        System.out.println("Items:");
        for (Product p : items) {
            System.out.println(p.getName() + ": $" + p.getPrice());
        }
        System.out.println();
        System.out.printf("Pre-Tax Total: $%.2f%n", total);
        double taxAmount = total * taxRate;
        double totalAfterTax = total + taxAmount;
        System.out.printf("Post-Tax Total (%.2f%% Tax): $%.2fn", taxRate * 100, totalAfterTax);

    }

    public boolean checkout() {
        if (items.isEmpty()) {
            System.out.println("Your cart is currently empty. Please add at least one product to check out.");
            return false;
        }
        double taxAmount = total * taxRate;
        double totalAfterTax = total + taxAmount;
        System.out.printf("Your total is $%.2f%n", totalAfterTax);
        System.out.println();
        System.out.println("Thank you for shopping at T-Shirt Mart");
        empty();
        return true;
    }

    public void empty() {
        items.clear();
        total = 0;
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

}
