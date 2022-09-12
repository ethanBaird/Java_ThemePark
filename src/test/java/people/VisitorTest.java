package people;

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
        assertEquals(200, visitor.getHeight(), 0.1);
    }

    @Test
    public void hasMoney() {
        assertEquals(40.0, visitor.getMoney(), 0.1);
    }


//    @Test
//    public void canVisitAttraction(){
//        RollerCoaster rollerCoaster = new RollerCoaster("Big Dipper", 5);
//        visitor.visitAttraction(rollerCoaster);
//        boolean actualAllowed = rollerCoaster.isAllowedTo(visitor);
//        double actualMoney = visitor.getMoney();
//        assertTrue(actualAllowed);
//        assertEquals(31.6, actualMoney, 0.0);
//
//    }
//    @Test
//    public void chargesDoubleForOver200Tall(){
//        Visitor over200 = new Visitor(18,210,20);
//    }
}
