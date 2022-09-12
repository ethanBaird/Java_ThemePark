package stalls;

import interfaces.IReview;
import interfaces.ISecure;
import people.Visitor;

public abstract class Stall implements IReview, ISecure {

    private String name;
    private int rating;
    private String ownerName;
    private ParkingSpot parkingSpot;

    public Stall(String name, int rating, String ownerName, ParkingSpot parkingSpot) {
        this.name = name;
        this.rating = rating;
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public boolean isAllowedFor(Visitor visitor){
        return true;
    }
}
