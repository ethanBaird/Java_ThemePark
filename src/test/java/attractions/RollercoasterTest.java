package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void allowsVisitorOver145AndOver12() {
        Visitor over145over12 = new Visitor(13,146, 20);
        boolean actual = rollerCoaster.isAllowedTo(over145over12);
        assertTrue(actual);
    }
    @Test
    public void doesNotAllowVisitorUnder145() {
        Visitor over145under12 = new Visitor(13,146, 20);
        boolean actual = rollerCoaster.isAllowedTo(over145under12);
        assertFalse(actual);
    }
    @Test
    public void doesNotAllowVisitorUnder145AndOver12() {
        Visitor under145over12 = new Visitor(13,146, 20);
        boolean actual = rollerCoaster.isAllowedTo(under145over12);
        assertFalse(actual);
    }

}
