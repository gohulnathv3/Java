package io.java.Polymorphism;

public class Elephant extends WildAnimal {
    @Override
    public void eat() {
        super.eat();
        System.out.println("I can eat rice and drinking lots of water as well");
    }

    public static void main(String[] args) {
        System.out.println("This is from Elephant class");
        Elephant elephant = new Elephant();
        elephant.setMinSpeed("12 km/hr");
        elephant.eat();
        elephant.walk();
    }
}
