package com.devfortrav;

public class Hero extends Person {
    String power;

    Hero(String name, int age, String power) {
        super(name, age);
        this.power = power;
        System.out.println(super.toString() + " " + this.toString());
    }

    public String toString() {
        return this.power;
    }
}
