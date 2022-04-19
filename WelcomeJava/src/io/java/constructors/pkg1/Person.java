package io.java.constructors.pkg1;

public class Person{
    public String name;
    public String gender;
    public int age;

    //default constructor
    public Person(){

    }

    //parameterized constructor
    public Person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void Sleep(){
        if(age<10){
            System.out.println(name+" will sleep more than 10 hours in a day because his age is "+age);
        } else if (age >= 10 && age <=50) {
            System.out.println(name+" will sleep less than 10 hours in a day because his age is "+age);
        }else {
            System.out.println(name+" will sleep average of 10 hours in a day because his age is "+age);
        }
    }
}
