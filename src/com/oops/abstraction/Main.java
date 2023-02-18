package com.oops.abstraction;

public class Main {
    public static void main(String[] args) {
        Parent son = new Son(30);
        son.career();
        son.partner();

        Daughter daughter = new Daughter(25);
        daughter.career();
        daughter.partner();

        Parent.parentName();
    }
}
