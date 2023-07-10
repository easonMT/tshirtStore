package storeFront;


public class Shop {
    private String[] products = {"Crew Neck", "V-Neck", "Polo", "Boat Neck", "Tank Top"};

    public Shop() {

    }

        private void printProducts() {
        System.out.println("--Products--");
        for (int i = 0; i < products.length; i++) {
            System.out.println("ID " +i+": " + products[i]);
        }
    }

    public int findProduct(String searchText) {
        for (int i = 0; i < products.length; i++) {
            if (searchText.equals(products[i])) {
                return i;
            }
        }
        return -1;
    }

}
