package storeFront;

// import java.io.InputStreamReader;
// import java.nio.charset.Charset;
import java.util.Scanner;

public class ShopRunner {
    
    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product("Crew Neck", 20.00); 
        products[1] = new Product ("V-Neck", 20.00);
        products[2] = new Product("Polo", 25.50);
        products[3] = new Product ("Boat Neck", 30.25);
        products[4] = new Product("Tank Top", 15.75);

        // Menu menu = new Menu(new Scanner(new InputStreamReader(System.in, Charset.forName("UTF-8"))));
        Menu menu = new Menu(new Scanner(System.in), new Shop(products));

        menu.greet();
        menu.executeMenu();
    }

}
