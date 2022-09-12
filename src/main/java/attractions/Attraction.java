package attractions;

import interfaces.IReview;
import interfaces.ISecure;
import interfaces.ITicket;
import people.Visitor;

public abstract class Attraction implements IReview, ISecure {
    private String name;
    private int rating;
    private int visitCount;

    public Attraction(String name, int rating) {
        this.name = name;
        this.rating = rating;
        this.visitCount = 0;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public int getVisitCount() {
        return visitCount;
    }

    public void setVisitCount(int i) {
        this.visitCount = i;
    }

    public boolean isAllowedFor(Visitor visitor){
        return true;
    }
}
