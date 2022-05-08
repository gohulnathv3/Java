package io.java.Collections.Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class ArrayExanple3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Gohul");
        list.add("Ajay");
        list.add("Vicky");
        list.add("Arjun");

        // Sorting elements in the array
        Collections.sort(list);

        // different ways of iterating arrays.

        System.out.println("Traversing list through iterator");
        // here element iterate in reverse order
        ListIterator<String> list1 = list.listIterator(list.size());
        while (list1.hasPrevious()) // iterate list in reverse order and move previous element in the list.
        {
            String str = list1.previous();
            System.out.println(str);
        }
    }
}
