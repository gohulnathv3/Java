package io.java.Collections.Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class ArrayExample2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Gohul");
        list.add("Vicky");
        list.add("Prakash");
        list.add("Akash");

        System.out.println("Unsorted Array Elements");

        // Traversing  loop through for-each
        for (String names: list){
            System.out.println(names);
        }


        // sorting the array
        Collections.sort(list);

        System.out.println("\nSorted Array Elements");

        // Traversing sorted loop through for-each
        for (String sortednames: list){
            System.out.println(sortednames);
        }
    }
}
