package com.theironyard;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void createItem(Scanner scanner, ArrayList<InventoryItem> items) {
        System.out.println("Enter new item name to add to the list.");
        String text = scanner.nextLine();
        int quantity = 0;
        InventoryItem item = new InventoryItem(text, quantity);
        items.add(item);
        System.out.println(text + " added to inventory.");
    }

    public static void removeItem(Scanner scanner, ArrayList<InventoryItem> items) {
        System.out.println("Enter item number you wish to remove from the list.");
        String intStr = scanner.nextLine();
        int num = Integer.valueOf(intStr);
        items.remove(num - 1);
    }

    public static void updateItem(Scanner scanner, ArrayList<InventoryItem> items) {
        System.out.println("Which item number do you wish to modify?");
        String updateNum = scanner.nextLine();
        int newNum = Integer.valueOf(updateNum);
        System.out.println("Update with new quantity:");
        String itemNum = scanner.nextLine();
        InventoryItem tempItem = items.get(newNum -1);
        tempItem.quantity += Integer.valueOf(itemNum);

    }

    public static void main(String[] args) {
        ArrayList<InventoryItem> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            int i = 1;
            for (InventoryItem inventoryItem : items) {
                System.out.println(i + ". " + inventoryItem.text + " [" + inventoryItem.quantity + "]");
                i++;
            }
            System.out.println("Options:");
            System.out.println("1. Create New Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Update Quantity of Existing Item");

            String option = scanner.nextLine();


            switch (option) {
                case "1":
                    createItem(scanner, items);
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
