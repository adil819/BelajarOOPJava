package com.enigma.oop;

public class Main {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(6.0, 2.0);
        System.out.println(rectangle.print());
        System.out.println("Luas     : " + rectangle.getSurface());
        System.out.println("Keliling : " + rectangle.getRound());
        System.out.println("\n");

        Block block = new Block(6.0, 4.0, 3.0);
        System.out.println(block.print());
        System.out.println("Luas     : " + block.getSurface());
        System.out.println("Keliling : " + block.getRound());
        System.out.println("Volume   : " + block.getVolume());
        System.out.println("\n");

        // lihat apakah block bisa ditampung di rectangle
        Rectangle block1 = new Block(6.0, 4.0, 3.0);
        System.out.println(block.print());
        System.out.println("Luas     : " + block1.getSurface());
        System.out.println("Keliling : " + block1.getRound());
//        System.out.println("Volume   : " + block1.getVolume());

        // casting? testing?
        Block rec1 = (Block) new Rectangle(8.0, 4.0);

        // utk tes aja, bisa atau enggak
        Object block2 = new Block(6.0, 4.0, 3.0);
        Object rec2 = new Rectangle(8.0, 4.0);

        String number = "5";
        System.out.println(Integer.parseInt(number));  // kelebihan Integer (bukan int) bisa di parsing


    }
}
