public class FlightManager {

    public double calculateRemainingFlightWeight(Flight flight){
        double remainingFlightWeight = flight.getTotalWeightFlightAllowance() - (flight.getTotalWeightBaggage() + flight.getTotalWeightPassengers() + flight.getTotalWeightCargo());
        return remainingFlightWeight;
    }
}
