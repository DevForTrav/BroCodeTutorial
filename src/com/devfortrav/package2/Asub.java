package com.devfortrav.package2;

import com.devfortrav.package1.A;

public class Asub extends A {
    public static void main(String[] args) {
        Asub asub = new Asub();
        System.out.println(asub.protectedMessage);
    }
}
