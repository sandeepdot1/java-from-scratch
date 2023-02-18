package com.oops.properties.polymorphism;


public class Main {
    public static void main(String[] args) {
        Shapes sh = new Triangle();
        Circle cr = new Circle();
        Square sq = new Square();

        /**
            Method Overriding: this will call the area method present in triangle at runtime
        */
        sh.area();
    }
}
