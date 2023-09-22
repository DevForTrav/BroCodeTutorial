package com.devfortrav;

public class Fish implements Prey, Predator{

    @Override
    public void hunt() {
        System.out.println("The fish eats the smaller fish");
    }

    @Override
    public void flee() {
        System.out.println("The fish flees from the larger fish");
    }
}
