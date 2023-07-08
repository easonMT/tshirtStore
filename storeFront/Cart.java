package storeFront;

import java.util.ArrayList;

public class Cart {
    
    private ArrayList<Product> items = new ArrayList<>();

    public void showItems(){
        System.out.println("Items in Cart:");
        for (Product item : items) {
            System.out.println(item.getName() + " - $" + item.getPrice());
        }

    }

    public void addItem(Product p) {
        items.add(p);

    }

    public void removeItem(Product p) {
        items.remove(p);
    }

    public double calculateTotal(){
        double totalPrice = 0.0;
        for (Product itemPrice : items) {
            totalPrice += itemPrice.getPrice();
        }
        return totalPrice;

    }


}
