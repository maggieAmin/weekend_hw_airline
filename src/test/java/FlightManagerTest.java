import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class FlightManagerTest {

    Flight flight1;
    Passenger passenger1;
    Passenger passenger2;
    CabinCrewMember cabinCrewMember1;
    FlightManager flightManager;

    @Before
    public void before() throws Exception {
        flightManager = new FlightManager();
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
    public void calculateRemainingFlightWeight() {
        assertEquals(27500, flightManager.calculateRemainingFlightWeight(flight1),0.0);
    }
}