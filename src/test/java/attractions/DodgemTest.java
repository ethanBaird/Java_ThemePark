package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);
    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void chargesDefaultPriceToOver12(){
        Visitor over12 = new Visitor(13,100,10);
        double actual = dodgems.priceFor(over12);
        assertEquals(4.50, actual, 0.0);
    }

    @Test
    public void chargesHalfForUnder12(){
        Visitor under12 = new Visitor(11, 100, 10);
        double actual = dodgems.priceFor(under12);
        assertEquals(2.25, actual, 0.0);
    }
}
