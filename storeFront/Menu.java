package storeFront;

import java.util.Scanner;

public class Menu {
    private Cart cart;
    private Shop shop;
    private String[] menuOptions = {"Exit","List Products","Buy Product","Find Product","Show Cart", "Checkout"};
    private Scanner scanner;

    public Menu(Scanner scanner, Shop shop) {
        this.scanner = scanner;
        this.shop = shop;
        this.cart = new Cart();
    }

    public void executeMenu() {
        printMenu();
        int choice = getNextIntFromUser();
        while(choice != 0) {
            if ( choice == 1) {
                shop.printProducts();
            }else if (choice == 2) {
                System.out.println("Please enter the ID of the product you would like to purchase");
                int choiceId = scanner.nextInt();
                Product selectedProduct = shop.getProductById(choiceId);
                if (selectedProduct == null) {
                    System.out.println("Invalid product Id. Please try again");
                }else {
                    cart.addItem(selectedProduct);
                }
            }else if (choice == 3) {
                System.out.println("Enter item to search for:");
                String itemToFind = getNextStringLineFromUser();
                int searchResult = shop.findProduct(itemToFind);
                if(searchResult == -1) {
                    System.out.println("That product was not found");
                }else {
                    System.out.println(itemToFind + " was found and its product id is " + searchResult);
                }
            }else if (choice == 4) {
                if (cart.isEmpty()){
                    System.out.println("Your cart is empty. Please add items to your cart");
                }else {
                cart.showDetails();
                }
            }else if (choice == 5) {
                cart.checkout();
                break;
            }
            printMenu();
            choice = getNextIntFromUser();
        }
        exit();
    }

    public void greet(){
        System.out.println("Hello. Please enter your name");
        String name = scanner.nextLine();

        System.out.println("Welcome " + name + " to the T-Shirt Mart");
    }

    private void printMenu() {
        System.out.println();
        System.out.println("--Main Menu--");
        System.out.println("Select an option using one of the numbers shown");
        System.out.println();

        for (int i = 0; i < menuOptions.length; i++) {
            System.out.print(i + ": ");
            System.out.println(menuOptions[i]);
        }
    }

    private void exit() {
        System.out.println("Exiting now. Goodbye");
    }

    private int getNextIntFromUser() {
        return scanner.nextInt();
    }

    private String getNextStringLineFromUser() {
        scanner.nextLine();
        return scanner.nextLine();
    }


}
