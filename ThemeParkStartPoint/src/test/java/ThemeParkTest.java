import attractions.Attraction;
import attractions.Dodgems;
import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.IceCreamStall;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;

    @Before
    public void before(){
        themePark = new ThemePark();
    }

    @Test
    public void canAddAttraction(){
        RollerCoaster rollerCoaster = new RollerCoaster("ScaryCoaster", 5);
        themePark.addAttraction(rollerCoaster);
        assertEquals(1, themePark.numberOfAttractions());
    }

    @Test
    public void canCheckForReviewedAttractions(){
        RollerCoaster rollerCoaster = new RollerCoaster("ScaryCoaster", 5);
        Dodgems dodgems = new Dodgems("ScaryDogems", 3);
        themePark.addAttraction(rollerCoaster);
        themePark.addAttraction(dodgems);
        assertEquals(2, themePark.getAllReviewed().size());
        assertEquals(true, themePark.getAllReviewed().contains(dodgems));
        assertEquals(true, themePark.getAllReviewed().contains(rollerCoaster));
    }

    @Test
    public void canImplementVisitFunction(){
        RollerCoaster rollerCoaster = new RollerCoaster("ScaryCoaster", 5);
        Visitor visitor = new Visitor(22, 230, 21.00);
        assertEquals(0, rollerCoaster.getVisitCount());
        assertEquals(0, visitor.numberOfAttractionsVisited());
        themePark.visit(visitor, rollerCoaster);
        assertEquals(1, rollerCoaster.getVisitCount());
        assertEquals(1, visitor.numberOfAttractionsVisited());
    }

}
