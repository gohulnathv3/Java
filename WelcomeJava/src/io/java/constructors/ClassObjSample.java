package io.java.constructors;

import io.java.constructors.pkg1.*;
// Revision 3
public class ClassObjSample {
    public static void main(String[] args) {

        Person alex = new Person();
        Person gokul = new Person("Gokul", 21, "male");

        alex.name = "Alex";
        alex.age = 8;
        alex.gender = "Male";
        alex.Sleep();

        Person mia = new Person();
        mia.age = 62;
        mia.name = "Mia";
        mia.Sleep();

        Person gohul = new Person();
        gohul.age = 28;
        gohul.name = "Gohul";
        gohul.Sleep();


        //constructor calling
        gokul.Sleep();

        System.out.println(gohul.age);

    }
}

