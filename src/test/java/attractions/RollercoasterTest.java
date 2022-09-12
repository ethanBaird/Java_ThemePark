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
    public void doesNotAllowVisitorUnder12() {
        Visitor over145under12 = new Visitor(11,146, 20);
        boolean actual = rollerCoaster.isAllowedTo(over145under12);
        assertFalse(actual);
    }
    @Test
    public void doesNotAllowVisitorUnder145() {
        Visitor under145over12 = new Visitor(13,144, 20);
        boolean actual = rollerCoaster.isAllowedTo(under145over12);
        assertFalse(actual);
    }

    @Test
    public void chargesDefaultPriceForUnder200Tall(){
        Visitor under200 = new Visitor(16, 140, 20);
        double actual = rollerCoaster.priceFor(under200);
        assertEquals(8.40, actual, 0.0);
    }

    @Test
    public void chargesDoubleForOver200Tall() {
        Visitor over200 = new Visitor(16, 210, 20);
        double actual = rollerCoaster.priceFor(over200);
        assertEquals(16.80, actual, 0.0);
    }
}
