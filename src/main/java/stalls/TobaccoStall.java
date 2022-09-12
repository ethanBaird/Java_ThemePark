package stalls;

import interfaces.ISecure;
import people.Visitor;

public class TobaccoStall extends Stall implements ISecure {

    public TobaccoStall(String name, int rating, String ownerName, ParkingSpot parkingSpot) {
        super(name, rating, ownerName, parkingSpot);
    }

    @Override
    public boolean isAllowedFor(Visitor visitor) {
        return visitor.getAge() >= 18;
    }
}
