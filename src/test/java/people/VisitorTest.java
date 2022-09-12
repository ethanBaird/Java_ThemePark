package people;

import attractions.Attraction;
import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class VisitorTest {

    Visitor visitor;

    @Before
    public void before(){
        visitor = new Visitor(14, 120, 40.0);
    }

    @Test
    public void hasAge() {
        assertEquals(14, visitor.getAge());
    }

    @Test
    public void hasHeight() {
        assertEquals(120, visitor.getHeight(), 0.1);
    }

    @Test
    public void hasMoney() {
        assertEquals(40.0, visitor.getMoney(), 0.1);
    }


    @Test
    public void canVisitAttraction(){
        RollerCoaster rollerCoaster = new RollerCoaster("Big Dipper", 5);
        visitor.visitAttraction(rollerCoaster);
        int actual = visitor.getVisitedAttractionsCount();
        assertEquals(1, actual);

    }

}
