package io.java.Polymorphism;

public class Cat extends DomesticAnimal{
    @Override //This annotation is used to notify the user to method overriding happens.
    public void eat() {
//        super.eat(); //it calls the method from parent class of this class
        System.out.println("I'm also eat rat as well");
    }
    

    public static void main(String[] args) {
        Cat c = new Cat();
        c.setMinSpeed("54 km/hr");
        c.eat();
        c.walk();
    }
}

