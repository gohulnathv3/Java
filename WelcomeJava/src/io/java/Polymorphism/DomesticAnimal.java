package io.java.Polymorphism;

public class DomesticAnimal extends Animal{
    @Override
    public void eat(){
        System.out.println("I will eat Milk");
    };

    @Override
    public void walk(){
        System.out.println("I will walk in town at the speed of "+getMinSpeed());
    }
}
