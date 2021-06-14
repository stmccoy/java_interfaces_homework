package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor;

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
    public void canCheckHeightTrue(){
        visitor = new Visitor(18, 150, 12.00);
        assertEquals(true, rollerCoaster.isAllowed(visitor));
    }

    @Test
    public void canCheckHeightFalse(){
        visitor = new Visitor(17, 140, 12.00);
        assertEquals(false, rollerCoaster.isAllowed(visitor));
    }

    @Test
    public void canChargeDoubleForTall(){
        visitor = new Visitor(18, 210, 12.00);
        assertEquals(16.80, rollerCoaster.priceFor(visitor),0.00);
    }

    @Test
    public void canNotChallengeDoubleForTall(){
        visitor = new Visitor(17, 200, 12.00);
        assertEquals(8.40, rollerCoaster.priceFor(visitor), 0.00);
    }
}
