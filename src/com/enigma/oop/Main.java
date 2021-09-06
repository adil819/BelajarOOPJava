package com.enigma.oop;

public class Main {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(6.0, 2.0);
        System.out.println(rectangle.print());
        System.out.println("Luas     : " + rectangle.getSurface());
        System.out.println("Keliling : " + rectangle.getRound());
        System.out.println("\n");

        Block block = new Block(6.0, 2.0, 4.0);
        System.out.println(block.print());
        System.out.println("Luas     : " + block.getSurface());
//        System.out.println("Keliling : " + block.getRound());
    }
}
