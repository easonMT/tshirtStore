package storeFront;

import  java.util.ArrayList;

public class Shop {

    private ArrayList<Product> products = new ArrayList<>();


    public void printProducts() {
        products.add(new Product(0, "Crew Neck", 25.99));
        products.add(new Product(1, "Tank Top", 15.99));
        products.add(new Product(2, "Polo", 25.99));
        products.add(new Product(3, "Graphic Tee", 17.99));
        products.add(new Product(4, "Collar Shirt", 35.99));
    }

    public int findProduct() {
        for (int i = 0; i < products.size(); i++) {
            System.out.println(i);
        }
    }

    public Product getProductById(int id) {
        return null;
    }

}
