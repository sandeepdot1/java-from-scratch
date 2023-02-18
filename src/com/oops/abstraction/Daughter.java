package com.oops.abstraction;

public class Daughter extends Parent{

    Daughter(int age) {
        this.age = age;
    }

    @Override
    void career() {
        System.out.println("I want to be Designer");
    }

    @Override
    void partner() {
        System.out.println("I love Iron Man");
    }
}
