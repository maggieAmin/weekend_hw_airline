import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CabinCrewMemberTest {
    CabinCrewMember cabinCrewMember;

    @Before
    public void before() {
        cabinCrewMember = new CabinCrewMember("Alex", Rank.LEAD_ATTENDANT);
    }

    @Test
    public void cabinCrewMemberRelayMessagesToPassenger(){
        assertEquals("Lead attendant relays messages to the passengers", cabinCrewMember.relayMessages());
    }
}