package stalls;

import behaviours.ISecurity;
import people.Visitor;

public class TobaccoStall extends Stall implements ISecurity {

    public TobaccoStall(String name, String ownerName, ParkingSpot parkingSpot) {
        super(name, ownerName, parkingSpot);
    }

    @Override
    public boolean isAllowed(Visitor vistior) {
        if(vistior.getAge() >= 18){
            return true;
        }
        return false;
    }
}
