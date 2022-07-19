package io.java.Interface;

public class TestingTheInterface {
    public static void main(String[] args) {
        Vehicle car = new Car("BMW");
        System.out.println(car.getBrand());
        System.out.println(car.turnOnAlarm());
        System.out.println(car.speedUp());
        System.out.println(car.slowDown());
    }
}
