import attractions.Attraction;
import behaviours.IReviewed;
import people.Visitor;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<Attraction> attractions;

    public ThemePark(){
        attractions = new ArrayList<>();
    }

    public void addAttraction(Attraction attraction){
        this.attractions.add(attraction);
    }

    public int numberOfAttractions(){
        return this.attractions.size();
    }

    public ArrayList<IReviewed> getAllReviewed(){
        ArrayList<IReviewed> reviewedAttractions = new ArrayList<>();
        if(this.attractions.size() != 0){
            for (Attraction attraction : this.attractions){
                if(attraction instanceof IReviewed){
                    reviewedAttractions.add(attraction);
                }
            }
        }
        return reviewedAttractions;
    }

    public void visit(Visitor visitor, Attraction attraction){
        visitor.addAttraction(attraction);
        attraction.increaseVisitCount(1);
    }
}
