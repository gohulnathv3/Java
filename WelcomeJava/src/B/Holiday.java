package B;
// Revision 1
import A.Trip;

public class Holiday {
    public static void main(String[] args) {
        System.out.println(printResult());
    }
    public static String printResult(){
        // to write a logic here
        Trip trip_1 = new Trip();
        trip_1.location = "Eiffel Tower";
        trip_1.noOfPlannedDays = 2;
        Trip trip_2 = new Trip();
        trip_2.location = "Notre Dame Cathedral";
        Trip trip_3 = new Trip();
        trip_3.location = "Louvre Museum";
        trip_3.noOfPlannedDays = 5;
        return "Trip 1 : location - "+ trip_1.location +" and planned number of days "+ trip_1.noOfPlannedDays + " | Trip 2 : location - "+ trip_2.location +" and planned number of days "+ trip_2.noOfPlannedDays +" | Trip 3 : location - "+ trip_3.location + " and planned number of days "+ trip_3.noOfPlannedDays;
    }
}
