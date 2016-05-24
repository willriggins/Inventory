package com.theironyard;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


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
                    System.out.println("Enter new item name to add to the list.");
                    String text = scanner.nextLine();
                    InventoryItem item = new InventoryItem(text, 0);
                    items.add(item);
                    System.out.println(text + " added to inventory.");
                    break;


                case "2":
                    System.out.println("Enter item number you wish to remove from the list.");
                    String intStr = scanner.nextLine();
                    int num = Integer.valueOf(intStr);
                    items.remove(num - 1);
                    break;

                case "3":
                    System.out.println("Which item number do you wish to modify?");
                    String intStr2 = scanner.nextLine();
                    int num2 = Integer.valueOf(intStr2);
                    num2 -= 1;
                    System.out.println("Add how many?");
                    String changeStr = scanner.nextLine();
                    int change = Integer.valueOf(changeStr);


                    break;

                default:
                    System.out.println("Invalid Option");
            }
        }


    }
}
