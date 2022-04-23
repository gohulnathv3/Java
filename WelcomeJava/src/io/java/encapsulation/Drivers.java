package io.java.encapsulation;

import java.sql.Driver;

public class Drivers extends Person {
    public void driverDetailsForAmbulanceDriverHiring(){

        if(getAge()<50){
            System.out.println("He is eligible for apply ambulance emergency driving licence");
        }else{
            System.out.println("He is not eligible for this post");
        }
    }
    public static void main(String[] args) {
        Drivers d1 = new Drivers();
        Drivers d2 = new Drivers();
        System.out.println("Below details which are only eligible for ambulance driving");
        d1.setName("Arumugam");
        d1.setAge(23);
        d2.setName("Arul");
        d2.setAge(53);
        System.out.println(d1.getName());
        d1.driverDetailsForAmbulanceDriverHiring();
        System.out.println(d2.getName());
        d2.driverDetailsForAmbulanceDriverHiring();
    }
}
