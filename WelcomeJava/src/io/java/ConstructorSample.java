package io.java;
class Car{
    // Revision 1
    int speed;
    String color;
    //default constructor
    Car(){
        speed = 100;
        color = "white";
    }

    //parameterized constructor
    Car(int s, String c){
        speed = s;
        color = c;
    }

    void run(){
        System.out.println("Car is running ...");
    }
}

public class ConstructorSample {
    public static void main(String[] args) {
        Car audi = new Car();
//        audi.speed = 100;
        audi.color = "red";
        audi.run();
        System.out.println(audi.color);
        System.out.println(audi.speed);
    }
}
