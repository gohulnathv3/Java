package io.java.Polymorphism;
// Revision 1

public class Cat extends DomesticAnimal{
    @Override //This annotation is used to notify the user to method overriding happens.
    public void eat() {
//        super.eat(); //it calls the method from parent class of this class
        System.out.println("I'm also eat rat as well");
    }
    
// method overloading
    public void walk(boolean danger){
        if(danger==true) {
            System.out.println("It will run up to 48 km/hr");
        }else{
            super.walk();
        }
    }
    public static void main(String[] args) {
        Cat c = new Cat();
        c.setMinSpeed("24 km/hr");
        c.eat();
        c.walk();
        System.out.println("\nWhile speed in danger");
        c.walk(true);
    }
}

