package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void allowsVisitorOver18() {
        Visitor over18 = new Visitor(19,10,10);
        boolean actual = tobaccoStall.isAllowedTo(over18);
        assertTrue(actual);
    }

    @Test
    public void doesNotAllowVisitorUnder18() {
        Visitor under18 = new Visitor(17,10,10);
        boolean actual = tobaccoStall.isAllowedTo(under18);
        assertFalse(actual);
    }

    @Test
    public void allowsVisitorExactly18(){
        Visitor exactly18 = new Visitor(18,10,10);
        actual = tobaccoStall.isAllowedTo(exactly18)
    }
}
