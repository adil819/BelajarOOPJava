package com.enigma.oop;

public class Block extends Rectangle {

    private Double height;

    public Block(Double length, Double width, Double height) {
        super(length, width);   // super merefer ke parent nya, yaitu rectangle
        this.height = height;
    }

    public Double getVolume() {
        return getSurface() * this.height;
    }

    @Override
    public Double getSurface() {
        return 2 * (this.height * (this.length + this.width) + super.getSurface());
    }

    @Override
    public Double getRound() {
        return ( this.length + this.width + this.height) * 4;
    }

    @Override
    public String print() {
        return "Rectangle { length=" + length + ", width=" + width + ", height=" + height + "}";
    }
}
