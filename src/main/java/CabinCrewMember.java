public class CabinCrewMember extends CrewMember {


    public CabinCrewMember(String name, Rank rank) {
        super(name, rank);
    }

    public String relayMessages() {
        return "Lead attendant relays messages to the passengers";
    }
}
