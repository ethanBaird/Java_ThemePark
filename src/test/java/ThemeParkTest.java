import attractions.Attraction;
import attractions.Playground;
import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.ParkingSpot;
import stalls.Stall;
import stalls.TobaccoStall;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    private ThemePark themePark;

    @Before
    public void before(){
        themePark = new ThemePark();
    }

    @Test
    public void canReceiveVisit(){
        Attraction attraction = new RollerCoaster("Big Dipper", 5);
        Visitor visitor = new Visitor(18,180,20);
        themePark.visit(visitor, attraction);
        int actualVisitCount = attraction.getVisitCount();
        int actualVisitedAttractionCount = visitor.getVisitedAttractionsCount();
        assertEquals(1, actualVisitCount);
        assertEquals(1, actualVisitedAttractionCount);
    }

    @Test
    public void canGetAllReviews(){
        ArrayList<Attraction> attractions = new ArrayList<>();
        Attraction attraction = new RollerCoaster("Big Dipper", 5);
        attractions.add(attraction);
        themePark.setAttractions(attractions);

        int actual = themePark.getAllRatings().size();
        assertEquals(1, actual);
    }

    @Test
    public void canGetAllAllowedFor(){
        ArrayList<Attraction> attractions = new ArrayList<>();
        ArrayList<Stall> stalls = new ArrayList<>();

        // Visitor is allowed Playground and Rollercoaster but NOT Tobacco Stall
        Visitor visitor = new Visitor(16,180,20);

        RollerCoaster rollerCoaster = new RollerCoaster("Big Dipper", 5);
        Playground playground = new Playground("Pirate Island", 3);
        TobaccoStall tobaccoStall = new TobaccoStall("VAPELYF", 3, "Ethan", ParkingSpot.A1);

        attractions.add(rollerCoaster);
        attractions.add(playground);
        stalls.add(tobaccoStall);


        themePark.setAttractions(attractions);
        themePark.setStalls(stalls);

        int actualAllowed = themePark.getAllAllowedFor(visitor).size();

        assertEquals(2, actualAllowed);
    }
}
