import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;

    @Before
    public void before(){
        passenger1 = new Passenger("Mark", 3);
        passenger2 = new Passenger("Joy", 2);
    }

    @Test
    public void passengerHasName(){
        assertEquals("Mark", passenger1.getName());
    }

    @Test
    public void passengerHasNumberOfBags(){
        assertEquals(2, passenger2.getNumberOfBags());
    }
}
