package com.oops.interfaces;

/**
 * Interfaces in Java: Interfaces acts as Abstract classes in Java
 * They only have abstract methods which are public by default and variables which are static and final
 * We can't create objects of an interface, so they don't have any constructors
 * They can have static methods, but it should have a body since static methods don't depend on objects so can't be overridden
 * We can create classes that can inherit multiple interfaces so interfaces support MULTIPLE INHERITANCE
 */

public interface Engine {
    // static and final by default
    int ID = 0;
    // static methods with body is allowed
    static void name() {
        System.out.println("Global Name Engine");
    }
    // abstract methods
    void start();
    void stop();
    void accelarate();
}
