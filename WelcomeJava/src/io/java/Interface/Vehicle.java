package io.java.Interface;

public interface Vehicle {
    String getBrand();
    String speedUp();
    String slowDown();
    default String turnOnAlarm(){
        return "Vehicle alarm is running";
    }
    static int showSpeedometer(int rpm){
        return (rpm/100);
    }
}
