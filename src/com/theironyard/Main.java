package com.theironyard;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static InventoryItem createItem(String name, int quantity, String category) {

        category = category.toLowerCase();
        switch (category) {
            case "hat":
                return new Hat(name, quantity);

            case "glove":
                return new Glove(name, quantity);

            case "jacket":
                return new Jacket(name, quantity);

            case "belt":
                return new Belt(name, quantity);

            case "boot":
                return new Boot(name, quantity);

            default:
                System.out.println("Invalid category");
        }
        return new InventoryItem();
    }

    public static void removeItem(Scanner scanner, ArrayList<InventoryItem> items) {
        System.out.println("Enter item number you wish to remove from the list.");
        int num = Integer.valueOf(scanner.nextLine());
        items.remove(num - 1);
    }

    public static void updateItem(Scanner scanner, ArrayList<InventoryItem> items) {
        System.out.println("Which item number do you wish to modify?");
        int newNum = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter new quantity:");
        InventoryItem tempItem = items.get(newNum -1);
        tempItem.quantity = Integer.valueOf(scanner.nextLine());

    }

    public static void main(String[] args) {
        ArrayList<InventoryItem> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            int i = 1;
            for (InventoryItem inventoryItem : items) {
                System.out.printf("%s. [%s] %s, (%s)\n", i, inventoryItem.quantity, inventoryItem.name, inventoryItem.category);
                i++;
            }
            System.out.println("Options:");
            System.out.println("1. Create New Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Update Quantity of Existing Item");

            String option = scanner.nextLine();

            switch (option) {
                case "1":
                    System.out.println("What item do you want to create?");
                    String name = scanner.nextLine();
                    System.out.println("How many do you have?");
                    int quantity = Integer.valueOf(scanner.nextLine());
                    System.out.println("What category does it fit into?");
                    String category = scanner.nextLine();
                    InventoryItem inventoryItem = createItem(name, quantity, category);
                    items.add(inventoryItem);
                    break;

                case "2":
                    removeItem(scanner, items);
                    break;

                case "3":
                    updateItem(scanner,items);
                    break;

                default:
                    System.out.println("Invalid Option");

            }
        }
    }
}
