package io.java.Collections.Lists.Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
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

        // another way to print the list elements
        System.out.println("Traversing list through for loop");
        for(int i = 0; i<list.size();i++){
            System.out.println(list.get(i));
        }

        // third way to print the elements in the list.
        System.out.println("Traversing list through forEach() method");
        // for each method is a new feature introduced in the java 8
        list.forEach(a-> // Here, we are using lambda expression
                System.out.println(a));
        // fourth way to print the elements in the list.
        System.out.println("Traversing list through forEachRemaining() method");
        Iterator<String> itr = list.iterator();
        itr.forEachRemaining(a-> // here also, we are using lambda expression
                System.out.println(a));
    }
}
