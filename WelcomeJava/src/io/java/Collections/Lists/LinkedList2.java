package io.java.Collections.Lists;

import java.util.LinkedList;
// Revision 1
public class LinkedList2 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        System.out.println("Initial list of elements: "+ll);
        ll.add("Gohul");
        ll.add("Ajay");
        ll.add("Akash");
        ll.add("Riswanth");

        System.out.println("After Invoking add(E e) method: "+ll);
        
        // Adding an element at the specific position
        ll.add(1,"Vicky");
        System.out.println("After Invoking add(int index, E element) method: "+ll);
        LinkedList<String> ll2 = new LinkedList<>();
        ll2.add("Adding Gohul");
        ll2.add("Adding Ajay");
        // Adding second list elements to the first list
        ll.addAll(ll2);
        System.out.println("After Invoking addAll(int index, Collection<?extendsE>c) method: "+ll);
        ll.addFirst("Arun Prakash");
        System.out.println("After Invoking addFirst(E e) method: "+ll);
        ll.addLast("Kelvin");
        System.out.println("After Invoking addLast(E e) method: "+ll);

    }
}
