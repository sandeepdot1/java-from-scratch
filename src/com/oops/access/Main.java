package com.oops.access;

public class Main {
    public static void main(String[] args) {
        A.x += 3;
        A a = new A(5);
        System.out.println(a.num);
        System.out.println(A.x);
    }
}
