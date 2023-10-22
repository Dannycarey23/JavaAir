import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    Flight flight;
    Pilot pilot;
    CabinCrewMember cabinCrewMember;
    CabinCrewMember cabinCrewMember1;
    Passenger passenger;
    Passenger passenger1;
    Plane plane;
    ArrayList<Pilot> pilots;
    ArrayList<CabinCrewMember> cabinCrew;
    ArrayList<Passenger> bookedPassengers;

    @Before
    public void before(){
        flight = new Flight(plane,"ASOFAI123","Kings Landing","Winterfell","10am");
        pilot = new Pilot("Eddard", PilotRank.CAPTAIN, "STARK1");
        cabinCrewMember = new CabinCrewMember("Sansa", CabinCrewRank.TRAINEE);
        cabinCrewMember1 = new CabinCrewMember("Jon", CabinCrewRank.ATTENDANT);
        passenger = new Passenger("Tyrion", 2);
        passenger1 = new Passenger("Jamie", 3);
        plane = new Plane(PlaneType.BIZJET, 20, 50);
        bookedPassengers = new ArrayList<Passenger>();
        cabinCrew = new ArrayList<CabinCrewMember>();
        pilots = new ArrayList<Pilot>();

    }

    @Test
    public void checkPlaneCapacity(){
        assertEquals(20, plane.getCapacity());
    }

    @Test
    public void checkIfAnyPassengersAreBookedOnTheFLight(){
        assertEquals(0, bookedPassengers.size());
    }

    @Test
    public void addPassengerToPlane(){
        bookedPassengers.add(passenger);
        assertEquals(1, bookedPassengers.size());
    }

    @Test
    public void checkHowManyCabinCrewAreAssigned(){
        assertEquals(0, cabinCrew.size());
    }

    @Test
    public void addCabinCrew(){
        cabinCrew.add(cabinCrewMember);
        cabinCrew.add(cabinCrewMember1);
        assertEquals(2, cabinCrew.size());
    }

    @Test
    public void checkHowManyPilotsAreAssigned(){
        assertEquals(0, pilots.size());
    }

    @Test
    public void addPilot(){
        pilots.add(pilot);
        assertEquals(1, pilots.size());
    }
}
