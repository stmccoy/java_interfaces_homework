package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity, ITicketed {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    @Override
    public boolean isAllowed(Visitor vistior) {
        if(vistior.getHeight() < 145){
            return false;
        }
        return true;
    }


    @Override
    public double defaultPrice() {
        return 8.40;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if(visitor.getHeight() > 200){
            return defaultPrice() * 2;
        }
        return defaultPrice();
    }
}
