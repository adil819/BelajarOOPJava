package com.enigma.oop;

public class Motorbike {

    public String brand;
    public Integer fuel;

    public Motorbike() {
    }

    public Motorbike(String brand) {
        this.brand = brand;
    }

    public Motorbike(String brand, Integer fuel) {
        this.brand = brand;
        this.fuel = fuel;
    }

    @Override
    public String toString() {
        return "Motorbike{" +
                "brand='" + brand + '\'' +
                ", fuel=" + fuel +
                '}';
    }
}
