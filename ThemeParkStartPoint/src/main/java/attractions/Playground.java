package attractions;

import behaviours.ISecurity;
import people.Visitor;

public class Playground extends Attraction implements ISecurity {

    public Playground(String name, int rating) {
        super(name, rating);
    }

    @Override
    public boolean isAllowed(Visitor vistior) {
        if(vistior.getAge() > 15){
            return false;
        }
        return true;
    }


}
