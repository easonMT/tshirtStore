package storeFront;

// import java.io.InputStreamReader;
// import java.nio.charset.Charset;
import java.util.Scanner;

public class ShopRunner {
    
    public static void main(String[] args) {
        String[] products = {"Crew Neck", "V-Neck", "Polo", "Boat Neck", "Tank Top"};
        // Menu menu = new Menu(new Scanner(new InputStreamReader(System.in, Charset.forName("UTF-8"))));
        Menu menu = new Menu(new Scanner(System.in), new Shop(products));

        menu.greet();
        menu.executeMenu();
    }

}
