package io.java.JSON;

import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class JSON2JsonObject {
    public static void main(String[] args)  {
        ObjectMapper objectMapper = new ObjectMapper();

        // JSON String to object
        String jsonString =  "{\"name\":\"mkyong\",\"age\":37,\"skills\":[\"java\",\"python\"]}";
//        Staff staff2 = objectMapper.readValue(jsonString,Staff.class);

//        System.out.println(staff2);

    }
}


class Staff {

    private String name;
    private int age;
    private String[] position;              //  Array
    private List<String> skills;            //  List
    private Map<String, BigDecimal> salary; //  Map

    // getters , setters, some boring stuff
}
