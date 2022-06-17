package io.java.Collections;

import java.util.*;
//Revision 3
public class MapExample {
    public static void main(String[] args) {
        HashMap<String, String> myMap = new HashMap<>();
//        Hashtable<String, String> myMap = new Hashtable<>(); //it doesn't run if null key-value is present in map.
//        TreeMap<String, String> myMap = new TreeMap<>(); // it showed in ascending order.
//        LinkedHashMap<String, String> myMap = new LinkedHashMap<>(); // it showed in ascending order of value.
        myMap.put("IN", "India");
        myMap.put("US", "America");
        myMap.put("CAD", "Canada");
        myMap.put("UK", "London");
//        myMap.put(null, "Canada");
        myMap.put("CN", "China");
//        myMap.remove("IN");


//        System.out.println(myMap.get("IN"));
//        to print key and values in this Map
        for(Map.Entry<String,String> map: myMap.entrySet()){
            System.out.println(map.getKey()+":"+map.getValue());
        }

    }
}
