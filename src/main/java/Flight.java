import java.util.ArrayList;

public class Flight {

private ArrayList<Pilot> pilots;
private ArrayList<CabinCrewMember> cabinCrew;
private ArrayList<Passenger> bookedPassengers;
private Plane plane;
private String flightNumber;
private String destination;
private String departureAirport;
private String departureTime;

public Flight(Plane plane, String flightNumber, String destination, String departureAirport, String departureTime){
    this.pilots = new ArrayList<Pilot>();
    this.cabinCrew = new ArrayList<CabinCrewMember>();
    this.bookedPassengers = new ArrayList<Passenger>();
    this.plane = plane;
    this.flightNumber = flightNumber;
    this.destination = destination;
    this.departureAirport = departureAirport;
    this.departureTime = departureTime;
    }
}
