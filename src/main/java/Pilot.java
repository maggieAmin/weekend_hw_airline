public class Pilot extends CrewMember {
    private String pilotLicenceNumber;

    public Pilot(String name, Rank rank, String pilotLicenceNumber) {
        super(name, rank);
        this.pilotLicenceNumber = pilotLicenceNumber;
    }

    public String getPilotLicenceNumberNumber() {
        return pilotLicenceNumber;
    }


    public String flyPlane() {
        return "The pilot can fly the plane!!!!";
    }
}
