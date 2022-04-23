package io.java.inheritance;

public interface Human {

    String BLOOD_COLOUR = "RED";



//    String name;
//    String gender;
//    int age;

    // creating methods for this class
    public void sleep();

    public void walk();

    public default void speak(){
        System.out.println("Speak method is come from Human interface method");
    }

}