package com.devfortrav;

public class Pizza {
    String bread;
    String sauce;
    String cheese;
    String topping;

    Pizza(String bread) {
        this.bread = bread;
    }

    Pizza(String bread, String sauce) {
        this.bread = bread;
        this.sauce = sauce;
    }

    Pizza(String bread, String sauce, String cheese) {
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
    }

    Pizza(String bread, String sauce, String cheese, String topping) {
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;
    }

    String toppings () {
        String[]  toppings =  {this.bread, this.sauce, this.cheese, this.topping};
        return toppings.toString();
    }
}

