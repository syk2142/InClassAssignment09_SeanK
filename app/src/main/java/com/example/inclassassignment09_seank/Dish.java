package com.example.inclassassignment09_seank;

public class Dish {
    private String name;
    private int price;
    private boolean isVegan;

    public Dish (String name){
        this.name = name;
    }

    public Dish(String name, int price, boolean isVegan) {
        this.name = name;
        this.price = price;
        this.isVegan = isVegan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isVegan() {
        return isVegan;
    }

    public void setVegan(boolean vegan) {
        isVegan = vegan;
    }
}
