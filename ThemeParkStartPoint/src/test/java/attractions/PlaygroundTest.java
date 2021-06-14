package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Playground playground;
    Visitor visitor;

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
    public void canCheckAgeTrue(){
        visitor = new Visitor(14, 230, 12.00);
        assertEquals(true, playground.isAllowed(visitor));
    }

    @Test
    public void canCheckAgeFalse(){
        visitor = new Visitor(16, 230, 12.00);
        assertEquals(false, playground.isAllowed(visitor));
    }
}
