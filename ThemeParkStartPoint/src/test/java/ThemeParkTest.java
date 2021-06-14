import attractions.Dodgems;
import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;
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

}
