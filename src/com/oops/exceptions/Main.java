package com.oops.exceptions;

public class Main {
    public static void main(String[] args) {
        try {
            int x = 5, y = 0;
            int z = x/y;
            System.out.println("Value of z: " + z);
        }
        catch (Exception e) {
            System.out.println("Exception Encountered in main: " + e);
        }
    }
}
