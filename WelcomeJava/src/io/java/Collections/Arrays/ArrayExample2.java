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

        ArrayList<Integer> intlist = new ArrayList<Integer>();
        intlist.add(12);
        intlist.add(211);
        intlist.add(32);
        intlist.add(23);
        intlist.add(42);
        intlist.add(193);




        System.out.println("Unsorted Array String Elements");

        // Traversing  loop through for-each
        for (String names: list){
            System.out.println(names);
        }


        // sorting the array
        Collections.sort(list);

        System.out.println("\nSorted Array String Elements");

        // Traversing sorted loop through for-each
        for (String sortednames: list){
            System.out.println(sortednames);
        }

        System.out.println("\nUnsorted Array Integer Elements");

        // Traversing  loop through for-each
        for (Integer number: intlist){
            System.out.println(number);
        }

        Collections.sort(intlist);

        System.out.println("\nSorted Array Integer Elements");
        // Traversing sorted loop through for-each
        for (Integer sortedNumbers: intlist){
            System.out.println(sortedNumbers);
        }


    }
}
