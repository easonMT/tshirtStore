package storeFront;

import java.util.Scanner;

public class Menu {
    private String[] menuOptions = {"Exit","List Products","Buy Product","Find Product","Show Cart", "Checkout"};
    private String[] products = {"Crew Neck", "V-Neck", "Polo", "Boat Neck", "Tank Top"};
    private Scanner scanner;

    public Menu(Scanner scanner) {
        this.scanner = scanner;
    }

    public void executeMenu() {
        printMenu();
        int choice = getNextIntFromUser();
        while(choice != 0) {
            if ( choice == 1) {
                printProducts();
            }else if (choice == 2) {
                System.out.println("This option has not yet been implemented");
            }else if (choice == 3) {
                System.out.println("Enter item to search for:");
                String itemToFind = getNextStringLineFromUser();
                int searchResult = findProduct(itemToFind);
                if(searchResult == -1) {
                    System.out.println("That product was not found");
                }else {
                    System.out.println(itemToFind + " was found and its product id is " + searchResult);
                }
            }else if (choice == 4) {
                System.out.println("This option has not yet been implemented");
            }else if (choice == 5) {
                System.out.println("This option has not yet been implemented");
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

    private void printMenu() {
        System.out.println();
        System.out.println("--Main Menu--");
        System.out.println("Select an option using one of the numbers shown");
        System.out.println();

        for (int i = 0; i < menuOptions.length; i++) {
            System.out.println(i + ": ");
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
