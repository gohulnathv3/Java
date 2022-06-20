package io.java.Collections;
// this is about ArrayList sample
import io.java.constructors.pkg1.Person;

import java.util.ArrayList;
import java.util.Collections;
//Revision 3
public class ListSample {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList();
        myList.add("Apple");
        myList.add("Pinapple");
        myList.add("Orange");
        Collections.sort(myList);


//        System.out.println(myList.get(0));
//        System.out.println(myList.get(1));
//        System.out.println(myList.get(2));
        //print numbers using for-each loop concept

        for(String fruit:myList){
            System.out.println(fruit);
        }

//        myList.add(String.valueOf(new Person("Alex",43,"Male")));
//        System.out.println(((Person)myList.get(1)).name);




    }
}
