/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.peoplefluent.interview.java.fruitstand;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Basic Grocery Item defining it's match input string, price and a renderable
 * name. 
 */
public enum GroceryItem {
    GRAPEFRUIT('G', 0.50, "GrapeFruit"),//The new one
    APPLE('A', 0.60, "Apple"),
    ORANGE('O', 0.25, "Orange"),
    BANANA('B', 0.20, "Banana");//Should be onle one "N" non functional issue
    static List<String> matches() {
        return Arrays.asList(GroceryItem.values()).stream()
                .map(item -> String.valueOf(item.match))
                .collect(Collectors.toList());
    }

    public final char match; //Before it was String
    public final double price; //Before it was int that is lack of precision
    private final String itemName;

    GroceryItem(char match, double price, String itemName) {
        this.match = match;
        this.price = price;
        this.itemName = itemName;
    }

    @Override
    public String toString() {
        return itemName;
    }

    public static GroceryItem matchOf(String match) {
        return Arrays.asList(values()).stream()
                .filter(item -> String.valueOf(item.match).equals(match))
                .findFirst().orElse(null);
    }
}
