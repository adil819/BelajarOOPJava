package com.enigma.oop;

public class Square extends Shape{
    private Double side;

    public Square(Double side) {
        this.side = side;
    }

    @Override
    public Double getArea() {
        return this.side * this.side;
    }

    @Override
    public Double getPerimeter() {
        return 4 * this.side;
    }


}
