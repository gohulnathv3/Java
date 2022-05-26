package io.java.Collections;

import java.io.StringBufferInputStream;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetSample2 {
    // Revision 2
    public static void main(String[] args) {
//        HashSet<Person> mySet = new HashSet<>();
//        mySet.add(new Person("Alex",33,"Male"));
//        mySet.add(new Person("Arun", 23, "Male"));
//        mySet.add(new Person("Alex",33,"Male"));
//        mySet.add(new Person("Mia", 43, "Female"));
//
//        for (Person list: mySet) {
//            System.out.println(list.getName());
//        }

//        LinkedHashSet<String> mySet = new LinkedHashSet<>();
//        HashSet<String> mySet = new HashSet<>();
        TreeSet<String> mySet = new TreeSet<>();

        mySet.add("Orange");
        mySet.add("Apple");
        mySet.add("Mango");
        mySet.add("Apple");

        for(String fruits: mySet){
            System.out.println(fruits);
        }


    }
}
