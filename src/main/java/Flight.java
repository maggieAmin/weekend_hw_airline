import java.util.ArrayList;

public class Flight {
    private String pilot;
    private int capacity;
    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private ArrayList<Passenger> passengers;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;
    private int totalWeightBaggage;
    private int totalWeightPassengers;
    private int totalWeightCargo;
    private double totalWeightFlightAllowance;

    public Flight(String pilot, int capacity, ArrayList<CabinCrewMember> cabinCrewMembers, ArrayList<Passenger> passengers, String flightNumber, String destination, String departureAirport, String departureTime, int totalWeightBaggage, int totalWeightPassengers, int totalWeightCargo, double totalWeightFlightAllowance) {
        this.pilot = pilot;
        this.capacity = capacity;
        this.cabinCrewMembers = cabinCrewMembers;
        this.passengers = passengers;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.totalWeightBaggage = totalWeightBaggage;
        this.totalWeightPassengers = totalWeightPassengers;
        this.totalWeightCargo = totalWeightCargo;
        this.totalWeightFlightAllowance = totalWeightFlightAllowance;
    }

    public String getPilot() {
        return pilot;
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<CabinCrewMember> getCabinCrewMembers() {
        return cabinCrewMembers;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public int getTotalWeightBaggage() {
        return totalWeightBaggage;
    }

    public int getTotalWeightPassengers() {
        return totalWeightPassengers;
    }

    public int getTotalWeightCargo() {
        return totalWeightCargo;
    }

    public double getTotalWeightFlightAllowance() {
        return totalWeightFlightAllowance;
    }

    public int getNumberOfAvailableSeats() {
        return capacity - passengers.size();
    }

    public int bookAPassenger(Passenger passenger) {
        if (capacity > passengers.size()){
            passengers.add(passenger);
        }
        return passengers.size();
    }
}

