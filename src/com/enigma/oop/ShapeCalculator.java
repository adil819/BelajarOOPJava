package com.enigma.oop;

public class ShapeCalculator {

    Double totalShapeArea = 0.0;
    public Double sumArea(Shape[] shapes){
        for (int i = 0; i < shapes.length; i++) {
            totalShapeArea += shapes[i].getArea();
        }
        return totalShapeArea;
    }

//    static Double sumArea(Shape ...a){  // spread operator
//        Double temp = 0.0;
//        for(Shape b: a){
//            temp += b.getArea();
//        }
//
//        return temp;
//
//
//    }

}
