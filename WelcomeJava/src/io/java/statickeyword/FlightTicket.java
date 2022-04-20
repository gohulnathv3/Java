package io.java.statickeyword;

import java.awt.datatransfer.FlavorListener;

public class FlightTicket {
    int flightNumber;
    int seatNumber;
    String ticketCategory;
    int ticketNumber;

    public static int availabeSeats = 4;

    public FlightTicket(int flightNumber, int seatNumber, String ticketCategory, int ticketNumber) {
        this.flightNumber = flightNumber;
        this.seatNumber = seatNumber;
        this.ticketCategory = ticketCategory;
        this.ticketNumber = ticketNumber;

    }

    public static void main(String[] args) {

//        FlightTicket ticket1 = new FlightTicket(1122, 1, "Business", 1231);
//        availabeSeats--; //ticket1.availableSeats--; this is other way to declare if haven't put the variable as static
//
//        FlightTicket ticket2 = new FlightTicket(1122,2,"Business", 1232);
//        availabeSeats--;
//
//        FlightTicket ticket3 = new FlightTicket(1122,3,"Business", 1233);
//        availabeSeats--;

        createTicket(1122, 1, "Economy", 11221);
        createTicket(1122, 2, "Economy", 11222);
        createTicket(1122, 3, "Business", 11223);
        createTicket(1122, 4, "Business", 11224);
        createTicket(1122, 5, "Business", 11225);


//        System.out.println("Ticket details => \n"+ "Flight Number: "+ticket1.flightNumber+"\nTicket class : "+ticket1.ticketCategory
//        +"\nSeat number and ticket number: "+ticket1.seatNumber+","+ticket1.ticketNumber);


    }
    public static void createTicket(int fN, int sN, String tC, int tN){

        if(availabeSeats>0){
            FlightTicket ticket1 = new FlightTicket(1122,sN, tC, tN);
            System.out.println(ticket1.ticketNumber);
            availabeSeats--;
//            System.out.println(availabeSeats+" tickets available");
        }else {
            System.out.println("Sorry ticket not available");
        }

    }

}