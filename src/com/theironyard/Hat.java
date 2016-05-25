package com.theironyard;

/**
 * Created by will on 5/24/16.
 */
public class Hat extends InventoryItem {
    public Hat(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
        this.category = "Hat";
    }
}
