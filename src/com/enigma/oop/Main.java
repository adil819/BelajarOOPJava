package com.enigma.oop;

public class Main {

    public static void main(String[] args) {

//        // instanceciate => inisiate instance / membuat objek
//        Car pajero = new Car("Black",5);    // jangan terbalik positional arguments nya
//        System.out.println(pajero);
//        pajero.year = 2012;
//        System.out.println(pajero); // output hashcode atau alamat memori nya
//        System.out.println(pajero.color);
//        System.out.println(pajero.fuel);
//
//        Motorbike yamaha = new Motorbike("Yamaha", 3);
//        System.out.println(yamaha);

        Car bmw = new Car("Blue",0);
        bmw.fillFuel(5);
        bmw.engineStart();
    }
}
