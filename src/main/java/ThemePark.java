import attractions.Attraction;
import interfaces.IReview;
import interfaces.ISecure;
import people.Visitor;
import stalls.Stall;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class ThemePark {

    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;

    public ThemePark() {
        this.attractions = new ArrayList<>();
        this.stalls = new ArrayList<>();
    }

    public void setAttractions(ArrayList<Attraction> attractions) {
        this.attractions = attractions;
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

    public HashMap<String, Integer> getAllRatings(){
        HashMap<String, Integer> allRatings = new HashMap<>();

        ArrayList<IReview> allReviewed = getAllReviewed();
        for (IReview iReview: allReviewed){
            allRatings.put(iReview.getName(), iReview.getRating());
        }

        return allRatings;
    }

    public void setStalls(ArrayList<Stall> stalls) {
        this.stalls = stalls;
    }

    public ArrayList<ISecure> getAllAllowedFor(Visitor visitor) {
        ArrayList<ISecure> allAllowed = new ArrayList<>();

        for (Attraction attraction: this.attractions){
            if (attraction.isAllowedFor(visitor)){
                allAllowed.add(attraction);
            }
        }
        for (Stall stall: this.stalls){
            if (stall.isAllowedFor(visitor)){
                allAllowed.add(stall);
            }
        }
        return allAllowed;
    }
}
