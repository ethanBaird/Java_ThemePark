import attractions.Attraction;
import interfaces.IReview;
import people.Visitor;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;

    public ThemePark() {
        this.attractions = new ArrayList<>();
        this.stalls = new ArrayList<>();
    }

    public ArrayList<IReview> getAllReviewed(){
        ArrayList<IReview> allReviewed = new ArrayList<>();
        allReviewed.addAll(attractions);
        allReviewed.addAll(stalls);
        return allReviewed;
    }

    public void visit(Visitor visitor, Attraction attraction){
        int currentCount = attraction.getVisitCount();
        attraction.setVisitCount(currentCount + 1);

        visitor.visitAttraction(attraction);
    }
}
