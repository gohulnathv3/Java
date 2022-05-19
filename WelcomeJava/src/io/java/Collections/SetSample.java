package io.java.Collections;


import java.util.HashSet;
// Revision 1
public class SetSample {
    public static void main(String[] args) {
        HashSet<String> mySet = new HashSet<>();
        mySet.add("Apple");
        mySet.add("Orange");
        mySet.add("Pine Apple");
        mySet.add("Banana");
        mySet.add("Apple");
        mySet.add("Orange");

        // did you see the difference here, it ignored the repeated values.
//        for(String fruits:mySet){
//            System.out.println(fruits);
//        }
        HashSet<String> mySet1 = new HashSet<>(mySet);
        mySet1.add("Apple 1");
        mySet1.add("Apple 1");
        mySet1.add("Home 1");

        for(String fruits:mySet1){
            System.out.println(fruits);
        }


    }
}
