package io.java.encapsulation;

public class Person {
    private String name;
    private int age;
// generating getters and setters which are used to allow manually to access to read and modify the private variable
//  that private variables declared in class is called to achieve encapsulation.
// by encapsulation, we can achieve flexibility, maintainability and code reusable for what user can access.

    // this is only to view and read the name
    public String getName() {
        return name;
    }
    //this is used only to set (aka write) the name
    public void setName(String name) {
        this.name = name;
    } // if any of the functionality not needed to use, we can simply remove it or commenting for our understanding purpose.

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
