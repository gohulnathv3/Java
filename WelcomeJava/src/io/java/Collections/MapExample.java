package io.java.Collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        HashMap<String, String> myMap = new HashMap<>();
        myMap.put("IN", "India");
        myMap.put("US", "America");
        myMap.put("CAD", "Canada");
        myMap.put("UK", "London");

//        System.out.println(myMap.get("IN"));
//        to print key and values in this Map
        for(Map.Entry<String,String> map: myMap.entrySet()){
            System.out.println(map.getKey()+":"+map.getValue());
        }

    }
}
