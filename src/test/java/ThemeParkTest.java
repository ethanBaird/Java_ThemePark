import attractions.Attraction;
import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;

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

}
