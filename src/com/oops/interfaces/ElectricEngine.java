package com.oops.interfaces;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Electric Engine Starts");
    }

    @Override
    public void stop() {
        System.out.println("Electric Engine Stops");
    }

    @Override
    public void accelarate() {
        System.out.println("Electric Engine Accelarates");
    }


}
