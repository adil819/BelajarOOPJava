package com.enigma.oop;

public class Main {

    public static void main(String[] args) {

        Hero luna = new Hero ("Luna", 100, 50);
        System.out.println(luna);

        Hero abaddon = new Hero("Abaddon", 70, 20);
        System.out.println(abaddon);
        System.out.println("\n");

        // object bisa menjadi parameter, tipe datanya "Hero"
        luna.attack(abaddon);   // disebut object interaction
        System.out.println(abaddon);
        System.out.println(luna);
        luna.attack(abaddon);   // disebut object interaction
        System.out.println(abaddon);
        System.out.println(luna);

    }
}
