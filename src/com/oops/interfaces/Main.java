package com.oops.interfaces;

public class Main {
    public static void main(String[] args) {
        PetrolCar car = new PetrolCar();
        car.start();
        car.accelarate();
        car.brake();
        car.stop();

        System.out.println();

        NiceCar newcar = new NiceCar(new ElectricEngine());
        newcar.startEngine();
        newcar.startMusic();
        newcar.stopMusic();
        newcar.stopEngine();
    }
}
