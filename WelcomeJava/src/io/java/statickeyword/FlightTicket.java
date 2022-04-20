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
        FlightTicket ticket1 = new FlightTicket(1122, 1, "Business", 1231);
        availabeSeats--; //ticket1.availableSeats--; this is other way to declare if haven't put the variable as static

        FlightTicket ticket2 = new FlightTicket(1122,2,"Business", 1232);
        availabeSeats--;

        FlightTicket ticket3 = new FlightTicket(1122,3,"Business", 1233);
        availabeSeats--;
        System.out.println("Ticket details => \n"+ "Flight Number: "+ticket1.flightNumber+"\nTicket class : "+ticket1.ticketCategory
        +"\nSeat number and ticket number: "+ticket1.seatNumber+","+ticket1.ticketNumber);
        System.out.println("available tickets now : "+availabeSeats);
    }

}