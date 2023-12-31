package storeFront;
import java.util.ArrayList;


public class Shop {
    private String name;
    private ArrayList<Product> products;

    public Shop(String name, ArrayList<Product> products) {
        this.name = name;
        this.products = products;
    }

        public void printProducts() {
        System.out.println("--Products--");
        for (Product shirts : products) {
            System.out.println("ID " +shirts.getId()+": " + shirts.getName() + " - $" + shirts.getPrice());
        }
    }

    public int findProduct(String searchText) {
        for (Product shirts : products) {
            if (shirts.getName().equals(searchText)) {
                return shirts.getId();
            }
        }
        return -1;
    }

    public Product getProductById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

}
