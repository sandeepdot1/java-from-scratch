package com.oops.interfaces;

public class PetrolCar implements Engine, Brake{

    @Override
    public void brake() {
        System.out.println("Brakes applied Petrol Car");
    }

    @Override
    public void start() {
        System.out.println("Start Petrol Car");
    }

    @Override
    public void stop() {
        System.out.println("Stop Petrol Car");
    }

    @Override
    public void accelarate() {
        System.out.println("Accelarate Petrol Car");
    }
}
