package com.enigma.oop;

public class Main {

    public static void main(String[] args) {

        Hero luna = new Hero ("Luna", 100, 30);
        System.out.println(luna);

        Hero abaddon = new Hero("Abaddon", 70, 20);
        System.out.println(abaddon);
        System.out.println("\n");

        Monster monster = new Monster("Rogon", 300, 50);

        Tower tower = new Tower(500);
        System.out.println(tower);
        luna.attack(tower);
        System.out.println(tower);
//        // object bisa menjadi parameter, tipe datanya "Hero"
//        luna.attack(abaddon);   // disebut object interaction
//        System.out.println(abaddon);
//        System.out.println(luna);
//        luna.attack(abaddon);   // disebut object interaction
//        System.out.println(abaddon);
//        System.out.println(luna);
        // tes di attack sampai minus, harus ada validasi agar gaminus hp nya

//        luna.attack(monster);
//        System.out.println(monster);


//        luna.attack(abaddon);
//        System.out.println(abaddon);
//        System.out.println(luna);

    }
}
