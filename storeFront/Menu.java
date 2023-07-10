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

        }
    }

    public void greet(){

    }

    private void printProducts() {

    }

    public int findProduct(String searchText) {
        return -1;
    }

    private void printMenu() {

    }

    private void exit() {

    }

    private int getNextIntFromUser() {
        return scanner.nextInt();
    }

    private String getNextStringLineFromUser() {
        scanner.nextLine();
        return scanner.nextLine();
    }


}
