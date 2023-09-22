package com.devfortrav;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car("Chevy", "Camaro", 2021);
        Car car2 = new Car("Ford", "Mustang", 2021);
        Car car3 = new Car(car2);


        System.out.println(car1);
        System.out.println(car2);
        System.out.println();
        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println();
        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());
        System.out.println();
        System.out.println(car3.copy(car2));
        System.out.println(car3.getMake());
        System.out.println(car3.getModel());
        System.out.println(car3.getYear());
    }
}
