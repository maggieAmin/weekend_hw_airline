import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot1;

    @Before
    public void before(){
        pilot1 = new Pilot("Jack", Rank.CAPTAIN, "123456");

    }

    @Test
    public void pilot_has_name(){
        assertEquals("Jack", pilot1.getName());
    }

    @Test
    public void pilot_has_rank(){
        assertEquals(Rank.CAPTAIN, pilot1.getRank());
    }

    @Test
    public void pilot_has_licence_number(){
        assertEquals("123456", pilot1.getPilotLicenceNumberNumber());
    }

    @Test
    public void pilot_can_fly_plane(){
        assertEquals("The pilot can fly the plane!!!!", pilot1.flyPlane());
    }
}
