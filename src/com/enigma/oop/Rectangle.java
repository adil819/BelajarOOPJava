package com.enigma.oop;

public class Rectangle {

    protected Double length;
    protected Double width;

    public Rectangle(Double length, Double width) {
        this.length = length;
        this.width = width;
    }

    public Double getSurface(){
        return this.length * this.width;
    }

    public Double getRound(){
        return ( this.length + this.width ) * 2;
    }

    public String print(){
        return "Rectangle { length=" + length + ", width=" + width + "}";
    }

}
