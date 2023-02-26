import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class FlightTest {
    Flight flight1;
    CabinCrewMember cabinCrewMember1;
    Passenger passenger1;
    Passenger passenger2;

    @Before
    public void before(){
        ArrayList<CabinCrewMember> cabinCrewMembersList = new ArrayList<>();
        cabinCrewMember1 = new CabinCrewMember("Jay", Rank.FIRST_OFFICER);
        cabinCrewMembersList.add(cabinCrewMember1);
        ArrayList<Passenger> passengersList = new ArrayList<>();
        passenger1 = new Passenger("Menna", 5);
        passengersList.add(passenger1);
        passenger2 = new Passenger("Maggie", 5);
        passengersList.add(passenger2);
        flight1 = new Flight("Mina", 1000, cabinCrewMembersList, passengersList, "FR756", "Porto", "Edinburgh", "13:00", 1000, 1000,500, 30000);
    }

    @Test
    public void returnNumberOfAvailableSeats(){
        assertEquals(998, flight1.getNumberOfAvailableSeats());
    }

    @Test
    public void canBookAPassenger(){
        assertEquals(3, flight1.bookAPassenger(passenger1));
    }

    @Test
    public void totalWeightFlightAllowance(){
        assertEquals(30000, flight1.getTotalWeightFlightAllowance(),0.0);
    }
}
