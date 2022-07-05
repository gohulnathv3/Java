package io.java.Collections.Lists;


//

// Syntax
//        List <data-type> list1= new ArrayList();
//        List <data-type> list2 = new LinkedList();
//        List <data-type> list3 = new Vector();
//        List <data-type> list4 = new Stack();

import java.util.Iterator;
import java.util.LinkedList;
// Revision 2
public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<String> ll  = new LinkedList<String>();
        ll.add("Gohul");
        ll.add("Arun");
        ll.add("Jegan");
        ll.add("Ajay");

        // Initialize iterator
        Iterator<String> iterator = ll.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
