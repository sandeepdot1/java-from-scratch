package com.oops.abstraction;

/**
 * Abstract Classes: Classes which contain one or more abstract methods
 * Abstract methods: Methods which only have declaration and have no body
 * These can be overridden by a subclass to implement the method and give a body to it.
 * By this way we can achieve Abstraction
 *
 * We can't create object of abstract classes
 * Abstract Classes can have:
 * Abstract methods, normal methods, static methods, normal variables, static variables, normal constructor(can't be called since we can't instantiate abstract classes)
 * Astract Classes can't have:
 * Abstract constructor, abstract variables, abstract static methods.
 */

public abstract class Parent {
    final int ID = 2;
    static int global;
    int age;

    Parent() {
        this.global = 1;
    }

    abstract void career();
    abstract void partner();
    static void parentName() {
        System.out.println("Name: Parent");
    }
    void normal() {
        System.out.println("Normal method");
    }
}
