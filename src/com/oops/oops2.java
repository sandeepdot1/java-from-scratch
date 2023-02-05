package com.oops;

public class oops2 {
    public static void main(String[] args) {
        //Box b = new Box(4.23);
        BoxW box = new BoxW(1, 2, 3, 4);
        System.out.println(box.l + " " + box.h + " " + box.w + " " + box.weight);
    }
}

class Box {
    double l;
    double h;
    double w;

    // no args
    Box() {
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    // one arg
    Box(double side) {
        this.w = side;
        this.l = side;
        this.h = side;
    }

    // all three args
    Box(double l, double h, double w) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    // object of box
    Box(Box t) {
        this.w = t.w;
        this.h = t.h;
        this.l = t.l;
    }

    public void information() {
        System.out.println("Running oops2 class");
    }
}

class BoxW extends Box {
    double weight;

    BoxW() {
        this.weight = -1;
    }

    BoxW(double l, double h, double w, double weight) {
        /**
         *super keyword: used to refer to the base class directly above the child class
         */
        super(l, h, w);
        this.weight = weight;
    }
}
