package com.enigma.oop;

public class Main {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(8.0, 4.0);
        System.out.println(rectangle.getArea());

        Square square = new Square(4.0);
        System.out.println(square.getArea());

        Circle circle = new Circle(7.0);
        System.out.println(circle.getArea());
    }
}
