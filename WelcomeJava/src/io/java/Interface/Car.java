package io.java.Interface;

public class Car implements Vehicle{

    private final String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public String speedUp() {
        return "Car speed is increasing";
    }

    @Override
    public String slowDown() {
        return "Slowing down the car";
    }
}
