package io.java.inheritance;

public abstract class Human {

    public abstract void walk();

//    we cannot make a body for abstract methods, so we declare below only with void
    public void speak(){
        System.out.println("This is from Human abstract class");
    };

}

//    String BLOOD_COLOUR = "RED";



////    String name;
////    String gender;
////    int age;
//
//    // creating methods for this class
//    public void sleep();
//
//    public void walk();
//
//    public default void speak(){
//        System.out.println("Speak method is come from Human interface method");
//    }

