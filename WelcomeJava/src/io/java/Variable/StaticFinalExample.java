package io.java.Variable;

import java.util.concurrent.TimeUnit;

public class StaticFinalExample {
    public static void main(String[] args) throws InterruptedException {
        Laptop laptop = new Laptop();
        laptop.color = "Black";
        laptop.ram = 8;
        laptop.hardDisk = 1000;
        System.out.println(laptop.TurnON());
        System.out.println("Laptop brand: "+laptop.brand());
        laptop.TimeDelay(1);
        System.out.println("Laptop color: "+laptop.color);
        laptop.TimeDelay(2);
        System.out.println("Laptop ram: "+laptop.ram);
        laptop.TimeDelay(3);
        System.out.println("Laptop HardDisk: "+laptop.hardDisk);
        ;

    }

}

class Laptop{
    static final String brand = "ASUS";
    String color;
    Integer ram;
    Integer hardDisk;



    public String TurnON() throws InterruptedException {
        System.out.println("Turning on the laptop");
        TimeUnit.SECONDS.sleep(6);
        System.out.println("Welcome to windows 10");
        TimeUnit.SECONDS.sleep(3);
        return "Here you go";
    }

    public String openMyCom(){
        return "MY Computer Opened successfully";
    }

    public String closeWindow(){
        return "Window Closed";
    }

    public void TimeDelay(Integer x) throws InterruptedException {
        TimeUnit.SECONDS.sleep(x);
    }

    public String brand() {
        return "ASUS";
    }
}