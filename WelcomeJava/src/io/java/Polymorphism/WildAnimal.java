package io.java.Polymorphism;

public class WildAnimal extends Animal {


    @Override
    public void eat() {
        System.out.println("I will eat other animals and trees");
    }

    @Override
    public void walk() {
        System.out.println("I will walk at a speed of "+getMinSpeed());
    }
}
