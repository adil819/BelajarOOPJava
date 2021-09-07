package com.enigma.oop;

public class Rectangle extends Shape{
    private Double length;
    private Double width;

    public Rectangle(Double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    public Double getArea() {
        return this.length * this.width;
    }

    @Override
    public Double getPerimeter() {
        return 2*(this.width * this.width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
