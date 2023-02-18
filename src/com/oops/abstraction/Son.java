package com.oops.abstraction;

public class Son extends Parent{

    Son(int age) {
        this.age = age;
    }

    @Override
    void career() {
        System.out.println("I want to be a Doctor");
    }

    @Override
    void partner() {
        System.out.println("I love She-Hulk");
    }
}
