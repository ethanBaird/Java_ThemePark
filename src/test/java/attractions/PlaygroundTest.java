package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class PlaygroundTest {
    Playground playground;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void allowsVisitorOver15(){
        Visitor oldVisitor = new Visitor(16, 10, 20);
        boolean actual = playground.isAllowedTo(oldVisitor);
        assertTrue(actual);
    }

    @Test
    public void wontAllowVisitorUnder15() {
        Visitor youngVisitor = new Visitor(14,9,10);
        boolean actual = playground.isAllowedTo(youngVisitor);
        assertFalse(actual);
    }

    @Test
    public void allowsVisitorExactlyFifteen() {
        Visitor fifteenVisitor = new Visitor(15,10,20);
        boolean actual = playground.isAllowedTo(fifteenVisitor);
        assertTrue(actual);
    }
}
