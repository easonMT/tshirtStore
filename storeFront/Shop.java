package storeFront;
import java.util.ArrayList;
// import java.util.Arrays;


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

}
