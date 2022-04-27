package io.java.Collections;

import java.util.HashSet;

public class SetSample2 {
    public static void main(String[] args) {
        HashSet<Person> mySet = new HashSet<>();
        mySet.add(new Person("Alex",33,"Male"));
        mySet.add(new Person("Arun", 23, "Male"));
        mySet.add(new Person("Alex",33,"Male"));
        mySet.add(new Person("Mia", 43, "Female"));

        for (Person list: mySet) {
            System.out.println(list.getName());
        }




    }
}
