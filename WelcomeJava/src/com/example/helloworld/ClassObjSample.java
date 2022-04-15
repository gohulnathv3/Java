package com.example.helloworld;

public class ClassObjSample {
    public static void main(String[] args) {

        Person alex = new Person();
        alex.name = "Alex";
        alex.age = 18;
        alex.gender = "Male";
        alex.Sleep();
        Person mia = new Person();
        mia.age = 2;
        mia.name = "Mia";
        mia.Sleep();

    }
}

class Person{
    String name;
    String gender;
    int age;

    void Sleep(){
        if(age<10){
            System.out.println(name+" will sleep more than 10 hours in a day because his age is "+age);
        } else if (age >= 10 && age <=50) {
            System.out.println(name+" will sleep less than 10 hours in a day because his age is "+age);
        }else {
            System.out.println(name+" will sleep average of 10 hours in a day because his age is "+age);
        }
    }
}